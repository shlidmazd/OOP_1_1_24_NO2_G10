package Week2.main.java.com.mycompany.app.ReusingClasses.RC5;

// Class A with default constructor
class A {
    public A() {
        System.out.println("A's constructor");
    }
}

// Class B with default constructor
class B {
    public B() {
        System.out.println("B's constructor");
    }
}

// Class C inherits from A and contains a member of class B
class C extends A {
    // Member of class B
    private B b = new B();
}

public class Main {
    public static void main(String[] args) {
        // Create an object of class C
        C c = new C();
    }
}
