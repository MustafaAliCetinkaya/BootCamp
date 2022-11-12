package replits;
/*
 * Write a method named lastIndexOf that accepts an array of integers and
 * an integer value as its parameters and returns the last index at which
 * the value occurs in the array. The method should return -1 if the value
 * is not found.
 */

public class LastIndexOf {
    public static void main(String[] args) {
        int result=lastIndexOf(new int[]{74, 85, 102, 99, 101, 85, 56},90);
        System.out.println(result);
    }

    public static int lastIndexOf(int[] array, int value) {

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
