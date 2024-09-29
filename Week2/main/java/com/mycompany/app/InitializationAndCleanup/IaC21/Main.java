package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC21;

// Enum representing the least-valuable six types of paper currency
enum Currency {
    ONE, TWO, FIVE, TEN, TWENTY, FIFTY;
}

public class Main {
    public static void main(String[] args) {
        // Loop through the enum values and print each value with its ordinal
        for (Currency c : Currency.values()) {
            System.out.println(c + " has ordinal " + c.ordinal());
        }
    }
}