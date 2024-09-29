package Week2.main.java.com.mycompany.app.ReusingClasses.RC4;

// Base class BaseClass
class BaseClass {
    public BaseClass() {
        System.out.println("BaseClass constructor called");
    }
}

// Derived class DerivedClass
class DerivedClass extends BaseClass {
    public DerivedClass() {
        System.out.println("DerivedClass constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        DerivedClass derived = new DerivedClass();  // Instantiate DerivedClass
    }
}
