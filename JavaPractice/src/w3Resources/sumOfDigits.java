package w3Resources;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Write a Java program and compute the sum of the digits of an integer.
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number which has maximum four digits:");
        int fourDigitsNumber = input.nextInt();

        if (fourDigitsNumber < 10000) {
            int unitsDigit = fourDigitsNumber % 10;
            fourDigitsNumber = fourDigitsNumber / 10;

            int tensDigit = fourDigitsNumber % 10;
            fourDigitsNumber = fourDigitsNumber / 10;

            int hundredsDigit = fourDigitsNumber % 10;
            fourDigitsNumber = fourDigitsNumber / 10;

            int thousandsDigit = fourDigitsNumber % 10;
            fourDigitsNumber = fourDigitsNumber / 10;

            System.out.println("thousandsDigit : " + thousandsDigit);
            System.out.println("hundredsDigit :  " + hundredsDigit);
            System.out.println("tensDigit :         " + tensDigit);
            System.out.println("unitsDigit :        " + unitsDigit);
            System.out.println("******************************");
            System.out.println("We are done. \nMission (Write a Java program and compute the sum of the digits of an integer) is completed.");
            System.out.println("The sum of the digits: " + (thousandsDigit + hundredsDigit + tensDigit + unitsDigit));
        }
        else {
            System.out.println("Please enter a four digits number and try again!");
        }
    }
}
