package day01;

import java.util.Scanner;

public class JavaIntro {
    public static void main(String[] args) {
        System.out.println ("Hello Cydeo");
        System.out.println (56 + 68678);
        System.out.println (78 * 35 / 2);

        Scanner scan = new Scanner (System.in);
        System.out.println ("Please enter a word: ");
        char symbol = scan.nextLine ().charAt (0);

        if ((symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z')) {
            System.out.println (symbol +" is the first character of the word. And it is an alphabet.");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println (symbol + " is the first character of the word. And it is a digit.");
        } else {
            System.out.println (symbol + " is the first character of the word. And it is a special character.");
        }

    }
}

