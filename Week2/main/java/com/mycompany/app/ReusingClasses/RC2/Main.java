package Week2.main.java.com.mycompany.app.ReusingClasses.RC2;

// Base class Detergent
class Detergent {
    public void scrub() {
        System.out.println("Detergent scrub()");
    }

    public void dilute() {
        System.out.println("Detergent dilute()");
    }

    public void apply() {
        System.out.println("Detergent apply()");
    }
}


// Inherited class NewDetergent
class NewDetergent extends Detergent {
    
    // Override scrub method
    @Override
    public void scrub() {
        System.out.println("NewDetergent scrub() - Overridden");
    }
    
    // New method sterilize
    public void sterilize() {
        System.out.println("NewDetergent sterilize()");
    }
}


public class Main {
    public static void main(String[] args) {
        NewDetergent newDetergent = new NewDetergent();
        
        // Test the overridden scrub() method
        newDetergent.scrub();
        
        // Test the new sterilize() method
        newDetergent.sterilize();
        
        // Call the inherited methods from Detergent
        newDetergent.dilute();
        newDetergent.apply();
    }
}
