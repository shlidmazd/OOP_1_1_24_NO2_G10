package Week2.main.java.com.mycompany.app.ReusingClasses.RC24;

class Insect { 
    private int i = 9; 
    protected int j; 

    Insect() { 
        printInit("i = " + i + ", j = " + j); 
        j = 39; 
    } 

    private static int x1 = printInit("static Insect.x1 initialized"); 

    static int printInit(String s) {
        printInit(s); 
        return 47; 
    } 
} 

class SpecificBeetle extends Beetle {
    private int m = printInit("SpecificBeetle.m initialized");

    public SpecificBeetle() {
        printInit("m = " + m);
        printInit("j = " + j);
    }

    private static int x3 = printInit("static SpecificBeetle.x3 initialized");

    public static void main(String[] args) {
        printInit("SpecificBeetle constructor");
        SpecificBeetle sb = new SpecificBeetle();
    }
}

public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized"); 

    public Beetle() { 
        printInit("k = " + k); 
        printInit("j = " + j); 
    } 

    private static int x2 = printInit("static Beetle.x2 initialized"); 

    public static void main(String[] args) { 
        printInit("Beetle constructor"); 
        Beetle b = new Beetle(); 
    }
}
