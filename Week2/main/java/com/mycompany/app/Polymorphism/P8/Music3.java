package Week2.main.java.com.mycompany.app.Polymorphism.P8;

// An extensible program with random instrument generation.
package polymorphism.music3;

import polymorphism.music.Note;
import java.util.Random;

import static net.mindview.util.Print.*;

// Base class Instrument
class Instrument {
    void play(Note n) {
        print("Instrument.play() " + n);
    }

    @Override
    public String toString() {
        return "Instrument";
    }

    void adjust() {
        print("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    @Override
    void play(Note n) {
        print("Wind.play() " + n);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    @Override
    void adjust() {
        print("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    @Override
    void play(Note n) {
        print("Percussion.play() " + n);
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    void adjust() {
        print("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    @Override
    void play(Note n) {
        print("Stringed.play() " + n);
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    @Override
    void adjust() {
        print("Adjusting Stringed");
    }
}

class Brass extends Wind {
    @Override
    void play(Note n) {
        print("Brass.play() " + n);
    }

    @Override
    public String toString() {
        return "Brass";
    }

    @Override
    void adjust() {
        print("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    @Override
    void play(Note n) {
        print("Woodwind.play() " + n);
    }

    @Override
    public String toString() {
        return "Woodwind";
    }
}

// New Instrument type: Electronic
class Electronic extends Instrument {
    @Override
    void play(Note n) {
        print("Electronic.play() " + n);
    }

    @Override
    public String toString() {
        return "Electronic";
    }

    @Override
    void adjust() {
        print("Adjusting Electronic");
    }
}

// Class that randomly generates Instrument objects
class RandomInstrumentGenerator {
    private Random rand = new Random();

    public Instrument next() {
        switch (rand.nextInt(6)) { // 6 types of instruments
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Brass();
            case 4: return new Woodwind();
            case 5: return new Electronic(); // New type
        }
    }
}

public class Music3 {
    // Doesn’t care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
        
        // Create an array of instruments, generated randomly
        Instrument[] orchestra = new Instrument[9];
        for (int i = 0; i < orchestra.length; i++) {
            orchestra[i] = gen.next(); // Randomly generate each instrument
        }

        // Tune all the instruments
        tuneAll(orchestra);

        // Print each instrument using System.out.println()
        System.out.println("Instruments:");
        for (Instrument i : orchestra) {
            System.out.println(i);
        }
    }
}