package myInterviewPreperationQuestions.practiceIt;

import java.util.*;

public class MapFrequencyOfChar {

    public static void main(String[] args) {
        String str="anmerrrrrrttttaaagggsjjjdhheeelllflf";
        frequencyOfCharacters(str);
    }
    public static void frequencyOfCharacters(String str){
        String[] arr=str.split("");
        Map<String, Integer> mapFrequency = new HashMap<>();
        Map<String, Integer> mapFrequency1 = new LinkedHashMap<>();
        Map<String, Integer> mapFrequency2 = new TreeMap<>();
        Map<String, Integer> mapUnique = new HashMap<>();

        for (String eachCharacter : arr) {
            Integer frequency=Collections.frequency(Arrays.asList(arr),eachCharacter);
            mapFrequency.put(eachCharacter,frequency);
            mapFrequency1.put(eachCharacter,frequency);
            mapFrequency2.put(eachCharacter,frequency);

            if (frequency==1){
                mapUnique.put(eachCharacter,frequency);
            }
        }
        System.out.println("All characters-HashMap: "+mapFrequency);
        System.out.println("All characters-LinkedHashMap: "+mapFrequency1);
        System.out.println("All characters-TreeMap: "+mapFrequency2);
        System.out.println("Unique characters: "+mapUnique);
    }
}
