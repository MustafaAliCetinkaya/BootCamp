package replits;

/*Write a method called mode that returns the most frequently occurring element
of an array of integers. Assume that the array has at least one element and that
 every element in the array has a value between 0 and 100 inclusive. Break ties
 by choosing the lower value.

For example, if the array passed contains the values {27, 15, 15, 11, 27},
your method should return 15. (Hint: You may wish to look at the Tally program
from earlier in this chapter to get an idea of how to solve this problem.)

*/
public class MostFrequentlyOccurringElement {
    public static void main(String[] args) {
        int[] array = {27, 15, 15, 11, 27, 34, 101, 34, 11};
        System.out.println(mode(array));

    }

    public static int mode(int[] a) {
        int most = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int temp = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    temp++;
                }
            }
            if (temp > count) {
                count = temp;
                    most = a[i];
            } else if (temp==count) {
                if(most>a[i]){
                    most=a[i];
                }
            }
        }
        return most;
    }
}
