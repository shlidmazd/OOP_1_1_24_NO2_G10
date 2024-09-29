package Week2.main.java.com.mycompany.app.ReusingClasses.RC17;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Frog
        Frog frog = new Frog();
        
        // Upcast Frog to Amphibian
        Amphibian amphibian = frog;

        // Demonstrate that overridden methods are called
        amphibian.swim();    // Calls Frog's overridden swim method
        amphibian.jump();    // Calls Frog's overridden jump method
        amphibian.eat();     // Calls Frog's overridden eat method

        // The Frog-specific method croak() is not accessible through the Amphibian reference
        // Uncommenting the following line will result in a compile-time error:
        // amphibian.croak(); // Error: cannot find symbol

        // Downcast if necessary to access Frog-specific methods
        if (amphibian instanceof Frog) {
            Frog specificFrog = (Frog) amphibian;
            specificFrog.croak(); // Now it's possible to call Frog-specific methods
        }
    }
}
