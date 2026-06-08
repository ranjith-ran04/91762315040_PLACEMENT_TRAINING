package l2.math;
public class CommonFactors {
    public static int commonFactors(int a, int b) {
        int min = Math.min(a, b);
        int count = 0;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Common Factors: " + commonFactors(12, 6));
    }
}
