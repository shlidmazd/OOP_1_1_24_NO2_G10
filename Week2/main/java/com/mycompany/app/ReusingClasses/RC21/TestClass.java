package Week2.main.java.com.mycompany.app.ReusingClasses.RC21;

public class TestClass {
    public static void main(String[] args) {
        // Create an instance of DerivedClass
        DerivedClass derived = new DerivedClass();

        // Call the final method
        derived.finalMethod();  // Calls BaseClass finalMethod()

        // Call the overridden method
        derived.normalMethod(); // Calls DerivedClass normalMethod()
    }
}
