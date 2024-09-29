package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC1;

class Example {
    // Uninitialized String reference
    String uninitializedString;

    // Method to display the value of the uninitializedString
    void displayString() {
        if (uninitializedString == null) {
            System.out.println("The uninitializedString is null.");
        } else {
            System.out.println("The uninitializedString is: " + uninitializedString);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Example class
        Example example = new Example();

        // Display the value of the uninitializedString
        example.displayString(); // This will show that it is null
    }
}
