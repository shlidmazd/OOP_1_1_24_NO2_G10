package Week2.main.java.com.mycompany.app.Polymorphism.P10;

// Base class
class BaseClass {
    // First method calls the second method
    public void firstMethod() {
        System.out.println("BaseClass: Calling secondMethod from firstMethod");
        secondMethod(); // Calls the second method
    }

    // Second method to be overridden
    public void secondMethod() {
        System.out.println("BaseClass: Inside secondMethod");
    }
}

// Derived class
class DerivedClass extends BaseClass {
    // Override the second method
    @Override
    public void secondMethod() {
        System.out.println("DerivedClass: Overriding secondMethod");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an object of the derived class
        BaseClass obj = new DerivedClass(); // Upcast to base class

        // Call the first method
        obj.firstMethod();
    }
}