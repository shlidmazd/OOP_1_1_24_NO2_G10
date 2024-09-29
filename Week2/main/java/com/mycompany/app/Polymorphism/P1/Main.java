package Week2.main.java.com.mycompany.app.Polymorphism.P1;

// Base class Cycle
class Cycle {
    public void ride() {
        System.out.println("Riding a Cycle");
    }
}

// Subclass Unicycle
class Unicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a Unicycle");
    }
}

// Subclass Bicycle
class Bicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a Bicycle");
    }
}

// Subclass Tricycle
class Tricycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a Tricycle");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of each subclass
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        // Upcast each subclass instance to Cycle type
        Cycle cycle1 = unicycle;  // Upcasting Unicycle to Cycle
        Cycle cycle2 = bicycle;   // Upcasting Bicycle to Cycle
        Cycle cycle3 = tricycle;  // Upcasting Tricycle to Cycle

        // Call the ride() method on each upcasted instance
        cycle1.ride();  // Calls Unicycle's ride() method
        cycle2.ride();  // Calls Bicycle's ride() method
        cycle3.ride();  // Calls Tricycle's ride() method
    }
}