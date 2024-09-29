package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC6;

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

    // Overloaded bark method with two arguments: int and double
    void bark(int times, double volume) {
        System.out.println("The dog is barking " + times + " times at a volume of " + volume + " decibels!");
    }

    // Overloaded bark method with two arguments: double and int (reversed order)
    void bark(double volume, int times) {
        System.out.println("The dog is barking " + times + " times at a volume of " + volume + " decibels!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Dog object
        Dog dog = new Dog();

        // Call the different overloaded bark methods
        dog.bark();                             // No-argument method
        dog.bark(3);                            // int argument method
        dog.bark(75.5);                         // double argument method
        dog.bark(true);                         // boolean argument method
        dog.bark('A');                          // char argument method
        dog.bark(3, 60.0);                      // int, double argument method
        dog.bark(70.5, 5);                      // double, int argument method (reversed order)
    }
}
