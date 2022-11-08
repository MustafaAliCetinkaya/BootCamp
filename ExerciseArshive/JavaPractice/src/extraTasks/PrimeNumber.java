package extraTasks;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number less than or equals to 200: ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        String showYourNumber;

        boolean primeNumber=number%2!=0&&number%3!=0&&number%5!=0&&number%7!=0&&number%11!=0&&number%13!=0;
        boolean oddButNotPrime=!primeNumber&&number%2!=0&&number < 200;

        showYourNumber= (number > 200) ? "Error! "+ number + "  is grater than 200."
                :(primeNumber) ? "Congratulations! You typed a PRIME NUMBER. "+number+"  is a prime number that have only 2 factors: 1 and itself."
:(number%2==0) ? number + "  is an even number."
                :(number%2!=0) && (oddButNotPrime) ? (number + "  is an odd number. But it is not prime!") : (number + "  is also an odd number.");

        System.out.println(showYourNumber);
    }
    }

