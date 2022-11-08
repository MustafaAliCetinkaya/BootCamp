package loops;

import java.util.Scanner;

public class Day17_Division {
    public static void main(String[] args) {
        /*    1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.*/
        Scanner input = new Scanner (System.in);
        System.out.println ("Please enter first number");
        int number1 = input.nextInt ();
        System.out.println ("Please enter second number");
        int number2 = input.nextInt ();
        int numerator=number1;
        int frequency=0;

        while(number1>=number2){
           number1= number1-number2;
            frequency++;
        } System.out.println (numerator+" : "+number2+" = "+frequency+" with a reminder of "+number1);



    }
}

