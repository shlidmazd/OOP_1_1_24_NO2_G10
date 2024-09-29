package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC8;

class Example {
    // First method that calls the second method
    void firstMethod() {
        System.out.println("In firstMethod, calling secondMethod without 'this':");
        secondMethod();  // Calling second method without 'this'

        System.out.println("In firstMethod, calling secondMethod using 'this':");
        this.secondMethod();  // Calling second method using 'this'
    }

    // Second method that gets called by firstMethod
    void secondMethod() {
        System.out.println("In secondMethod.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Example class
        Example example = new Example();

        // Call the first method
        example.firstMethod();  // This will internally call the second method twice
    }
}
