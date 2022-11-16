package replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*Write a method swapPairs that switches the order of values in an ArrayList of Strings
in a pairwise fashion. Your method should switch the order of the first two values,
then switch the order of the next two, switch the order of the next two, and so on.
For example, if the list initially stores these values: {"four", "score", "and", "seven",
"years", "ago"} your method should switch the first pair, "four", "score", the second pair,
"and", "seven", and the third pair, "years", "ago", to yield this list: {"score", "four",
"seven", "and", "ago", "years"}*/
public class SwapPairs2 {
    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList<>();
        words.addAll(Arrays.asList("to", "be", "or", "not", "to", "be", "hamlet" ,"skull"));

        System.out.println("Original array: "+words);

        for(int i=0;i<=words.size()-2;i+=2){
            Collections.swap(words,i,i+1);

        }
        System.out.println("Swapped array: "+words);


    }
}
