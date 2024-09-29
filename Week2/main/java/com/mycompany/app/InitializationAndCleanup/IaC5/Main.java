package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC5;

class Dog {
    // Overloaded bark method with no arguments
    void bark() {
        System.out.println("The dog is barking!");
    }

    // Overloaded bark method with an int argument
    void bark(int times) {
        System.out.println("The dog is barking " + times + " times!");
    }

    // Overloaded bark method with a double argument
    void bark(double volume) {
        System.out.println("The dog is barking at a volume of " + volume + " decibels!");
    }

    // Overloaded bark method with a boolean argument
    void bark(boolean isHowling) {
        if (isHowling) {
            System.out.println("The dog is howling!");
        } else {
            System.out.println("The dog is barking!");
        }
    }

    // Overloaded bark method with a char argument
    void bark(char pitch) {
        System.out.println("The dog is barking with pitch: " + pitch);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Dog object
        Dog dog = new Dog();

        // Call the different overloaded bark methods
        dog.bark();                    // Calls the no-argument bark method
        dog.bark(3);                   // Calls the bark method with int argument
        dog.bark(75.5);                // Calls the bark method with double argument
        dog.bark(true);                // Calls the bark method with boolean argument (howling)
        dog.bark(false);               // Calls the bark method with boolean argument (barking)
        dog.bark('A');                 // Calls the bark method with char argument
    }
}
