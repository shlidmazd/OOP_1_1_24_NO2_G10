package Week2.main.java.com.mycompany.app.ReusingClasses.RC21;

public class DerivedClass extends BaseClass {
    // Attempt to override the final method
    // This will result in a compile-time error
    // @Override
    // public void finalMethod() {
    //     System.out.println("DerivedClass finalMethod()");
    // }

    // Correctly overriding the non-final method
    @Override
    public void normalMethod() {
        System.out.println("DerivedClass normalMethod()");
    }
}
