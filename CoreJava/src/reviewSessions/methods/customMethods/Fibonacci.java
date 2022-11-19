package reviewSessions.methods.customMethods;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        ArrayList<Integer>fibonacci=new ArrayList<>();
        fibonacci.addAll(Arrays.asList(0,1));

        for (int i = 0; i < fibonacci.size(); i++) {
            fibonacci.add(fibonacci.get(i)+fibonacci.get(i+1));
            if(i>100)
                break;
        }
        System.out.println(fibonacci);

    }
}
/*Task 6 :  Fibonacci

                Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.

                Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

                Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

                    Ex:
                        Input:
                            8
                        Output:
                            0, 1, 1, 2, 3, 5, 8, 13, 21

                            1- Create one method and only print the numbers
                            2- You will return the numbers
                            3- Yuo will put that numbers into the array then you will return it*/
