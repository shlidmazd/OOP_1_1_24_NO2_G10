package Week2.main.java.com.mycompany.app.ReusingClasses.RC10;

// Component1 class with non-default constructor
class Component1 {
    public Component1(int i) {
        System.out.println("Component1 constructor with argument: " + i);
    }
}

// Component2 class with non-default constructor
class Component2 {
    public Component2(int i) {
        System.out.println("Component2 constructor with argument: " + i);
    }
}

// Component3 class with non-default constructor
class Component3 {
    public Component3(int i) {
        System.out.println("Component3 constructor with argument: " + i);
    }
}

// Root class that contains instances of Component1, Component2, and Component3
class Root {
    private Component1 c1;
    private Component2 c2;
    private Component3 c3;

    // Non-default constructor that initializes all components with arguments
    public Root(int i1, int i2, int i3) {
        c1 = new Component1(i1);
        c2 = new Component2(i2);
        c3 = new Component3(i3);
        System.out.println("Root constructor");
    }
}

// Stem class derived from Root and also containing instances of Component1, Component2, and Component3
class Stem extends Root {
    private Component1 c1;
    private Component2 c2;
    private Component3 c3;

    // Non-default constructor that initializes both Root and its own components with arguments
    public Stem(int i1, int i2, int i3, int i4, int i5, int i6) {
        super(i1, i2, i3);  // Call Root's constructor with arguments
        c1 = new Component1(i4);
        c2 = new Component2(i5);
        c3 = new Component3(i6);
        System.out.println("Stem constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of Stem, passing arguments to all constructors
        Stem stem = new Stem(1, 2, 3, 4, 5, 6);
    }
}
