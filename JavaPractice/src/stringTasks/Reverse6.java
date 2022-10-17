package stringTasks;

import java.util.Scanner;

public class Reverse6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println ("Please enter a sentence. Compiler will reverse it");
        String sentence = input.nextLine ();
        int length = sentence.length ();

        for (int i = length - 1; i >= 0; i--) {
            char ch = sentence.charAt(i);
            System.out.println(ch);
        }
    }
}
