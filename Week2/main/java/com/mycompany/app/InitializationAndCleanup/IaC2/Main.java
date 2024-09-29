package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC2;

class Example {
    // Field initialized at the point of definition
    String initializedAtDefinition = "Initialized at definition";

    // Field initialized by the constructor
    String initializedByConstructor;

    // Constructor to initialize the second field
    Example(String value) {
        this.initializedByConstructor = value;
    }

    // Method to display both fields
    void displayFields() {
        System.out.println("Field initialized at definition: " + initializedAtDefinition);
        System.out.println("Field initialized by constructor: " + initializedByConstructor);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Example with constructor-initialized value
        Example example = new Example("Initialized by constructor");

        // Display both field values
        example.displayFields();
    }
}
