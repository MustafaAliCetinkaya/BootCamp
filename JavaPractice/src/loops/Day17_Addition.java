package loops;

import java.util.Scanner;

public class Day17_Addition {
    public static void main(String[] args) {
        /*    2. Write a program that calculates the sum of numbers entered by the
    user until user enters a negative number.
            hint: you need an infinite loop*/
        Scanner input = new Scanner (System.in);
        int count=0;
        int result=0;

        while (true) {
            System.out.println ("Please enter a positive number");
            int number = input.nextInt ();

            if(number<0)
                break;

            result += number;
            count++;
        }
        System.out.println ("You entered "+count+" number so far. Addition of these numbers : "+result);
    }
}
