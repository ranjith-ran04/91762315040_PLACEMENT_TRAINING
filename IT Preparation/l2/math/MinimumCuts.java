package l2.math;
public class MinimumCuts {
    public static int numberOfCuts(int n) {
        if (n == 1) return 0;
        if (n % 2 == 0) return n / 2;
        return n;
    }

    public static void main(String[] args) {
        System.out.println("Minimum Cuts: " + numberOfCuts(4));
    }
}
