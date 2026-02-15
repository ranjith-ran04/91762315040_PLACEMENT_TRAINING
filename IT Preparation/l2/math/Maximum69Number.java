package l2.math;
public class Maximum69Number {
    public static int maximum69Number(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '6') {
                arr[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
    }

    public static void main(String[] args) {
        int num = 9669;
        System.out.println("Maximum 69 Number: " + maximum69Number(num));
    }
}

