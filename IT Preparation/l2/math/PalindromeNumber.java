package l2.math;
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x, rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return original == rev;
    }

    public static void main(String[] args) {
        System.out.println("Is Palindrome: " + isPalindrome(121));
    }
}

