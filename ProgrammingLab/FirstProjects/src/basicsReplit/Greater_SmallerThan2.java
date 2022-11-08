package basicsReplit;

import java.util.Scanner;

public class Greater_SmallerThan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first number");
        double number1 = input.nextDouble();

        System.out.println("Please enter your second number");
        double number2 = input.nextDouble();

        System.out.println("Please enter your third number");
        double number3 = input.nextDouble();

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is greatest number ");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is greatest number ");
        } else if (number3 > number1 && number3 > number2) {
            System.out.println(number3 + " is greatest number ");
        } else {
            System.out.println(" All numbers are equal");
        }

    }
}

