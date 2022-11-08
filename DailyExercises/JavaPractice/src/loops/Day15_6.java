package loops;

import java.util.Scanner;

public class Day15_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Please enter something. Does not matter what it is");
        String something = input.nextLine ();
        int length = something.length ();

        String alldigits="";
        for (int i = 0; i < length; i++) {
            if ((something.charAt (i) >= '0' && something.charAt (i) <= '9')) {
                alldigits += something.charAt (i);
            }
        }System.out.println ("All of the digits from the string: " + alldigits);

        int number=Integer.parseInt (alldigits);
        int sum=0;
        for (int i = 0; 0 < number; i++) {
            sum = sum + number % 10;
            number = number / 10;
            }System.out.println ("Sum of digits from the string: " + sum);
    }
}

/*        int commonsum = 0;
        for (int i = 0; i < length; i++) {
            if ((something.charAt (i) >= '0' && something.charAt (i) <= '9')) {
                commonsum += something.charAt (i) - 48;
            }
        }System.out.println ("Sum of digits from the string: " + commonsum);*/
