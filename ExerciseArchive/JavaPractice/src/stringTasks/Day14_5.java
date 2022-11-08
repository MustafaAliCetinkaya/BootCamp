package stringTasks;

import java.util.Scanner;

public class Day14_5 {
    /*    Ask user to enter a word,
    if the word starts with digits, print "first character is digit"
                if the word starts with uppercase letters, print "first character
        is lowercase letter"
                if the word starts with lowercase letters, print "first character
        is uppercase letter"
                if the word starts with special characters, print "first character
        is special character"*/
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Please enter a word: ");
        String word = input.nextLine ();

        if (word.charAt (0) >= 'A' && word.charAt (0) <= 'Z') {
            System.out.println ("The first character of " + "' " + word+" '" + " is uppercase letter." + "\nIt is " + "' " + word.charAt (0) + " '.");
        } else if (word.charAt (0) >= 'a' && word.charAt (0) <= 'z') {
            System.out.println ("The first character of " +"' " +  word +" '" + " is lowercase letter." + "\nIt is " + "' " + word.charAt (0) + " '.");
        } else if (word.charAt (0) >= '0' && word.charAt (0) <= '9') {
            System.out.println ("The first character of " + "' " + word +" '" + " is digit." + "\nIt is " + "' ." + word.charAt (0) + " '");
        } else {
            System.out.println ("The first character of " +"' " +  word +" '" + " is special character." + "\nIt is " + "' " + word.charAt (0) + " '.");
        }
    }
}
