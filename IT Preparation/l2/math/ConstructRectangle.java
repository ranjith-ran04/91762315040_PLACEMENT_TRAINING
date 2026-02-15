package l2.math;
import java.util.Arrays;

public class ConstructRectangle {
    public static int[] constructRectangle(int area) {
        for (int w = (int) Math.sqrt(area); w > 0; w--) {
            if (area % w == 0)
                return new int[]{area / w, w};
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] result = constructRectangle(37);
        System.out.println("Rectangle: " + Arrays.toString(result));
    }
}
