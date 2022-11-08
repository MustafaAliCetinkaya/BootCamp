package lectureTasks.day21_Arrays;

import java.util.Arrays;

public class DoubleReversed{
    public static void main(String[] args) {

        String[] arr = {"altay","cydeo","adam","muhtar","nadir"};

        int length=arr.length;
        String arr2 []=new String[length];
        for (String word : arr) {
            arr2[length-1]=word;
            length--;
            }
        System.out.println(Arrays.toString(arr2));

        System.out.println("--------------------------------------------------");

        String arr3 []=new String[arr2.length];
        int j=0;
        String reverse="";
        for (String s : arr2) {

            for (int i = s.length() - 1; i >= 0; i--) {
                reverse+=s.charAt(i);

            }arr3[j++]=reverse;reverse="";
        }System.out.println(Arrays.toString(arr3));

    }
}

