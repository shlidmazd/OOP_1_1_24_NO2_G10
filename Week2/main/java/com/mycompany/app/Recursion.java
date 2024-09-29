package Week2.main.java.com.mycompany.app;

public class Recursion {
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
