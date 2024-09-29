package Week2.main.java.com.mycompany.app.ReusingClasses.RC13;

// Base class with method overloaded three times
class BaseClass {

    // Overloaded methods
    public void display() {
        System.out.println("Display with no arguments");
    }

    public void display(int i) {
        System.out.println("Display with one integer argument: " + i);
    }

    public void display(String s) {
        System.out.println("Display with one String argument: " + s);
    }
}

// Derived class that adds an additional overloaded method
class DerivedClass extends BaseClass {

    // Overloaded method in the derived class
    public void display(double d) {
        System.out.println("Display with one double argument: " + d);
    }
}

public class Main {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();

        // Call all four overloaded methods
        obj.display();             // Calls BaseClass.display()
        obj.display(10);           // Calls BaseClass.display(int)
        obj.display("Hello");      // Calls BaseClass.display(String)
        obj.display(5.5);          // Calls DerivedClass.display(double)
    }
}
