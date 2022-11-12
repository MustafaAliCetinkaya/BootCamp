package replits;

import java.util.Arrays;

/*Write a method called median that accepts an array of integers as its argument and
returns the median of the numbers in the array. The median is the number that will
appear in the middle if you arrange the elements in order. Assume that the array
is of odd size (so that one sole element constitutes the median) and that the numbers
 in the array are between 0 and 99 inclusive.*/
public class Median {
    public static void main(String[] args) {
        int[] arr1 = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        int[] arr2 = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 27, 89, 15, 10, 29, 27};
        System.out.println(median(arr1));
        System.out.println(median(arr2));
    }

    public static int median(int[] a) {
        int median = 0;
        Arrays.sort(a);
        if (a.length % 2 == 0) {
            median = (a[a.length / 2] + a[a.length / 2 - 1]) / 2;
        } else {
            median = a[a.length / 2];
        }
        return median;
    }
}
