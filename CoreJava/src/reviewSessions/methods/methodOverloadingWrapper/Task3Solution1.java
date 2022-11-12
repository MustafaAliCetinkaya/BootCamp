package reviewSessions.methods.methodOverloadingWrapper;

import java.util.Arrays;

/*Task 3 : String numbers to sum
                    
                    Given an Array of numbers in String format, add each digit of 
                    each element and store into a different Array.
                    
                    Ex:
                    
                    Input:
                    “123”, “34”, “513” 

                    Output:
                    [ 6, 7, 9 ]*/
public class Task3Solution1 {
    public static void main(String[] args) {
        String[] numbers={"123","34","513"};
        System.out.println(Arrays.toString(sum(numbers)));
    }
    public static int [] sum(String[] str){
        int[] result=new int[str.length];
        int i=0;

        for (String each : str) {
            int sumOfNumbers=0;
            for (char temp : each.toCharArray()) {
                int j=Integer.parseInt(""+temp);
                    sumOfNumbers += j;
                }
            result[i++]=sumOfNumbers;
            }
        return result;
        }

    }

