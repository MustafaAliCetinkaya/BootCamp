package loops;

import java.util.Scanner;

public class Day15_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println ("Please enter a number");
        int number=input.nextInt ();

        int result=1;

        for (int i = 1; i <=number ; i++) {
            result=result*i;

        }      System.out.println (result);

    }
}
