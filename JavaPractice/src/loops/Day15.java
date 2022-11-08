package loops;

import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
/*        Tasks:
        1. Write a program that can return the sum of even numbers between 1 to 100
        2. Write a program that can return the sum of odd numbers between 1  to 100
        3. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
        input: 100
        output: 5050
        input: 50
        output: 1275*/
        Scanner input = new Scanner (System.in);
        System.out.println ("Please enter a number. Compiler will give the sum of all numbers between 1 to any given number");
        int number = input.nextInt ();
        int sum2 = 0;
        input.close ();
        for (int j = 0; j <= number; j++) {
            sum2 += j;
        }
        System.out.println ("the sum of all numbers between 1 to any given number= " + sum2);

        int sum1 = 0;
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                sum1 += i;
            }
        }
        System.out.println (" the sum of even numbers between 1 to 10= " + sum);
        System.out.println (" the sum of odd numbers between 1 to 10= " + sum1);
    }
}
