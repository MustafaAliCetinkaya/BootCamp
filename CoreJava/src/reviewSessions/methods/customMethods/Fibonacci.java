package reviewSessions.methods.customMethods;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(nthFib(i));
        }
        System.out.println("------------------------------------");
        nthFib2(19);
    }

    public static int nthFib(int number){
        ArrayList<Integer>fibonacci=new ArrayList<>();
        fibonacci.addAll(Arrays.asList(0,1));

        for (int i = 0; i < fibonacci.size(); i++) {
            fibonacci.add(fibonacci.get(i)+fibonacci.get(i+1));
            if(i>1000)
                break;
        }
        if(number<0) {
            System.out.println("Invalid index! Please enter a valid number.");
        }
        return fibonacci.get(number);
    }

    public static void nthFib2(int n){
        int [] newArray=new int[n+1];
        newArray[1]=1;

        for (int i = 0; i <= newArray.length-3; i++) {
            newArray[i+2]=newArray[i+1]+newArray[i];
        }
        System.out.println(newArray[newArray.length-1]);
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
