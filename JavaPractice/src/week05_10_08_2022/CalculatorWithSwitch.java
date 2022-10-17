package week05_10_08_2022;

import java.util.Scanner;

public class CalculatorWithSwitch {
/*
we will create a basic calculator which has +, -, /, *
with the Switch case



 */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter first number");
        double number1= scanner.nextDouble();

        System.out.println("Please enter second number");
        double number2= scanner.nextDouble();

        System.out.println("Please enter your operator");
        char operator = scanner.next().charAt(0);
        // String operator=scanner.next();
        //we don't have nextChar() method so we need to use our String method which is charAt(0);
        double result=0;


        switch (operator){
            case '+':
                result=number1+number2;
                break;
            case '-':
                result=number1-number2;
                break;
            case '/':
                result=number1/number2;
                break;
            case '*':
                result=number1*number2;
                break;

            default:
                System.out.println("operator is wrong");
                break;

        }
        System.out.println(result);
scanner.close(); // it is not mandatory

    }
}
