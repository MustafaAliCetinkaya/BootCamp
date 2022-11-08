package basicsReplit;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Reading_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter  a triple-digit number");
        int number = input.nextInt();
        int unitsDigit = number % 10;
        int tensDigit = (number / 10) % 10;
        int hundredsDigit = number / 100;

        switch (hundredsDigit) {
            case 1:
            {
                System.out.print("one hundred and ");
            }
            break;
            case 2:
            {
                System.out.print("two hundred and ");
            }
            break;
            case 3:
            {
                System.out.print("three hundred and ");
            }
            break;
            case 4:
            {
                System.out.print("four hundred and ");
            }
            break;
            case 5:
            {
                System.out.print("five hundred and ");
            }
            break;
            case 6:
            {
                System.out.print("six hundred and ");
            }
            break;
            case 7:
            {
                System.out.print("seven hundred and ");
            }
            break;
            case 8:
            {
                System.out.print("eight hundred and ");
            }
            break;
            case 9:
            {
                System.out.print("nine hundred and ");
            }
            break;
            default:{
                System.out.println("You didn't enter a triple-digit number!"); break;
            }
        }

        switch (tensDigit) {
            case 1:
            {
                System.out.print("ten-");
            }
            break;
            case 2:
            {
                System.out.print("twenty ");
            }
            break;
            case 3:
            {
                System.out.print("thirty ");
            }
            break;
            case 4:
            {
                System.out.print("forty ");
            }
            break;
            case 5:
            {
                System.out.print("fifty ");
            }
            break;
            case 6:
            {
                System.out.print("sixty ");
            }
            break;
            case 7:
            {
                System.out.print("seventy ");
            }
            break;
            case 8:
            {
                System.out.print("eighty ");
            }
            break;
            case 9:
            {
                System.out.print("ninety ");
            }
            break;
            default:{
                System.out.println("You didn't enter a triple-digit number!");
            }
            break;
        }

        switch (unitsDigit) {
            case 1:
            {
                System.out.print("one");
            }
            break;
            case 2:
            {
                System.out.print("two");
            }
            break;
            case 3:
            {
                System.out.print("three");
            }
            break;
            case 4:
            {
                System.out.print("four");
            }
            break;
            case 5:
            {
                System.out.print("five");
            }
            break;
            case 6:
            {
                System.out.print("six");
            }
            break;
            case 7:
            {
                System.out.print("seven");
            }
            break;
            case 8:
            {
                System.out.print("eight");
            }
            break;
            case 9:
            {
                System.out.print("nine");
            }
            break;
        }
    }
}
