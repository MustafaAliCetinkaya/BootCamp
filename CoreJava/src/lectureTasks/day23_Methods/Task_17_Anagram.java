package lectureTasks.day23_Methods;

import java.util.Arrays;

/*
17. create a method that can check if two strings are anagram
        ex:
        anagram("silent", "listen")
        output:
        silent and listen are anagram*/
public class Task_17_Anagram {
    public static void main(String[] args) {
        anagram("a gentleman", "elegant man");
    }

    public static void anagram(String sentence1, String sentence2) {
        char[] firstWord = sentence1.toCharArray();
        char[] secondWord = sentence2.toCharArray();

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        if(Arrays.equals(firstWord,secondWord)){
            System.out.println(sentence1+" and "+sentence2+" are anagram");
        }else {
            System.out.println(sentence1+" and "+sentence2+" are not anagram");
        }

    }
}
