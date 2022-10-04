package stringTasks;

import java.util.Scanner;

public class Day14_4 {
    /*    Ask user to enter two words. Then add them together and print.
        But if the last letter if the first word and the first letter of the
        last letter is the same,
        print that character once.*/
    public static void main(String[] args) {
        Scanner item = new Scanner (System.in);
        System.out.println ("Please enter your first word: ");
        String word1 = item.nextLine ();
        System.out.println ("Please enter your second word: ");
        String word2 = item.nextLine ();

        if (word1.charAt (word1.length () - 1) != word2.charAt (0)) {
            System.out.println (word1 + word2);
        } else {
            System.out.println (word1 + word2.substring (1));
        }
        
        item.close ();
    }
}
