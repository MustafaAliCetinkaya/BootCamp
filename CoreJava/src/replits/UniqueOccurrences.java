package replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueOccurrences {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 1, 1, 5, 7, 7, 7, 7, 9, 9, 9, 9, 9, 9 , 9, 9};
        boolean isUniqueOccurrences = true;

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.addAll(Arrays.asList(arr));
        String temp1 = "";
        String temp2 = "";

        for (int i = 0; i < arr2.size(); i++) {
            int frequency = Collections.frequency(arr2, arr2.get(i));
            if (temp2.contains("" + arr2.get(i))) {
                continue;
            } else {
                temp2 += arr2.get(i);
                if (!temp1.contains("" + frequency)) {
                    temp1 += frequency;
                } else {
                    isUniqueOccurrences = false;
                }
            }
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
