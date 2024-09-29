package Week2.main.java.com.mycompany.app.ReusingClasses.RC16;

// Derived class Frog
public class Frog extends Amphibian {
    // Frog-specific method
    public void croak() {
        System.out.println("Frog croaks.");
    }

    // Overriding a method from Amphibian (optional)
    @Override
    public void eat() {
        System.out.println("Frog catches insects.");
    }
}
