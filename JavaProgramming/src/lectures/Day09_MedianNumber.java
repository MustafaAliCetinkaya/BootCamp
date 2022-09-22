package lectures;

import java.util.Scanner;

public class Day09_MedianNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int number1 = input.nextInt();

        System.out.println("Please enter second number: ");
        int number2 = input.nextInt();

        System.out.println("Please enter third number: ");
        int number3 = input.nextInt();

        String result="";
        String result2="";
        result=number1<number2&&number2<number3 ? (number2+" is the median number between three number.") : (result2);
        result2=number2<number1&&number1<number3 ? (number1+" is the median number between three number.") : (number3+" is the median number between three number.");
        System.out.println(result+result2);
    }
}
