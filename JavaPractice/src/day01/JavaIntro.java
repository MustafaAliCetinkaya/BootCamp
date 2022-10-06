package day01;

import java.util.Scanner;

public class JavaIntro {
    public static void main(String[] args) {
/*        3. write a program that can check if the first and last characters of the string are same
        ex:
        level
        output:
        same*/

        Scanner input=new Scanner (System.in);
        System.out.println ("Please enter a word");
        String word=input.next ();

        String first=word.substring (0,1);
        String last=word.substring (word.length ()-1);

      /*  char first=word.charAt (0);
        char last=word.charAt (word.length ()-1);*/

        if(first.equals (last)){
            System.out.println ("same");
        }else {
            System.out.println ("not");
        }




    }
}

