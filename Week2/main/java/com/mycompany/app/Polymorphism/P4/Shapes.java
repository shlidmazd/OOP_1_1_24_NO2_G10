package Week2.main.java.com.mycompany.app.Polymorphism.P4;

import java.util.Random;

// Base class Shape
class Shape {
    public void draw() {
        System.out.println("Shape.draw()");
    }

    public void erase() {
        System.out.println("Shape.erase()");
    }
    
    public void info() {
        System.out.println("Shape.info()");
    }
}

// Subclass Circle
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void info() {
        System.out.println("Circle.info()");
    }
}

// Subclass Square
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void info() {
        System.out.println("Square.info()");
    }
}

// Subclass Triangle
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void info() {
        System.out.println("Triangle.info()");
    }
}

// New subclass Pentagon
class Pentagon extends Shape {
    @Override
    public void draw() {
        System.out.println("Pentagon.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Pentagon.erase()");
    }

    @Override
    public void info() {
        System.out.println("Pentagon.info()");
    }
}

// RandomShapeGenerator to generate random shapes
class RandomShapeGenerator {
    private Random rand = new Random();

    public Shape next() {
        switch (rand.nextInt(4)) {  // Now includes Pentagon
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            default:
                return new Pentagon();
        }
    }
}

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[12];  // Increased array size to account for Pentagon
        // Fill up the array with shapes:
        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // Make polymorphic method calls:
        for (Shape shp : s) {
            shp.draw();
            shp.info();
        }
    }
}