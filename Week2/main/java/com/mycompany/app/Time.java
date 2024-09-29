package Week2.main.java.com.mycompany.app;

public class Time {
    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void addMinutes(int min) {
        int totalMinutes = this.minutes + min;
        this.hours += totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    @Override
    public String toString() {
        return hours + " giờ " + minutes + " phút";
    }
}
