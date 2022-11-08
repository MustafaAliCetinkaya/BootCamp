package reviewSessions.arrays;

import java.util.Arrays;

public class Shift {
    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        int temp = x[0];

        for (int i = 0; i < x.length; i++) {
            if (i == x.length - 1) {
                x[x.length - 1] = temp;
            } else {
                x[i] = x[i + 1];
            }
        }
        System.out.println(Arrays.toString(x));
    }
}
