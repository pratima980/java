import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java"; // Change 'testdb' to your database name
        String user = "root";  // Change to your MySQL username
        String password = "root"; // Change to your MySQL password

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connection Successful!");

            // Close Connection
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
