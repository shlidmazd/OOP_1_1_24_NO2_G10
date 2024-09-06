public class DiscreteSignal implements Signal {
    private double amplitude;
    private double frequency;
    private double period;

    public DiscreteSignal(double amplitude, double frequency, double period) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.period = period;
    }

    @Override
    public double getAmplitude() {
        return amplitude;
    }

    @Override
    public double getFrequency() {
        return frequency;
    }

    @Override
    public double getPeriod() {
        return period;
    }

    public double computeSignal(int n, int k) {
        return (n == k) ? amplitude : 0;
    }

    @Override
    public void displaySignalInfo() {
        System.out.println("Discrete Signal: ");
        System.out.println("Amplitude: " + amplitude);
        System.out.println("Frequency: " + frequency);
        System.out.println("Period: " + period);
    }
}
