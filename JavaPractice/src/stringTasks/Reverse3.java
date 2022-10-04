package stringTasks;

import java.util.Scanner;

public class Reverse3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String reverse = "";

        System.out.println ("Please enter a word and I will tell if the string is palindrome or not");
        String x = scanner.nextLine ();
        int length = x.length ();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + x.charAt (i);//""+ sayesinde char olan sayısal harfleri stinge födüştürüp kelime yapıyor.
        }
        if (x.equalsIgnoreCase (reverse)) {
            System.out.println ("it is palindrome");
        } else {
            System.out.println ("it is not palindrome");
        }
    }
}

