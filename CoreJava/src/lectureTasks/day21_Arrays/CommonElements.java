package lectureTasks.day21_Arrays;
/*3. Write a program that can print out the common elements from two
        integer array*/
public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {34, 56, 23, 5, 67, 89};
        int[] arr2 = {5, 999, 888, 777, 666, 555, 111};
        int common = 0;

        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) {
                    common = j;
                }
            }
        }
        System.out.println(common);
    }
}

