package Week2.main.java.com.mycompany.app.ReusingClasses.RC18;

public class FieldDemo {
    // Static final field
    public static final int STATIC_FINAL_FIELD = 10;
    
    // Final field
    public final int finalField;

    // Constructor to initialize the final field
    public FieldDemo(int value) {
        this.finalField = value;
    }

    public static void main(String[] args) {
        // Accessing the static final field
        System.out.println("STATIC_FINAL_FIELD: " + FieldDemo.STATIC_FINAL_FIELD);

        // Creating instances of FieldDemo
        FieldDemo instance1 = new FieldDemo(20);
        FieldDemo instance2 = new FieldDemo(30);

        // Accessing the final field for each instance
        System.out.println("instance1.finalField: " + instance1.finalField);
        System.out.println("instance2.finalField: " + instance2.finalField);

        // Demonstrate that static final field is shared across instances
        System.out.println("STATIC_FINAL_FIELD from instance1: " + instance1.STATIC_FINAL_FIELD);
        System.out.println("STATIC_FINAL_FIELD from instance2: " + instance2.STATIC_FINAL_FIELD);
        
        // Attempting to change static final field (will cause a compile-time error)
        // FieldDemo.STATIC_FINAL_FIELD = 20; // Uncommenting this line will cause a compile-time error

        // Attempting to change final field (will cause a compile-time error)
        // instance1.finalField = 40; // Uncommenting this line will cause a compile-time error
    }
}
