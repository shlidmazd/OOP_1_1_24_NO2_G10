package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC7;

class Dog {
    // No constructor is explicitly defined here, so Java will automatically provide a default constructor.
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog myDog = new Dog(); // The default constructor is automatically called

        // Print a confirmation message
        System.out.println("A Dog object has been created using the default constructor.");
    }
}

