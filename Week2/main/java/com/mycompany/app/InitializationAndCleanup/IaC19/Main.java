package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC19;

class VarArgsExample {
    // Method that accepts a variable-length argument of Strings (varargs)
    static void printStrings(String... strings) {
        System.out.println("Number of arguments: " + strings.length);
        for (String s : strings) {
            System.out.println(s);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Pass a comma-separated list of Strings
        System.out.println("Passing a comma-separated list of Strings:");
        VarArgsExample.printStrings("Hello", "World", "Varargs", "Example");
        
        // Pass a String array
        System.out.println("\nPassing a String array:");
        String[] stringArray = { "Java", "Varargs", "Are", "Powerful" };
        VarArgsExample.printStrings(stringArray);
    }
}