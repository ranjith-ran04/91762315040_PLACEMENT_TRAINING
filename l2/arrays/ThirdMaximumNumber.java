public class ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {
        Long first = null, second = null, third = null;

        for (int num : nums) {
            long n = num;

            if (n == first || n == second || n == third)
                continue;

            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            } else if (second == null || n > second) {
                third = second;
                second = n;
            } else if (third == null || n > third) {
                third = n;
            }
        }

        return third == null ? first.intValue() : third.intValue();
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        System.out.println("Third Maximum: " + thirdMax(nums));
    }
}
