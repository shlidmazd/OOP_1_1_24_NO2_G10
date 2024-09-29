package Week2.main.java.com.mycompany.app.ReusingClasses.RC15.anotherpackage;

import Week2.main.java.com.mycompany.app.ReusingClasses.RC15.mypackage.BaseClass;

public class DerivedClass extends BaseClass {
    public void callProtectedMethod() {
        // Calling the protected method from the derived class
        protectedMethod(); // This is allowed
    }
}
