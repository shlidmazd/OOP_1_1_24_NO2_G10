package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC14;

class Example {
    // Static String field initialized at the point of definition
    static String field1 = "Initialized at definition";

    // Static String field initialized by the static block
    static String field2;

    // Static block for initializing field2
    static {
        field2 = "Initialized in static block";
        System.out.println("Static block executed.");
    }

    // Static method to print both fields
    static void printFields() {
        System.out.println("field1: " + field1);
        System.out.println("field2: " + field2);
    }
}

public class Main {
    public static void main(String[] args) {
        // Call the static method to print both fields
        Example.printFields();
    }
}

