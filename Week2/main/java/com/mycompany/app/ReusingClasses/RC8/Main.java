package Week2.main.java.com.mycompany.app.ReusingClasses.RC8;

// Base class with only a non-default constructor
class BaseClass {
    // Non-default constructor
    public BaseClass(int i) {
        System.out.println("BaseClass constructor, argument: " + i);
    }
}

// Derived class with both default and non-default constructors
class DerivedClass extends BaseClass {

    // Default constructor (no-arg constructor)
    public DerivedClass() {
        super(0); // Call the base class constructor with default value
        System.out.println("DerivedClass default constructor");
    }

    // Non-default constructor
    public DerivedClass(int i) {
        super(i); // Call the base class constructor with argument
        System.out.println("DerivedClass non-default constructor, argument: " + i);
    }
}


public class Main {
    public static void main(String[] args) {
        // Creating an object of DerivedClass using default constructor
        DerivedClass defaultObj = new DerivedClass();
        
        // Creating an object of DerivedClass using non-default constructor
        DerivedClass nonDefaultObj = new DerivedClass(10);
    }
}
