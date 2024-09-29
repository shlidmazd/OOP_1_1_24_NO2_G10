package Week2.main.java.com.mycompany.app.Interfaces.I2;

// Abstract class without any abstract methods
abstract class Animal {
    public void sound() {
        System.out.println("This is an animal sound.");
    }
}

// Derived class from the abstract class
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

// Main class to test the behavior
public class Main {
    public static void main(String[] args) {
        // Attempt to create an instance of the abstract class
        // Animal animal = new Animal(); // This will cause a compile-time error

        // Create an instance of the derived class
        Dog dog = new Dog();
        dog.sound();
    }
}