package reviewSessions.methods.customMethods;

import java.util.ArrayList;
import java.util.Arrays;

/*Task 3 :

Create a method that get two arrays as a parameters then return the arraylist
which has contains unique elements in it.

first array :1,2,3,4,5

second array :4,5,6

output:

1,2,3,4,5,6*/
public class MergeUnique {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5, 1, 45};
        int[] arr2 = {4, 5, 6, 13, 34, 3, 4};
        System.out.println(mergeArrays(arr1, arr2));
    }

    public static ArrayList<Integer> mergeArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer>result=new ArrayList<>();

        for (int i : arr1) {
            if (!result.contains(i))
                result.add(i);
        }

        for (int i : arr2) {
            if (!result.contains(i))
                result.add(i);
        }

        return result;
    }
}
