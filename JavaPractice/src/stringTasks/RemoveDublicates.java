package stringTasks;

import java.util.Scanner;

public class RemoveDublicates {
    public static void main(String[] args) {
        System.out.println ("Please enter a sentence");
        String sentence=new Scanner (System.in).nextLine ();
        String result="";

        for (int i = 0; i <=sentence.length ()-1 ; i++) {
            String newSentence=""+sentence.charAt (i);
            if (!result.contains (newSentence)){
                result=result+newSentence;
            }System.out.println ("Characters: "+newSentence);
        }System.out.println (result);

    }
}
