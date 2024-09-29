package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC15;

class Example {
    String message;  // String field to be initialized

    // Instance initializer block
    {
        message = "Hello from instance initializer!";
        System.out.println("Instance initializer block executed.");
    }

    // Constructor (optional, but included for completeness)
    Example() {
        System.out.println("Constructor called.");
    }

    // Method to print the message
    void printMessage() {
        System.out.println("Message: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of Example class
        Example example = new Example();
        
        // Print the initialized message
        example.printMessage();
    }
}

