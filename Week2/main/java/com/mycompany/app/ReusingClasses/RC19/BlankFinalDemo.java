package Week2.main.java.com.mycompany.app.ReusingClasses.RC19;

public class BlankFinalDemo {
    // Blank final reference
    private final Object reference;

    // Constructor 1
    public BlankFinalDemo(Object ref) {
        this.reference = ref;  // Initialize final reference
    }

    // Constructor 2
    public BlankFinalDemo() {
        this.reference = new Object();  // Initialize final reference
    }

    // Method to demonstrate usage
    public void display() {
        System.out.println("Reference: " + reference);
    }

    public static void main(String[] args) {
        // Creating instances using both constructors
        BlankFinalDemo demo1 = new BlankFinalDemo("Hello");
        BlankFinalDemo demo2 = new BlankFinalDemo();

        // Displaying the references
        demo1.display(); // Shows the initialized value "Hello"
        demo2.display(); // Shows the initialized object (memory address)

        // Attempting to change the final reference (will cause a compile-time error)
        // demo1.reference = new Object(); // Uncommenting this line will cause a compile-time error
    }
}
