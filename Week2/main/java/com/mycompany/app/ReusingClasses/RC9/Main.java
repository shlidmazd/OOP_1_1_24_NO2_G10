package Week2.main.java.com.mycompany.app.ReusingClasses.RC9;

// Component1 class with default constructor
class Component1 {
    public Component1() {
        System.out.println("Component1 constructor");
    }
}

// Component2 class with default constructor
class Component2 {
    public Component2() {
        System.out.println("Component2 constructor");
    }
}

// Component3 class with default constructor
class Component3 {
    public Component3() {
        System.out.println("Component3 constructor");
    }
}

// Root class that contains instances of Component1, Component2, and Component3
class Root {
    private Component1 c1 = new Component1();
    private Component2 c2 = new Component2();
    private Component3 c3 = new Component3();

    public Root() {
        System.out.println("Root constructor");
    }
}

// Stem class derived from Root and also containing instances of Component1, Component2, and Component3
class Stem extends Root {
    private Component1 c1 = new Component1();
    private Component2 c2 = new Component2();
    private Component3 c3 = new Component3();

    public Stem() {
        System.out.println("Stem constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of Stem
        Stem stem = new Stem();
    }
}
