package replits;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfDuplicates {
   /* public static int getDup(String[] arr) {
        String result = "";

        for (String each : arr) {
            int count = 0;
            for (String temp : arr) {
                if (each.equals(temp)) {
                    count++;
                }
            }
            if (count == 1) {
                while (!result.contains(each)) {
                    result += each + ",";
                }
            }
        }
        System.out.println(result);
        String[] temResult = result.split(",");
        int answer = arr.length-temResult.length;
        return answer;
    }*/

    static int getDup2(String[] arr) {
       /* Finish the method called getDup() that will take a String[] argument arr
    and return an int. Find and return the number of duplicate elements. A
        ny element is duplicate if it appears in the array more than once.
        The getDup() method is already called in the main method with an argument.*/


        int result=0;

        for (String each : arr) {
            int count = 0;
            for (String temp : arr) {
                if (each.equals(temp)) {
                    count++;
                }
            }
            if(count>1){
                result++;
            }
        }
        return result;
        }



    public static void main(String[] args) {

        String[] arr = {"a", "a", "a","a", "d", "d", "6"};

        System.out.println(getDup2(arr));

    }
}