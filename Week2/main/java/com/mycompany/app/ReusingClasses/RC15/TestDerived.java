package Week2.main.java.com.mycompany.app.ReusingClasses.RC15;

import Week2.main.java.com.mycompany.app.ReusingClasses.RC15.anotherpackage.DerivedClass;

public class TestDerived {
    public static void main(String[] args) {
        DerivedClass derived = new DerivedClass();
        // Calling the method that internally calls the protected method
        derived.callProtectedMethod(); // This is allowed
    }
}
