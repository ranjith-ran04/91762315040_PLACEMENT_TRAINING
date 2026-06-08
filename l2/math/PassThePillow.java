package l2.math;
public class PassThePillow {
    public static int passThePillow(int n, int time) {
        int cycle = 2 * (n - 1);
        int t = time % cycle;
        if (t < n) return 1 + t;
        return n - (t - (n - 1));
    }

    public static void main(String[] args) {
        System.out.println("Pillow Holder: " + passThePillow(4, 5));
    }
}
