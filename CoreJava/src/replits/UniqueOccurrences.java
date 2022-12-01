package replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueOccurrences {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 1, 1, 5, 5, 5, 5, 13, 13};
        boolean isUniqueOccurrences = true;

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.addAll(Arrays.asList(arr));
        String temp = "";

        for (int i = 0; i < arr2.size(); i++) {
            int frequency = Collections.frequency(arr2, arr2.get(i));
            arr2.removeAll(Arrays.asList(arr2.get(i)));

            if (!temp.contains("" + frequency)) {
                temp += frequency;
            }else {
                isUniqueOccurrences=false;
            }

            i--;
        }
        System.out.println(isUniqueOccurrences);
    }
}

/*Given an array of integers arr, return true if the number of occurrences of each value
 in the array is unique, or false otherwise.

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values
 have the same number of occurrences.*/
