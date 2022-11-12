package reviewSessions.methods.methodOverloadingWrapper;

import java.util.Arrays;

public class Task3Solution2 {

     /*
    Task 3 : String numbers to sum

					Given an Array of numbers in String format, add each digit of each element and store into a different Array.

					Ex:

					Input:
					"123", "134", "513"

					Output:
					[ 6, 8, 9 ]

     */

    public static void main(String[] args) {
        String[] array={"123", "134", "513" };

        int [] result=new int[array.length];
        int index=0;
        // I need to get each string
        for (String each : array) {
            System.out.println(each);
            // I need to get each digit
            String[] eachDigit = each.split("");
            int total=0;
            for (String s : eachDigit) {
                // I can use parse int method
                int i = Integer.parseInt(s);
                total+=i;
            }

            System.out.println(Arrays.toString(eachDigit));
            System.out.println(total);
            result[index++]=total;


        }
        System.out.println(Arrays.toString(result));


    }
}