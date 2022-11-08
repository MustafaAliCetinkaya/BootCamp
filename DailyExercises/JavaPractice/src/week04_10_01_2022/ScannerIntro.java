package week04_10_01_2022;

import java.util.Scanner;

public class ScannerIntro {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter one intiger number");
        int intValue = scanner.nextInt();
        System.out.println("intValue = " + intValue);
/*
        System.out.println("please give me double number");
        double doubleValue= scanner.nextDouble();
        System.out.println("doubleValue = " + doubleValue);


 */
        scanner.nextLine(); //in order to get Enter button from the user
        System.err.println("give me the sentence");
        String sentence = scanner.nextLine(); // we will use in order to get the sentence
        System.out.println("sentence = " + sentence);


        String sentence2=scanner.nextLine();

        System.out.println("sentence2 = " + sentence2);

        scanner.close();

    }
}
