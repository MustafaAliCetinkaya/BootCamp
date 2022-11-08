package lectureNotes;

import java.util.Scanner;

public class Day09_MinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int number1 = input.nextInt();

        System.out.println("Please enter second number: ");
        int number2 = input.nextInt();

        String result="";
        result=number1<number2 ? (number1+" is the minimum number between two different numbers") : (number2+" is the minimum number between two different numbers");
        System.out.println(result);
    }
}
