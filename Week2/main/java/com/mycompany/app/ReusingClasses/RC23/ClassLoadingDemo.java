package Week2.main.java.com.mycompany.app.ReusingClasses.RC23;

public class ClassLoadingDemo {
    // Static block that gets executed only once when the class is loaded
    static {
        System.out.println("ClassLoadingDemo loaded");
    }

    // Constructor to demonstrate object creation
    public ClassLoadingDemo() {
        System.out.println("ClassLoadingDemo instance created");
    }

    // Static method to demonstrate access of static members
    public static void staticMethod() {
        System.out.println("Static method called");
    }

    public static void main(String[] args) {
        System.out.println("Main method started");

        // Access static method - triggers class loading if not already loaded
        System.out.println("Accessing static method:");
        ClassLoadingDemo.staticMethod();

        // Create an instance - triggers class loading if not already loaded
        System.out.println("Creating first instance:");
        ClassLoadingDemo demo1 = new ClassLoadingDemo();

        // Create another instance - class will not be loaded again
        System.out.println("Creating second instance:");
        ClassLoadingDemo demo2 = new ClassLoadingDemo();
    }
}
