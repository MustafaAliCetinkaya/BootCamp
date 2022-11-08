package stringTasks;

import java.util.Scanner;

public class Day14_7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your account number");
        String accountNumber= input.nextLine();

        char firstChar=accountNumber.charAt(0);
        int length=accountNumber.length();

/*        System.out.println("First Character = " + firstChar);
        System.out.println("Length = " + length);*/

        String result= (firstChar=='2' && length==7) ?  ("Your account number is valid") :
                (firstChar=='5' && length==10)? ("Your account number is valid") : ("Invalid account number");
        System.out.println ("Result = " + result);

        input.close ();
    }
}
