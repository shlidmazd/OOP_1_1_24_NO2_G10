package Week2.main.java.com.mycompany.app.Polymorphism.P16;

import static java.lang.System.out;

// Base class for AlertStatus (like Actor in Transmogrify)
class AlertStatus {
    public void alert() {}
}

// Concrete class for GreenAlert state
class GreenAlert extends AlertStatus {
    @Override
    public void alert() {
        out.println("Green Alert: All systems normal.");
    }
}

// Concrete class for YellowAlert state
class YellowAlert extends AlertStatus {
    @Override
    public void alert() {
        out.println("Yellow Alert: Caution! Potential issues detected.");
    }
}

// Concrete class for RedAlert state
class RedAlert extends AlertStatus {
    @Override
    public void alert() {
        out.println("Red Alert: Critical danger! Immediate action required.");
    }
}

// Starship class containing an AlertStatus reference (similar to Stage in Transmogrify)
class Starship {
    private AlertStatus alertStatus = new GreenAlert();  // Default alert state

    // Method to change to RedAlert
    public void changeToRedAlert() {
        alertStatus = new RedAlert();
    }

    // Method to change to YellowAlert
    public void changeToYellowAlert() {
        alertStatus = new YellowAlert();
    }

    // Method to change to GreenAlert
    public void changeToGreenAlert() {
        alertStatus = new GreenAlert();
    }

    // Method to perform alert action (similar to performPlay)
    public void checkAlert() {
        alertStatus.alert();
    }
}

// Main class to test the Starship
public class StarshipTest {
    public static void main(String[] args) {
        // Create a Starship object
        Starship enterprise = new Starship();

        // Initially in GreenAlert
        enterprise.checkAlert();  // Should print "Green Alert: All systems normal."

        // Change to YellowAlert
        enterprise.changeToYellowAlert();
        enterprise.checkAlert();  // Should print "Yellow Alert: Caution! Potential issues detected."

        // Change to RedAlert
        enterprise.changeToRedAlert();
        enterprise.checkAlert();  // Should print "Red Alert: Critical danger! Immediate action required."

        // Back to GreenAlert
        enterprise.changeToGreenAlert();
        enterprise.checkAlert();  // Should print "Green Alert: All systems normal."
    }
}
