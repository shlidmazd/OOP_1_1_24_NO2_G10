package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC17;

class Example {
    // Constructor that takes a String argument
    Example(String message) {
        System.out.println("Constructor called with message: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array of object references to the Example class
        Example[] examples = new Example[5];  // Array of 5 object references
        
        // Print the array to show that no objects have been created yet
        System.out.println("Array of Example object references created, but no objects are instantiated yet.");
        
        // Check if the objects are null (because no objects have been assigned)
        for (int i = 0; i < examples.length; i++) {
            System.out.println("examples[" + i + "] = " + examples[i]);
        }
        
        // Now, create objects and assign them to the array
        System.out.println("\nCreating objects and assigning them to the array:");
        for (int i = 0; i < examples.length; i++) {
            examples[i] = new Example("Message " + (i + 1));  // Constructor is called here
        }
    }
}

