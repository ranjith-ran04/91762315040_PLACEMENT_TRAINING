public class Player {

    // Private fields — no one can directly touch these
    private String name;
    private char symbol;

    // Constructor — sets player details when created
    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for symbol
    public char getSymbol() {
        return symbol;
    }

    // Useful when printing player info
    @Override
    public String toString() {
        return name + " (" + symbol + ")";
    }
}