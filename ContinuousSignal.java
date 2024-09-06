public class ContinuousSignal implements Signal {
    private double amplitude;
    private double frequency;
    private double period;

    public ContinuousSignal(double amplitude, double frequency, double period) {
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

    @Override
    public void displaySignalInfo() {
        System.out.println("Continuous Signal: ");
        System.out.println("Amplitude: " + amplitude);
        System.out.println("Frequency: " + frequency);
        System.out.println("Period: " + period);
    }
}
