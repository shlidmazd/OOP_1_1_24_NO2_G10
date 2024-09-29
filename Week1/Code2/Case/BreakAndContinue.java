package Week1.Code2.Case;

public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("Example usage of continue:");
        for (int i = 0; i <= 10; i++) {
            if (i == 7) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("Example usage of break:");
        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }
}
