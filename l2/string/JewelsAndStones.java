package l2.string;
public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char c : stones.toCharArray()) {
            if (jewels.indexOf(c) != -1)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Jewels: " +
                numJewelsInStones("aA", "aAAbbbb"));
    }
}
