package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC18;

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

        // Print the array before creating objects to show that no objects have been created yet
        System.out.println("Array of Example object references created, but no objects instantiated yet.");
        for (int i = 0; i < examples.length; i++) {
            System.out.println("examples[" + i + "] = " + examples[i]);
        }
        
        // Now, create objects and assign them to the array
        System.out.println("\nCreating objects and assigning them to the array:");
        for (int i = 0; i < examples.length; i++) {
            examples[i] = new Example("Message " + (i + 1));  // Constructor is called here
        }

        // Print the array after creating objects to show that they are now initialized
        System.out.println("\nArray after object creation:");
        for (int i = 0; i < examples.length; i++) {
            System.out.println("examples[" + i + "] = " + examples[i]);
        }
    }
}