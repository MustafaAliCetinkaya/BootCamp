package loops;

import java.util.Scanner;

public class Day16_magicLike {
    public static void main(String[] args) {
        System.out.println ("Write a long sentence with lots of \"like\" words in it:");
        String sentence=new Scanner (System.in).nextLine ();
        int frequency=0;

        for (int i = 0; i <=sentence.length ()-4; i++) {
            String likeSearchEngine=sentence.substring (i,i+4);

            if (likeSearchEngine.equalsIgnoreCase ("like")){
                frequency++;
            }
        } System.out.println ("You used this magic word (like) "+frequency+" times in your sentence");
    }
}
