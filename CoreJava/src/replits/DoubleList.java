package replits;

import java.util.ArrayList;
import java.util.Arrays;

/*Write a method doubleList that takes an ArrayList of Strings as a parameter and
that replaces every string with two of that string. For example, if the list stores
the values {"how", "are", "you?"} before the method is called, it should store the values
{"how", "how", "are", "are", "you?", "you?"} after the method finishes executing.*/
public class DoubleList {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.addAll(Arrays.asList("to", "be", "or", "not", "to", "be", "hamlet" ,"skull"));

        System.out.println("Original array: "+words);

        for (int i=0;i<=words.size()-2;i+=2){
            words.add(i, words.get(i));
        }

        System.out.println("Doubled array: "+words);
    }
}
