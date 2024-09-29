package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC20;

public class Main {
    // Varargs version of the main method
    public static void main(String... args) {
        System.out.println("Number of arguments: " + args.length);
        
        // Print all the elements in the args array
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}