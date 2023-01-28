package reviewSessions.collection.setListOthers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveWordsWithIterator {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "Cydeo", "dog"));

        //I want to remove the word which is starting with a


        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.startsWith("a")) {
                iterator.remove();
            }
        }
        System.out.println(words);

//===================================
        //remove the word which has more than 5 letters

        List<String> names = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "Cydeo", "dog"));


        Iterator<String> iterator1 = names.iterator();

        while (iterator1.hasNext()) {
            String word = iterator1.next();
            if (word.length() > 5) {
                iterator1.remove();
            }


        }
        System.out.println("names = " + names);
    }
}