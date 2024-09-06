public class Radar {
    public double analyzeDiscreteSignal(int n) {
        if (n >= 0 && n <= 15) {
            return 1 - (double)n / 15;
        }
        return 0;
    }

    public void displayRadarAnalysis(int n) {
        double result = analyzeDiscreteSignal(n);
        System.out.println("Radar Signal Analysis at n = " + n + ": " + result);
    }
}
