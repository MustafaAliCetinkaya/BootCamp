package lectureTasks.Day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseReplit {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINES:
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }

        //WRITE YOUR CODES BELOW:
        int length=arr.length;
        String arr2 []=new String[length];
        for (String word : arr) {
            arr2[length-1]=word;
            length--;
            }
        System.out.println(Arrays.toString(arr2));


        System.out.println("--------------------------------------------------");


/*        String arr3 []=new String[length];
        int j=0;
            for (int i = arr2.length - 1; i >= 0; i--) {
                arr3[j++]=arr2[i];


        }System.out.println(Arrays.toString(arr3));*/
    }

}

