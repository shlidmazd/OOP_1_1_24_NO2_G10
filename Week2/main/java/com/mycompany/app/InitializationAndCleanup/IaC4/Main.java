package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC4;

class Example {
    // Default constructor with no arguments
    Example() {
        System.out.println("Default constructor called!");
    }

    // Overloaded constructor that takes a String argument
    Example(String message) {
        System.out.println("Overloaded constructor called with message: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object using the default constructor
        Example example1 = new Example(); // Calls the default constructor

        // Create an object using the overloaded constructor
        Example example2 = new Example("Hello from the overloaded constructor!"); // Calls the overloaded constructor
    }
}
