package Week3.P17;

// Base class Cycle
class Cycle {
    public void ride() {
        System.out.println("Riding a Cycle");
    }
}

// Subclass Unicycle with balance() method
class Unicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a Unicycle");
    }

    public void balance() {
        System.out.println("Unicycle balancing");
    }
}

// Subclass Bicycle with balance() method
class Bicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a Bicycle");
    }

    public void balance() {
        System.out.println("Bicycle balancing");
    }
}

// Subclass Tricycle without balance() method
class Tricycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a Tricycle");
    }

    public void balance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'balance'");
    }
}

// Main class to demonstrate upcasting, downcasting, and method calling
public class CycleTest {
    public static void main(String[] args) {
        // Create instances of each subclass
        Cycle[] cycles = {
            new Unicycle(),
            new Bicycle(),
            new Tricycle()
        };

        // Try to call balance() on each element (upcasting to Cycle)
        for (Cycle cycle : cycles) {
            cycle.ride();
            // Uncommenting the below line will result in a compilation error
            // because balance() is not available in the Cycle class.
            // cycle.balance();
        }

        System.out.println("\nDowncasting and calling balance():");

        // Downcast to specific types and call balance()
        ((Unicycle) cycles[0]).balance();  // Downcast Unicycle and call balance()
        ((Bicycle) cycles[1]).balance();   // Downcast Bicycle and call balance()

        // The following line will throw a ClassCastException at runtime,
        // because Tricycle does not have a balance() method.
        try {
            ((Tricycle) cycles[2]).balance();  // No balance() in Tricycle
        } catch (ClassCastException e) {
            System.out.println("Tricycle does not have a balance() method.");
        }
    }
}