package replits;

import java.util.ArrayList;
import java.util.Arrays;

/*Write a method removeDuplicates that takes as a parameter a sorted ArrayList of Strings
and that eliminates any duplicates from the list. For example, suppose that a variable
called list contains the following values:
{"be", "be", "is", "not", "or", "question", "that", "the", "to", "to"} After calling
removeDuplicates(list); the list should store the following values:
{"be", "is", "not", "or", "question", "that", "the", "to"}*/

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList<>();
        words.addAll(Arrays.asList("be", "be", "is", "not", "or", "question", "that", "the", "to", "to"));
        System.out.println("With duplicates: "+words);

        ArrayList<String>newWords=new ArrayList<>();

        for (String each : words) {
            if(!newWords.contains(each)){
                newWords.add(each);
            }
        }

        System.out.println("Without duplicates: "+newWords);

    }
}
