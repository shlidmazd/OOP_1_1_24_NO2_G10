package Week2.main.java.com.mycompany.app.Polymorphism.P5;

// Base class Cycle
class Cycle {
    public void ride() {
        System.out.println("Cycle.ride() with " + wheels() + " wheels");
    }

    // This method will be overridden in subclasses
    public int wheels() {
        return 0;  // Default for the base class
    }
}

// Subclass Unicycle
class Unicycle extends Cycle {
    @Override
    public int wheels() {
        return 1;  // Unicycle has 1 wheel
    }

    @Override
    public void ride() {
        System.out.println("Unicycle.ride() with " + wheels() + " wheel");
    }
}

// Subclass Bicycle
class Bicycle extends Cycle {
    @Override
    public int wheels() {
        return 2;  // Bicycle has 2 wheels
    }

    @Override
    public void ride() {
        System.out.println("Bicycle.ride() with " + wheels() + " wheels");
    }
}

// Subclass Tricycle
class Tricycle extends Cycle {
    @Override
    public int wheels() {
        return 3;  // Tricycle has 3 wheels
    }

    @Override
    public void ride() {
        System.out.println("Tricycle.ride() with " + wheels() + " wheels");
    }
}

public class TestCycles {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];

        // Upcast instances of different cycles to Cycle
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        // Verify polymorphism with ride() method
        for (Cycle c : cycles) {
            c.ride();  // Polymorphic call to the overridden ride() method
        }
    }
}