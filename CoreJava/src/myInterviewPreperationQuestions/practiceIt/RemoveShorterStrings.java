package myInterviewPreperationQuestions.practiceIt;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Write a method removeShorterStrings that takes an ArrayList of Strings as a parameter and that removes from each successive pair of values the shorter string in the pair. For example, suppose that an ArrayList called list contains the following values: {"four", "score", "and", "seven", "years", "ago"} In the first pair, "four" and "score", the shorter string is "four". In the second pair, "and" and "seven", the shorter string is "and". In the third pair, "years" and "ago", the shorter string is "ago". Therefore, the call: removeShorterStrings(list); should remove these shorter strings, leaving the list as follows: "score", "seven", "years". If there is a tie (both strings have the same length), your method should remove the first string in the pair. If there is an odd number of strings in the list, the final value should be kept in the list.
 */
public class RemoveShorterStrings {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("four", "score", "and", "seven", "years", "ago"));
        System.out.println(list);
        removeShorterStrings(list);
    }

    public static void removeShorterStrings(ArrayList<String> list) {
        ArrayList<String> removedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i += 2) {
            if (list.get(i).length() < list.get(i + 1).length()) {
                removedList.add(list.get(i + 1));
            } else {
                removedList.add(list.get(i));
            }
        }
        System.out.println(removedList);//should remove these shorter strings, leaving the list as follows: "score", "seven", "years".
    }
}


