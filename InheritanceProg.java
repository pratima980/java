class Base {  // Class name should start with uppercase
    public void show() {
        System.out.println("Base class method");
    }
}

public class InheritanceProg extends Base {  // File should be named InheritanceProg.java
    public void showing() {
        System.out.println("InheritanceProg class method");
    }

    public static void main(String[] args) {  // Properly defined main method
        InheritanceProg obj = new InheritanceProg();
        obj.show();     // Calls method from base class
        obj.showing();  // Calls method from derived class
    }
}
