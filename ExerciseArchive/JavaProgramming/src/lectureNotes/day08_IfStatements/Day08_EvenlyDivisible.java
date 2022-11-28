package lectureNotes.day08_IfStatements;

import java.util.Scanner;

public class Day08_EvenlyDivisible {
    public static void main(String[] args) {
        System.out.println("Please enter a number less than or equals to 200: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean primeNumber=number%2!=0&&number%3!=0&&number%5!=0&&number%7!=0&&number%11!=0&&number%13!=0;
        boolean oddButNotPrime=!primeNumber&&number%2!=0&&number < 200;

        if (number > 200) {
            System.out.println("Error! "+ number + "  is grater than 200.");
        }
        else if (primeNumber) {
            System.out.println("Congratulations! You typed a PRIME NUMBER. "+number+"  is a prime number that have only 2 factors: 1 and itself.");
        }
        else if (number%2==0) {
            System.out.println(number + "  is an even number.");
        }
        else if (number%2!=0) {
            if (oddButNotPrime) {
                System.out.println(number + "  is an odd number. But it is not prime!");
            } else {System.out.println(number + "  is also an odd number.");}
        }


    }
}
