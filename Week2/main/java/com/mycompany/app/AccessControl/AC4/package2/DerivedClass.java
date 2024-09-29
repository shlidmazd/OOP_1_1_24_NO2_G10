package Week2.main.java.com.mycompany.app.AccessControl.AC4.package2;

import Week2.main.java.com.mycompany.app.AccessControl.AC4.package1.BaseClass;

public class DerivedClass extends BaseClass {
    public static void main(String[] args) {
        DerivedClass derived = new DerivedClass();
        derived.protectedMethod();  // Works because it's accessed through inheritance
    }
}
