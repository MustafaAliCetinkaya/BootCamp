package w3Resources;

import java.util.Scanner;

public class FindTheResult {
    public static void main(String[] args) {
            /*
    Task 6: Create a class which is "FindTheResult" create a variable
    int a=15;
         if a is divisable by 3 add 20
         if a is divisable by 5 add 25
         if a is divisable by 15 add 50
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            number+= 50;
            System.out.println("According to rule new number is  = " + number);
            ;
        } else if (number % 3 == 0) {
            number+= 20;
            System.out.println("According to rule new number is  = " + number);
        } else if (number % 5 == 0) {
            number+= 25;
            System.out.println("According to rule new number is = " + number);
        } else {
            System.out.println(number + " is not dividable by 3 or 5");

        }
    }
}

