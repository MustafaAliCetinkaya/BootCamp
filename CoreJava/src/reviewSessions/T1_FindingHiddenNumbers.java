package reviewSessions;

import java.util.Random;
import java.util.Scanner;

public class T1_FindingHiddenNumbers {
/*

 -- Task 1: Find the number taht given a hidden number between 1 and 100 randomly created.

 Hint:   Random random=new Random();

        int hiddenNumber = random.nextInt(100) + 1;
 */

    public static void main(String[] args) {

        // int hidenNumber=6; this is not logical
        Random random=new Random();
        // create a number from 0 (inclusive) to 10 (exclusive)
        int hiddenNumber = random.nextInt(10) + 1; // we have one number in that variable from 1 to 10
        Scanner scanner=new Scanner(System.in);
        boolean flag=true;
        do {
            System.out.println("Enter a number");
            int searchedNumber= scanner.nextInt();
            if (searchedNumber==hiddenNumber){
                System.out.println("you find number Congrats!");
                flag=false;
            }else {
                System.out.println("try again!");
            }

        }while (flag);

    }
}
