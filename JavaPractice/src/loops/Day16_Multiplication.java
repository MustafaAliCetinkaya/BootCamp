package loops;

import java.util.Scanner;

public class Day16_Multiplication {
    public static void main(String[] args) {
        System.out.println ("Please enter first number:");
        double number1=new Scanner (System.in).nextDouble ();
        System.out.println ("Please enter second number:");
        double number2=new Scanner (System.in).nextDouble ();

        double result=0;

        if(number1>0&&number2>0){
            for (int i = 0; i <=number2 ; i++) {
                result+=number1;
            }System.out.println ("This program multiplies "+number1+" and  "+number2+" without using multiplication (*) \n" +
                    "operator. The result is "+result);
        }
        else {
            System.out.println ("invalid");
        }
    }
}
