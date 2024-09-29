package Week2.main.java.com.mycompany.app.ReusingClasses.RC15;

import Week2.main.java.com.mycompany.app.ReusingClasses.RC15.mypackage.BaseClass;

public class TestAccess {
    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        // Trying to call the protected method directly from outside the package
        // This will result in a compile-time error
        // base.protectedMethod(); // Uncommenting this line will cause a compile-time error
    }
}
