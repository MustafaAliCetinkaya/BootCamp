package lectureNotes;

import java.util.Scanner;

public class Day08_LogicalOperatorsAndIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your credit score: ");
        int creditScore = input.nextInt();

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        System.out.println("Please enter your income: ");
        int income = input.nextInt();

        boolean isEligibleforLoan = creditScore >= 700 && age >= 21 && income >= 5000;

        if (isEligibleforLoan) {
            System.out.println("Congratulations! You are eligible for loan. You're always welcome");
        }
        else {
            System.out.println("Unfortunately, you are not eligible for loan.");
        }
    }
}
