package replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class TargetSum {
    public static void main(String[] args) {
        //this is a static method and cannot call an instance method without an object
        int[] arr = {3, 4, 7, 2, 5, 8, 5, 8};
        int target = 9;

        System.out.println(Arrays.toString(sumResult(arr, target)));
        //System.out.println(Arrays.toString(new TargetSum().sumResult(arr, target)));
    }


    public static Object[] sumResult(int[] arr, int target) {
        ArrayList<Integer> container = new ArrayList<>();

        for (int each : arr) {
            for (int temp : arr) {
                if (each + temp == target)
                    if (!container.contains(each)||!container.contains(temp))
                    container.addAll(Arrays.asList(each, temp));
            }
        }

        Object sumResult[] = container.toArray();
        return sumResult;
    }
}

