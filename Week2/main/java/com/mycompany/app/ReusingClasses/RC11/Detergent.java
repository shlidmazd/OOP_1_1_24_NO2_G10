package Week2.main.java.com.mycompany.app.ReusingClasses.RC11;

class Cleanser {

    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

public class Detergent {
    // Using delegation by creating an instance of Cleanser
    private Cleanser cleanser = new Cleanser();

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        cleanser.scrub();
        cleanser.append(" Detergent.scrub()");
    }

    public void foam() {
        cleanser.append(" foam()");
    }

    public String toString() {
        return cleanser.toString();
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        
        System.out.println(x);

        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}
