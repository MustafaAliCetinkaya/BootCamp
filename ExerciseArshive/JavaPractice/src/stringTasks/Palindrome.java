package stringTasks;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println ("Please enter a word and I will tell if the string is palindrome or not");
        String word=new Scanner (System.in).nextLine ();
        String reverse = "";
        int length = word.length ();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + word.charAt (i);//Strin içerde olsaydı==> String reverse=""+word.charAt olurdu. ""+ sayesinde char olan sayısal harfleri stinge födüştürüp kelime yapıyor.
        }
        if (word.equalsIgnoreCase (reverse)) {
            System.out.println ("it is palindrome");
        } else {
            System.out.println ("it is not palindrome");
        }
    }
}

