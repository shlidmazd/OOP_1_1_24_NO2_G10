package Week2.main.java.com.mycompany.app.Polymorphism.P3;

import java.util.Random;

// Base class Shape
class Shape {
    public void draw() {
        System.out.println("Shape.draw()");
    }

    public void erase() {
        System.out.println("Shape.erase()");
    }
    
    // New method in base class
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
}

// RandomShapeGenerator to generate random shapes
class RandomShapeGenerator {
    private Random rand = new Random();

    public Shape next() {
        switch (rand.nextInt(3)) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            default:
                return new Triangle();
        }
    }
}

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Fill up the array with shapes:
        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // Call the draw method on each shape
        for (Shape shp : s) {
            shp.draw();
            shp.info();  // Call the new method from the base class
        }
    }
}
