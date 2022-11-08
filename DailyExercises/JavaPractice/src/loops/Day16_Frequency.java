package loops;

import java.util.Scanner;

public class Day16_Frequency {
    public static void main(String[] args) {
        System.out.println ("Please enter a string:");
        String sentence=new Scanner (System.in).nextLine ();
        System.out.println ("Please enter a character:");
        char ch=new Scanner (System.in).next ().charAt (0);
        int frequency = 0;

        for (int i = 0; i < sentence.length (); i++) {

            if (ch== (sentence.charAt (i))){
                frequency++;
            }
        }
        System.out.println ("The frequency of the char in the given string is "+frequency);
    }
}
