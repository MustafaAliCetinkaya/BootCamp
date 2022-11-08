package basicsReplit;

import java.util.Scanner;

public class FourOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first number");
        double number1 = input.nextDouble();

        System.out.println("Please enter your second number");
        double number2 = input.nextDouble();

        System.out.println("Please choose one of the below mentioned operations\n"
                + "1-Multiply\n" +
                "2-Division\n" +
                "3-Addition\n" +
                "4-Subtraction");
        int option = input.nextInt();

        switch (option) {
            case 1: {
                System.out.println(number1 * number2);
            }
            break;
            case 2: {
                System.out.println(number1 / number2);
            }
            break;
            case 3: {
                System.out.println(number1 + number2);
            }
            break;
            case 4: {
                System.out.println(number1 - number2);
            }
            break;
            default: {
                System.out.println("Unexpected operation value which is incalculable: " + option);
            }

        }


    }
}
