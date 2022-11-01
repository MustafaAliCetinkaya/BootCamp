package lectureTasks.day21_Arrays;

import java.util.Arrays;

/*1. Write a program that sort the array of integer in descending
        order*/
public class SortDescending {
    public static void main(String[] args) {
        int[] numbers = {912, 364, 56, 178, 89, 89};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
/*  2. Write a program that can count the even and odd number from an
        array of integers*/
        int even=0;
        int odd=0;

        for (int i : numbers) {
            if(i%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Odd Numbers in the array: "+odd+"\nEven Numbers: "+even);
    }
}
