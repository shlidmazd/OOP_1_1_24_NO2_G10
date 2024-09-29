package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC10;

class Example {
    // Finalize method that prints a message
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("finalize() method called.");
        } finally {
            super.finalize();  // Call the superclass finalize method
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of Example class
        Example example = new Example();
        
        // Set the object reference to null, making it eligible for garbage collection
        example = null;

        // Request garbage collection (this doesn't guarantee immediate collection)
        System.gc();
        
        // Wait for a while to give the garbage collector time to run
        System.out.println("Main method ends.");
    }
}

