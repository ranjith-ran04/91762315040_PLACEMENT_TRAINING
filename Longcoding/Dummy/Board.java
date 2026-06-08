// ============================================================
// FILE: Board.java
// CLASS: Board
//
// RESPONSIBILITY: Manage the 3x3 grid — display it,
// accept moves, check if a cell is free.
//
// WHY A SEPARATE CLASS?
// → The board is a real-world THING. It has its own state
// (the grid) and its own behavior (show, update, check).
// → Game logic should NOT worry about how the grid works.
// It just tells Board: "put X at row 1, col 2" — done.
//
// WHAT DOES BOARD "KNOW"?
// - The 3x3 grid (2D array of chars)
// - The size (3)
//
// WHAT CAN BOARD "DO"?
// - Display itself
// - Place a symbol on a cell
// - Check if a cell is empty
// - Check if the board is full (draw condition)
// ============================================================
 
public class Board {
 
    private char[][] grid; // The 3x3 board
    private int size = 3; // Always 3 for Tic Tac Toe
    
    // Initialize board with empty cells marked as '-'
    public Board() {
        grid = new char[size][size];
        initializeBoard();
    }
    
    // Fill every cell with '-' to show it's empty
    private void initializeBoard() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                grid[row][col] = '-';
            }
        }
    }
    
    // Print the current state of the board
    // Output looks like:
    // - | - | -
    // - | - | -
    // - | - | -
    public void display() {
        System.out.println();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(" " + grid[row][col]);
                if (col < size - 1) System.out.print(" |"); // column divider
            }
            System.out.println();
            if (row < size - 1) {
                System.out.println("---+---+---"); // row divider
            }
        }
        System.out.println();
    }
    
    // Place a player's symbol on the board at given row, col
    // Returns true if placement was successful
    public boolean placeSymbol(int row, int col, char symbol) {
        if (!isCellEmpty(row, col)) {
            System.out.println(" ✗ Cell already taken! Try again.");
            return false;
        }
        grid[row][col] = symbol;
        return true;
    }
    
    // Check if a specific cell is empty
    public boolean isCellEmpty(int row, int col) {
        return grid[row][col] == '-';
    }
    
    // Check if the board is completely filled (used for draw check)
    public boolean isFull() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (grid[row][col] == '-') return false; // still empty cell
            }
        }
        return true; // no empty cell found → board is full
    }
    
    // Expose grid to GameLogic for win checking
    // (GameLogic needs to READ the grid, not modify it)
    public char[][] getGrid() {
        return grid;
    }
    
    public int getSize() {
        return size;
    }
}
 
// ============================================================
// LESSON FOR JUNIORS:
// -------------------
// Notice Board does NOT check for a winner.
// That's GameLogic's job (next file).
//
// Board ONLY knows about the grid.
// This is the Single Responsibility Principle in action:
// "One class = One job."
//
// If we put win-checking inside Board, then Board has
// TWO jobs → harder to maintain and test later.
// ============================================================