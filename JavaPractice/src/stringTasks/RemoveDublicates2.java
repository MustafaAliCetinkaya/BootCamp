package stringTasks;

import java.util.Scanner;

public class RemoveDublicates2 {
    public static void main(String[] args) {
        System.out.println ("Please enter something");
        String sentence=new Scanner (System.in).nextLine ();
        String result="";

        for (int i = 0; i <sentence.length () ; i++) {
            char ch=sentence.charAt (i);
            if (sentence.indexOf (ch)==sentence.lastIndexOf (ch)){//Sadece 1 defa kullanılanları seçtik
                result=result+ch;
            }
        }System.out.println (result);

    }
}
