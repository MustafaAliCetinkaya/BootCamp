package stringTasks;

import java.util.Scanner;

public class Reverse4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println ("Please enter a word");
        String word = scan.next ();
        String result = "";
        int totalChars = word.length ();

        if (totalChars < 5) {
            result = "Too short!";

        } else if (totalChars > 5) {
            result = "Too long!";
        } else {
            result = "" + word.charAt (4) + word.charAt (3) + word.charAt (2) + word.charAt (1) + word.charAt (0);
        }
        System.out.println (result);
        scan.close ();
    }
}
