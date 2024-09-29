package Week2.main.java.com.mycompany.app.Polymorphism.P14;

// Shared class with reference counting
class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating Shared " + id);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Disposing Shared " + id);
        }
    }

    public String toString() {
        return "Shared " + id;
    }
}

// Base class: Rodent
abstract class Rodent {
    protected String name;
    private Tail tail = new Tail();  // Member object of base class
    private Shared shared;

    public Rodent(String name, Shared shared) {
        this.name = name;
        this.shared = shared;
        shared.addRef();
        System.out.println("Rodent constructor: " + name);
    }

    // Common methods for all rodents
    public abstract void makeSound();
    public abstract void move();
    public abstract void eat();

    // Dispose method to clean up references
    protected void dispose() {
        System.out.println("Disposing " + name);
        shared.dispose();
    }
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

    public Mouse(String name, Shared shared) {
        super(name, shared);
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

    public Gerbil(String name, Shared shared) {
        super(name, shared);
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

    public Hamster(String name, Shared shared) {
        super(name, shared);
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
        // Create a shared object
        Shared shared = new Shared();

        // Create an array of Rodent objects with the shared object
        Rodent[] rodents = {
            new Mouse("Mickey", shared),
            new Gerbil("Gerry", shared),
            new Hamster("Hammy", shared)
        };

        // Call base-class methods for each rodent
        for (Rodent rodent : rodents) {
            rodent.makeSound();
            rodent.move();
            rodent.eat();
            System.out.println("---------------------");
        }

        // Dispose all rodents to release the shared object
        for (Rodent rodent : rodents) {
            rodent.dispose();
        }

        // Request garbage collection (optional, not guaranteed to run immediately)
        System.gc();
    }
}
