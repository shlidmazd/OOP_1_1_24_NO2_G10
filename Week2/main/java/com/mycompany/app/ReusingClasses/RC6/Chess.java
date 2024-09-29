package Week2.main.java.com.mycompany.app.ReusingClasses.RC6;

// Base class Game
class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

// Derived class BoardGame from Game
class BoardGame extends Game {
    BoardGame(int i) {
        super(i); // Calls the Game constructor
        System.out.println("BoardGame constructor");
    }
}

// Further derived class Chess from BoardGame
public class Chess extends BoardGame {
    Chess() {
        super(11); // Calls the BoardGame constructor
        System.out.println("Chess constructor");
    }

    // Main method to test the order of constructor calls
    public static void main(String[] args) {
        Chess x = new Chess(); // Create an instance of Chess
    }
}

