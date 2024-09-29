package Week2.main.java.com.mycompany.app.ReusingClasses.RC12;

// Component1 class with constructor and dispose() method
class Component1 {
    public Component1() {
        System.out.println("Component1 constructor");
    }

    public void dispose() {
        System.out.println("Disposing Component1");
    }
}

// Component2 class with constructor and dispose() method
class Component2 {
    public Component2() {
        System.out.println("Component2 constructor");
    }

    public void dispose() {
        System.out.println("Disposing Component2");
    }
}

// Component3 class with constructor and dispose() method
class Component3 {
    public Component3() {
        System.out.println("Component3 constructor");
    }

    public void dispose() {
        System.out.println("Disposing Component3");
    }
}

// Root class containing instances of Component1, Component2, and Component3
class Root {
    private Component1 c1 = new Component1();
    private Component2 c2 = new Component2();
    private Component3 c3 = new Component3();

    public Root() {
        System.out.println("Root constructor");
    }

    public void dispose() {
        System.out.println("Disposing Root");
        // Dispose of components in reverse order of construction
        c3.dispose();
        c2.dispose();
        c1.dispose();
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

    public void dispose() {
        System.out.println("Disposing Stem");
        // Dispose of components in reverse order of construction
        c3.dispose();
        c2.dispose();
        c1.dispose();
        // Call dispose() of base class (Root)
        super.dispose();
    }
}

public class Main {
    public static void main(String[] args) {
        Stem stem = new Stem(); // Create an object of Stem
        try {
            // Code that works with the Stem object would go here
        } finally {
            // Ensure dispose() is called in a proper cleanup scenario
            stem.dispose();
        }
    }
}
