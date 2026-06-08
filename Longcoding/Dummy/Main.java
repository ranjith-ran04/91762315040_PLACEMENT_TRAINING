// ============================================================
// FILE: Main.java
// CLASS: Main
//
// RESPONSIBILITY: Entry point ONLY.
// Create players, create game, start it.
//
// WHY A SEPARATE CLASS?
// → main() is just the "ignition key" of the car.
// It starts the engine (Game) but doesn't drive it.
// → All real logic is inside Game, Board, Player, GameLogic.
// → Keeping main() clean makes it easy to swap things —
// e.g., read player names from a file instead of hardcoding.
//
// RULE: main() should be SHORT and SIMPLE.
// If your main() is 50+ lines, something is wrong!
// ============================================================

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" TIC TAC TOE - LLD DEMO");
        System.out.println("========================================");

        Scanner scanner = new Scanner(System.in);

        // Get player names from user
        System.out.print("Enter Player 1 name: ");
        String name1 = scanner.nextLine().trim();

        System.out.print("Enter Player 2 name: ");
        String name2 = scanner.nextLine().trim();

        // Create Player objects — Player class handles their data
        Player player1 = new Player(name1, 'X'); // Player 1 is always X
        Player player2 = new Player(name2, 'O'); // Player 2 is always O

        // Create Game — Game class handles everything from here
        Game game = new Game(player1, player2);

        // Start the game — one line is all main() needs!
        game.start();

        System.out.println("\nThanks for playing! 🎮");
        scanner.close();
    }
}