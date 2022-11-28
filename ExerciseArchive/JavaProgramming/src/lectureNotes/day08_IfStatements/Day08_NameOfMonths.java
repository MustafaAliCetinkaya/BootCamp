package lectureNotes.day08_IfStatements;

import java.util.Scanner;

public class Day08_NameOfMonths {
    public static void main(String[] args) {
        System.out.println("Please enter a number from 1 to 12");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        boolean months=number>=1&&number<=12;

        if(months) {

            if (number == 1) {
                System.out.println("January");
            } else if (number == 2) {
                System.out.println("February");
            } else if (number == 3) {
                System.out.println("March");
            } else if (number == 4) {
                System.out.println("April");
            } else if (number == 5) {
                System.out.println("May");
            } else if (number == 6) {
                System.out.println("June");
            } else if (number == 7) {
                System.out.println("July");
            } else if (number == 8) {
                System.out.println("August");
            } else if (number == 9) {
                System.out.println("September");
            } else if (number == 10) {
                System.out.println("October");
            } else if (number == 11) {
                System.out.println("November");
            } else {
                System.out.println("December");
            }
        }
        else
        {System.out.println("You entered an invalid number!\nPlease enter a new number from 1 to 12 and try again.");}
    }
}
