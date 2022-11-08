package w3Resources;

import java.util.Scanner;
public class specialCharacter {
    /*Create a class called Character Identity, and write a program that can identify
    if the given character is a digit or Alphabetic Character(A~Z  or a~Z) or a special character*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a character: ");
        char symbol = scan.next().charAt(0);

        if ((symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z')) {
            System.out.println(symbol + " is an alphabet.");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + " is a digit.");
        } else {
            System.out.println(symbol + " is a special character.");
        }
    }
}
