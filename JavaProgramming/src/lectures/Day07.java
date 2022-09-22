package lectures;

import java.util.Scanner;

public class Day07 {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {
            System.out.println(number + " is a positive number.");
        }

        if (number == 0) {
            System.out.println(number + " is not positive or negative. It is neutral.");
        }

        if (number < 0)  {
            System.out.println(number + " is a negative number.");
        }

    }
}
