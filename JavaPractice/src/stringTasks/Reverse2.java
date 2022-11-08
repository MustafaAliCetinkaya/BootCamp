package stringTasks;

import java.util.Scanner;

public class Reverse2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("Please enter a word: ");
        String word = keyboard.nextLine ();
        int lengthOfWord = word.length ();

        if (lengthOfWord < 5) {
            System.out.println ("Too short!");
        } else if (lengthOfWord > 5) {
            System.out.println ("Too long!");
        } else {
            System.out.println (word.substring (4)+word.substring (3,4)+ word.substring (2,3) + word.substring (1,2) + word.substring (0,1));
        }
        keyboard.close ();


    }
}
