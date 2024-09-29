package Week2.main.java.com.mycompany.app.ReusingClasses.RC17;

public class Frog extends Amphibian {
    // Overriding methods from Amphibian with new definitions

    @Override
    public void swim() {
        System.out.println("Frog swims gracefully.");
    }

    @Override
    public void jump() {
        System.out.println("Frog jumps high.");
    }

    @Override
    public void eat() {
        System.out.println("Frog catches insects.");
    }

    // Frog-specific method
    public void croak() {
        System.out.println("Frog croaks.");
    }
}
