import java.util.Scanner;

public class Game {

    private Board board; // The playing board
    private Player[] players; // Array of 2 players
    private GameLogic gameLogic; // Win/draw checker
    private int currentTurn; // 0 = player1, 1 = player2
    private Scanner scanner;

    public Game(Player player1, Player player2) {
        this.board = new Board();
        this.players = new Player[] { player1, player2 };
        this.gameLogic = new GameLogic();
        this.currentTurn = 0; // Player 1 always goes first
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("\n🎮 Game Started! " +
                players[0] + " vs " + players[1]);
        System.out.println("Enter row and column (0, 1, or 2)\n");

        boolean gameOver = false;

        while (!gameOver) {

            // Step 1: Show current board
            board.display();

            // Step 2: Get current player
            Player currentPlayer = players[currentTurn];
            System.out.println("👉 " + currentPlayer.getName() +
                    "'s turn (" + currentPlayer.getSymbol() + ")");

            // Step 3: Ask for valid move
            int[] move = getPlayerMove();
            int row = move[0];
            int col = move[1];

            // Step 4: Place symbol on board
            boolean placed = board.placeSymbol(row, col, currentPlayer.getSymbol());
            if (!placed)
                continue; // Invalid move — retry same player

            // Step 5: Check if current player has won
            if (gameLogic.hasWon(board.getGrid(), board.getSize(),
                    currentPlayer.getSymbol())) {
                board.display();
                System.out.println(" " + currentPlayer.getName() + " WINS! Congratulations!");
                gameOver = true;

                // Step 6: Check if it's a draw (board full, no winner)
            } else if (board.isFull()) {
                board.display();
                System.out.println(" It's a DRAW! Well played both!");
                gameOver = true;

                // Step 7: Switch to next player's turn
            } else {
                switchTurn();
            }
        }

        scanner.close();
    }

    // Switch between player 0 and player 1
    // currentTurn = 0 → becomes 1
    // currentTurn = 1 → becomes 0
    private void switchTurn() {
        currentTurn = (currentTurn + 1) % 2;
    }

    // Ask player for row and column input
    // Keeps asking until valid input (0-2) is given
    private int[] getPlayerMove() {
        int row = -1, col = -1;

        while (true) {
            try {
                System.out.print(" Enter row (0-2): ");
                row = Integer.parseInt(scanner.nextLine().trim());

                System.out.print(" Enter col (0-2): ");
                col = Integer.parseInt(scanner.nextLine().trim());

                // Validate range
                if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
                    break; // Valid input — exit loop
                } else {
                    System.out.println(" ✗ Please enter values between 0 and 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println(" ✗ Invalid input! Enter a number.");
            }
        }

        return new int[] { row, col };
    }
}