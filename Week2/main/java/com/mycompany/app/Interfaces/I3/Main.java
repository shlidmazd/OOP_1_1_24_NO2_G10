package Week2.main.java.com.mycompany.app.Interfaces.I3;

// Base class
abstract class Base {
    public Base() {
        System.out.println("Base constructor: calling print() method");
        print();  // Calls the overridden method
    }

    // Abstract method
    public abstract void print();
}

// Derived class
class Derived extends Base {
    private int number = 42;  // Initialized to a non-zero value

    public Derived() {
        System.out.println("Derived constructor: number = " + number);
    }

    @Override
    public void print() {
        System.out.println("Derived print() method: number = " + number);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        System.out.println("Creating Derived object...");
        Derived d = new Derived();
        
        System.out.println("Calling print() explicitly...");
        d.print();  // Calling print() after full construction
    }
}