package Week2.main.java.com.mycompany.app.Interfaces.I4;

// Abstract base class with an abstract method
abstract class Base {
    // Abstract method declared in the base class
    public abstract void derivedMethod();
}

// Derived class that overrides the abstract method
class Derived extends Base {
    @Override
    public void derivedMethod() {
        System.out.println("Method in Derived class called.");
    }
}

// Main class to demonstrate calling without downcasting
public class Main {
    // Static method that accepts Base reference and directly calls the method
    public static void callDerivedMethod(Base baseRef) {
        baseRef.derivedMethod();  // No need for downcasting
    }

    public static void main(String[] args) {
        // Create an instance of Derived and pass it as a Base reference
        Base base = new Derived();
        
        // Call the static method
        callDerivedMethod(base);  // No downcasting needed
    }
}