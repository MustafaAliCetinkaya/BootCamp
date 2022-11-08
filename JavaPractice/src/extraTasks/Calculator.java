package extraTasks;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please choose your operation and write your selection as a number from written below list:");
        System.out.println("1- Multiplication, \n2- Division, \n3- Addition, \n4- Subtraction");
        int selectedOperation = input.nextInt();
        System.out.println("Your operation choice is " + "\"" + selectedOperation + "\"");

        if (selectedOperation < 1 || selectedOperation > 4) {
            System.out.println("Your selection (operation number) is out of the list. \nPlease choose your operation again and write your selection correctly!");
        }else{

        System.out.println("Enter your first number:");
        double number1 = input.nextDouble();

        System.out.println("Enter your second number:");
        double number2 = input.nextDouble();

        double multiplicationResult = number1 * number2;
        double divisionResult = number1 / number2;
        double additionResult = number1 * number2;
        double subtractionResult = number1 - number2;


        if (selectedOperation >= 1 && selectedOperation <= 4) {
            if (selectedOperation == 3) {
                System.out.println(number1 + " + " + number2 + " = " + additionResult);
            } else if (selectedOperation == 1) {
                System.out.println(number1 + " x " + number2 + " = " + multiplicationResult);
            } else if (selectedOperation == 2) {
                System.out.println(number1 + " : " + number2 + " = " + divisionResult);
            } else {
                System.out.println(number1 + " - " + number2 + " = " + subtractionResult);
            }
        }
        }
    }
}
