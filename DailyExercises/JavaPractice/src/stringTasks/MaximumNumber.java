package stringTasks;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println ("Please enter 5 positive number then the program will return the maximum positive number. Let's start!");

        double max=0;
        for (int i = 1; i <6 ; i++) {
            System.out.println ("Please enter "+i+". "+"number:");
            double number=input.nextDouble ();
            if(number>=max){
                max=number;
            }
        }
        System.out.println ("The maximum number is "+"'"+max+"'");
    }
}
