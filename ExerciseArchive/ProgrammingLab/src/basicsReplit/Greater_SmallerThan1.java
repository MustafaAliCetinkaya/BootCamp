package basicsReplit;

import java.util.Scanner;

public class Greater_SmallerThan1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter your first number");
        double number1=input.nextDouble();

        System.out.println("Please enter your second number");
        double number2=input.nextDouble();

        // There are two ways. 1-Ternary 2- If

        String result = number1 < number2 ? number1+" is smaller than "+number2 : number1+" is greater than "+number2;
        System.out.println(result);

    /*    if(number1<number2){
            System.out.println(number2+" is greater than "+ number1);
        }
        else if(number1>number2){
            System.out.println(number1+" is greater than "+ number2);
        }
        else {
            System.out.println(number1+" is equals to "+ number2);
        }*/

    }


}
