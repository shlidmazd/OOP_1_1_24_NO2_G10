package Week3.com.mycompany.app;

public class App {
    public static void main(String[] args) {
        // Test DisruptLecture
        DisruptLecture disruptLecture = new DisruptLecture();
        disruptLecture.disrupt();

        // Test TestArithmetic
        TestArithmetic arithmetic = new TestArithmetic();
        System.out.println("Addition: " + arithmetic.add(5, 3));
        System.out.println("Subtraction: " + arithmetic.subtract(5, 3));

        // Test GlyphTest
        GlyphTest glyphTest = new GlyphTest();
        glyphTest.testGlyph();

        // Test Transmogrify
        Transmogrify transmogrify = new Transmogrify();
        transmogrify.perform();  // Initially HappyActor
        transmogrify.change();   // Change to SadActor
        transmogrify.perform();  // Now SadActor
    }
}