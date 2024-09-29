package Week2.main.java.com.mycompany.app.Polymorphism.P12;

// Base class: Rodent
abstract class Rodent {
    protected String name;
    private Tail tail = new Tail();  // Member object of base class

    public Rodent(String name) {
        this.name = name;
        System.out.println("Rodent constructor: " + name);
    }

    // Common methods for all rodents
    public abstract void makeSound();
    public abstract void move();
    public abstract void eat();
}

// Member class for all rodents
class Tail {
    public Tail() {
        System.out.println("Tail initialized");
    }
}

// Derived class: Mouse
class Mouse extends Rodent {
    private Whiskers whiskers = new Whiskers();  // Member object of derived class

    public Mouse(String name) {
        super(name);
        System.out.println("Mouse constructor: " + name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " squeaks!");
    }

    @Override
    public void move() {
        System.out.println(name + " scurries around quickly.");
    }

    @Override
    public void eat() {
        System.out.println(name + " nibbles on cheese.");
    }
}

// Derived class: Gerbil
class Gerbil extends Rodent {
    private Whiskers whiskers = new Whiskers();  // Member object of derived class

    public Gerbil(String name) {
        super(name);
        System.out.println("Gerbil constructor: " + name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps!");
    }

    @Override
    public void move() {
        System.out.println(name + " hops around energetically.");
    }

    @Override
    public void eat() {
        System.out.println(name + " chews on seeds.");
    }
}

// Derived class: Hamster
class Hamster extends Rodent {
    private Whiskers whiskers = new Whiskers();  // Member object of derived class

    public Hamster(String name) {
        super(name);
        System.out.println("Hamster constructor: " + name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes little clicks!");
    }

    @Override
    public void move() {
        System.out.println(name + " runs on its wheel.");
    }

    @Override
    public void eat() {
        System.out.println(name + " snacks on pellets.");
    }
}

// Another member class for derived rodents
class Whiskers {
    public Whiskers() {
        System.out.println("Whiskers initialized");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an array of Rodent objects
        Rodent[] rodents = {
            new Mouse("Mickey"),
            new Gerbil("Gerry"),
            new Hamster("Hammy")
        };

        // Call base-class methods for each rodent
        for (Rodent rodent : rodents) {
            rodent.makeSound();
            rodent.move();
            rodent.eat();
            System.out.println("---------------------");
        }
    }
}