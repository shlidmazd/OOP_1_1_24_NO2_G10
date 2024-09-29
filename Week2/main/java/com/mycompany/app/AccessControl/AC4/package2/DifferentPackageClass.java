package Week2.main.java.com.mycompany.app.AccessControl.AC4.package2;

import Week2.main.java.com.mycompany.app.AccessControl.AC4.package1.BaseClass;

public class DifferentPackageClass {
    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        // base.protectedMethod();  // This line would cause a compilation error
    }
}
