package Week2.main.java.com.mycompany.app.InitializationAndCleanup.IaC22;

// Enum representing the least-valuable six types of paper currency
enum Currency {
    ONE, TWO, FIVE, TEN, TWENTY, FIFTY;
}

public class Main {
    public static void main(String[] args) {
        // Loop through the enum values and call a method to describe each one
        for (Currency c : Currency.values()) {
            describeCurrency(c);
        }
    }

    // Method to describe the currency using a switch statement
    public static void describeCurrency(Currency currency) {
        switch (currency) {
            case ONE:
                System.out.println("ONE: The $1 bill, often referred to as a single or a buck.");
                break;
            case TWO:
                System.out.println("TWO: The $2 bill, rare and sometimes considered a collector's item.");
                break;
            case FIVE:
                System.out.println("FIVE: The $5 bill, featuring President Abraham Lincoln.");
                break;
            case TEN:
                System.out.println("TEN: The $10 bill, featuring Alexander Hamilton.");
                break;
            case TWENTY:
                System.out.println("TWENTY: The $20 bill, featuring President Andrew Jackson.");
                break;
            case FIFTY:
                System.out.println("FIFTY: The $50 bill, featuring President Ulysses S. Grant.");
                break;
            default:
                System.out.println("Unknown currency.");
                break;
        }
    }
}