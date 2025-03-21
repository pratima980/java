import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CRUDApp {
    private JFrame frame;
    private JTable table;
    private DefaultTableModel model;
    private JTextField nameField, ageField;
    private Connection conn;

    public CRUDApp() {
        connectDB();
        initUI();
        loadData();
    }

    private void connectDB() {
        String url = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String password = "root";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL JDBC driver
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Database Connected Successfully!");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Database connection failed!");
            e.printStackTrace();
        }
    }

    private void initUI() {
        frame = new JFrame("CRUD Application");
        frame.setLayout(new BorderLayout());
        
        // Form Panel
        JPanel formPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        formPanel.add(new JLabel("Name:")); 
        nameField = new JTextField(); 
        formPanel.add(nameField);
        
        formPanel.add(new JLabel("Age:")); 
        ageField = new JTextField(); 
        formPanel.add(ageField);
        
        JButton addButton = new JButton("Add");
        addButton.addActionListener(e -> addRecord());
        formPanel.add(addButton);
        
        frame.add(formPanel, BorderLayout.NORTH);
        
        // Table Panel
        model = new DefaultTableModel(new String[]{"ID", "Name", "Age"}, 0);
        table = new JTable(model);
        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void loadData() {
        model.setRowCount(0);
        if (conn == null) {
            System.err.println("Database connection is not established!");
            return;
        }
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT * FROM users")) {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt("id"), rs.getString("name"), rs.getInt("age")});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void addRecord() {
        if (conn == null) {
            System.err.println("Database connection is not established!");
            return;
        }
        try (PreparedStatement pst = conn.prepareStatement("INSERT INTO users (name, age) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS)) {
            pst.setString(1, nameField.getText());
            pst.setInt(2, Integer.parseInt(ageField.getText()));
            pst.executeUpdate();
            loadData();
            nameField.setText("");
            ageField.setText("");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CRUDApp::new);
    }
}