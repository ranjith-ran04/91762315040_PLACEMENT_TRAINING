package l2.math;
public class LargestOddNumber {
    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0)
                return num.substring(0, i + 1);
        }
        return "";
    }

    public static void main(String[] args) {
        String num = "35427";
        System.out.println("Largest Odd Number: " + largestOddNumber(num));
    }
}

