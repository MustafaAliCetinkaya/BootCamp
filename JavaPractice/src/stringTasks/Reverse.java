package stringTasks;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Please enter a word: ");
        String word = input.nextLine ();
        int lengthOfWord = word.length ();

        if (lengthOfWord < 5) {
            System.out.println ("Too short!");
        } else if (lengthOfWord > 5) {
            System.out.println ("Too long!");
        } else {
            StringBuffer word2 = new StringBuffer (word);
            System.out.println (word2.reverse ());
        }
        input.close ();


    }
}
