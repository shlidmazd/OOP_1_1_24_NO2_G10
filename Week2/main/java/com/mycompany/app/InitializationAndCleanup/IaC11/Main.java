package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC11;

class Example implements AutoCloseable {
    // Constructor to simulate resource allocation
    Example() {
        System.out.println("Object created.");
    }

    // The close() method simulates finalization or resource cleanup
    @Override
    public void close() {
        System.out.println("close() method called. Cleanup done.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Use try-with-resources to ensure cleanup
        try (Example example = new Example()) {
            System.out.println("Using the Example object.");
        }  // The close() method is automatically called here when exiting the try block

        System.out.println("Main method ends.");
    }
}

