public class GameLogic {

    // Check if the given symbol has won the game
    // Checks all rows, columns, and both diagonals
    public boolean hasWon(char[][] grid, int size, char symbol) {
        return checkRows(grid, size, symbol)
                || checkColumns(grid, size, symbol)
                || checkDiagonals(grid, size, symbol);
    }

    // Check if any ROW is completely filled with the symbol
    // e.g., [ X | X | X ] → win!
    private boolean checkRows(char[][] grid, int size, char symbol) {
        for (int row = 0; row < size; row++) {
            boolean win = true;
            for (int col = 0; col < size; col++) {
                if (grid[row][col] != symbol) {
                    win = false;
                    break;
                }
            }
            if (win)
                return true;
        }
        return false;
    }

    // Check if any COLUMN is completely filled with the symbol
    // e.g., column 0: [X], [X], [X] → win!
    private boolean checkColumns(char[][] grid, int size, char symbol) {
        for (int col = 0; col < size; col++) {
            boolean win = true;
            for (int row = 0; row < size; row++) {
                if (grid[row][col] != symbol) {
                    win = false;
                    break;
                }
            }
            if (win)
                return true;
        }
        return false;
    }

    // Check both DIAGONALS
    // Top-left → Bottom-right: (0,0), (1,1), (2,2)
    // Top-right → Bottom-left: (0,2), (1,1), (2,0)
    private boolean checkDiagonals(char[][] grid, int size, char symbol) {

        // Left diagonal: (0,0) → (1,1) → (2,2)
        boolean leftDiag = true;
        for (int i = 0; i < size; i++) {
            if (grid[i][i] != symbol) {
                leftDiag = false;
                break;
            }
        }

        // Right diagonal: (0,2) → (1,1) → (2,0)
        boolean rightDiag = true;
        for (int i = 0; i < size; i++) {
            if (grid[i][size - 1 - i] != symbol) {
                rightDiag = false;
                break;
            }
        }

        return leftDiag || rightDiag;
    }

    // Draw = board is full AND no one has won
    // (Board already checks isFull — Game.java calls both)
    public boolean isDraw(char[][] grid, int size, char[] symbols) {
        // Check no symbol has won
        for (char symbol : symbols) {
            if (hasWon(grid, size, symbol))
                return false;
        }
        return true; // board full + no winner = draw
    }
}