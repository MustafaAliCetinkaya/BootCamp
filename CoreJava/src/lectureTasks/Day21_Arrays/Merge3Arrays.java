package lectureTasks.Day21_Arrays;

import java.util.Arrays;

/*5. Write a program that can merge 3 arrays of integers*/
public class Merge3Arrays {
    public static void main(String[] args) {

        int [] arr1 = {30, 10, 20};
        int [] arr2 = {15, 40, 25, 35};
        int [] arr3 = {8, 9, 17, 5, 4, 1};

        int[] mergeArr=new int[arr2.length+arr1.length+arr3.length];
        int j=0;

        for (int i : arr2) {
            mergeArr[j++]=i;
        }
        for (int i : arr1) {
            mergeArr[j++]=i;
        }
        for (int i : arr3) {
            mergeArr[j++]=i;
        }

        Arrays.sort(mergeArr);

        System.out.println(Arrays.toString(mergeArr));

    }
}

