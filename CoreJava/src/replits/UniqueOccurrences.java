package replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueOccurrences {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 1, 1, 5, 7, 7, 7, 7};
        boolean isUniqueOccurrences = true;

        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(arr));
        int count = 0;

        for (Integer each : arr2) {
            int frequency=Collections.frequency(arr2, each);
            if(count!=frequency){
                count=frequency;
                arr2.removeAll()
            }else {
                isUniqueOccurrences=false;
                break;
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
