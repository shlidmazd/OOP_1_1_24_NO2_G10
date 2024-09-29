package Week2.main.java.com.mycompany.app.Polymorphism.P15;

import static java.lang.System.out;

class Glyph {
    void draw() { 
        out.println("Glyph.draw()"); 
    }
    
    Glyph() {
        out.println("Glyph() before draw()");
        draw(); // Polymorphic method called inside base constructor
        out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1; // Member variable in derived class

    RoundGlyph(int r) {
        radius = r;
        out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    @Override
    void draw() {
        out.println("RoundGlyph.draw(), radius = " + radius); // Uses radius which may not be initialized
    }
}

// New class RectangularGlyph
class RectangularGlyph extends Glyph {
    private int width = 2;  // Member variables in derived class
    private int height = 3;

    RectangularGlyph(int w, int h) {
        width = w;
        height = h;
        out.println("RectangularGlyph.RectangularGlyph(), width = " + width + ", height = " + height);
    }

    @Override
    void draw() {
        out.println("RectangularGlyph.draw(), width = " + width + ", height = " + height);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        out.println("Creating RoundGlyph:");
        new RoundGlyph(5);

        out.println("\nCreating RectangularGlyph:");
        new RectangularGlyph(4, 6);
    }
}