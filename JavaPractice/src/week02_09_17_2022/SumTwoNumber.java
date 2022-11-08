package week02_09_17_2022;

public class SumTwoNumber {

    public static void main(String[] args) {

        /*
        1. Create a class named SumTwoNumber, write a Java program to print the sum of two numbers.
         */

        //declare first variable
        int firstNumber = 10;

        //declare the second variable
        int secondNumber = 20;

        //adding two variable and assign in another variable
        int sum = firstNumber + secondNumber;

        //print the result

        //  System.out.println(sum);
        System.out.println(sum);
        System.out.println("sum = " + sum);

        // first number + secondNumber = sum (value)


        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        // int+      String+ int        +String +  int       + int
        // String           +int        +String +   int       +int
        // String                        +String  +   int      + int

        System.out.println(firstNumber + " + " + secondNumber + " = " + firstNumber + secondNumber);
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));

        int a = 30;
        String s = "30";

        String res = s + a;
        String s1 = s + a;

        //automatically assign for mac option +enter+enter
        //automatically assign for windows alt +enter+enter

        //String + int  concatenation
        System.out.println(s + a);
        //3030
        
        


/*
firstNumber+ " + "+secondNumber+" = "+firstNumber+secondNumber
  - 10+ =>String
  - 10+20 =>String
  - 10+20= =>String
  - 10+20=10 =>String
  - 10+20=1020



 */


    }


}
