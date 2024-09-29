package Week2.main.java.com.mycompany.app.AccessControl.AC4.package1;

public class SamePackageClass {
    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        base.protectedMethod();  // Works because it's in the same package
    }
}
