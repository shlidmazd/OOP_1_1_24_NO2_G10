package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC12;

class Tank implements AutoCloseable {
    private boolean isEmpty;  // True if the tank is empty, false if it's filled

    // Constructor to initialize the tank
    Tank() {
        isEmpty = false;  // Tank is filled by default
        System.out.println("Tank created. It is filled.");
    }

    // Method to fill the tank
    void fill() {
        isEmpty = false;
        System.out.println("Tank filled.");
    }

    // Method to empty the tank
    void empty() {
        isEmpty = true;
        System.out.println("Tank emptied.");
    }

    // Finalize method to check termination condition (for demonstration)
    @Override
    protected void finalize() throws Throwable {
        if (!isEmpty) {
            System.out.println("Error: Tank was not empty when finalized!");
        } else {
            System.out.println("Tank is properly empty when finalized.");
        }
        super.finalize();
    }

    // Proper cleanup using AutoCloseable's close() method
    @Override
    public void close() {
        if (!isEmpty) {
            System.out.println("Warning: Tank is being cleaned up while still filled.");
            empty();  // Force emptying the tank
        } else {
            System.out.println("Tank is properly cleaned up while empty.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Test case 1: Proper use of the Tank (it is emptied before cleanup)
        System.out.println("Test Case 1: Proper Cleanup");
        try (Tank tank1 = new Tank()) {
            tank1.fill();
            tank1.empty();  // Emptied before leaving the try block
        }  // close() method ensures proper cleanup

        // Test case 2: Improper use of the Tank (it is not emptied before cleanup)
        System.out.println("\nTest Case 2: Improper Cleanup");
        try (Tank tank2 = new Tank()) {
            tank2.fill();  // Not emptied before cleanup
        }  // close() will automatically empty the tank and show the warning

        // Test case 3: Testing the finalize method (not recommended, just for demonstration)
        System.out.println("\nTest Case 3: Testing Finalize (May or may not show based on GC)");
        Tank tank3 = new Tank();
        tank3.fill();  // Not emptied before nullifying
        tank3 = null;  // Makes the tank eligible for garbage collection
        System.gc();   // Request garbage collection (not guaranteed to run immediately)
        System.out.println("End of main method.");
    }
}

