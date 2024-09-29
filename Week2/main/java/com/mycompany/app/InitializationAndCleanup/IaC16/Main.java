package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC16;

public class Main {
    public static void main(String[] args) {
        // Create an array of String objects with a size of 5
        String[] words = new String[5];

        // Assign values to each element of the array
        words[0] = "Hello";
        words[1] = "World";
        words[2] = "Java";
        words[3] = "Programming";
        words[4] = "Rocks";

        // Print the elements of the array using a for loop
        System.out.println("Array contents:");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Element at index " + i + ": " + words[i]);
        }
    }
}

