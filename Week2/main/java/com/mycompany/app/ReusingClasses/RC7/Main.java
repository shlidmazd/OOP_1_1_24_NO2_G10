package Week2.main.java.com.mycompany.app.ReusingClasses.RC7;

// Class A with constructor that takes an argument
class A {
    public A(int i) {
        System.out.println("A's constructor, argument: " + i);
    }
}

// Class B with constructor that takes an argument
class B {
    public B(String s) {
        System.out.println("B's constructor, argument: " + s);
    }
}

// Class C inherits from A and contains an instance of B
class C extends A {
    private B b;

    // Constructor for C that initializes both A and B
    public C(int i, String s) {
        super(i);  // Call the constructor of class A
        b = new B(s);  // Initialize B object
        System.out.println("C's constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of C, which will initialize both A and B
        C c = new C(10, "Hello");
    }
}
