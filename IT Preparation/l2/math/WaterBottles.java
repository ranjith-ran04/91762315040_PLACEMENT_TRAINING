package l2.math;
public class WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            total += newBottles;
            numBottles = newBottles + (numBottles % numExchange);
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Total Bottles: " + numWaterBottles(9, 3));
    }
}
