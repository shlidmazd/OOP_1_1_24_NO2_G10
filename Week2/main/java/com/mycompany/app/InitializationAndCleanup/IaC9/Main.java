package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC9;

class Example {
    String message;
    int number;

    // First constructor with one argument, calling the second constructor
    Example(String msg) {
        this(msg, 42);  // Calls the second constructor
        System.out.println("First constructor called with message: " + message);
    }

    // Second constructor with two arguments
    Example(String msg, int num) {
        this.message = msg;
        this.number = num;
        System.out.println("Second constructor called with message: " + message + " and number: " + number);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object using the first constructor
        Example example = new Example("Hello from the first constructor");
    }
}

