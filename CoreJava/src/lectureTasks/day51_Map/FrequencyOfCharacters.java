package lectureTasks.day51_Map;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";
        //           bca
        //           235
        //Collections.frequency()

       String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>(); // {b=2, c=3, a=5}

        for (String each : arr) { // each: characters of string
            int frequency = Collections.frequency( Arrays.asList(arr), each);
            result.put(each,  frequency  );
        }

        System.out.println(result);
        System.out.println("-------------------------------------------------------------");
        Integer maxFrequency=Integer.MIN_VALUE;
        String maxName="";

        for (Map.Entry<String, Integer> eachEntry : result.entrySet()) {
            if(eachEntry.getValue() > maxFrequency){
                maxFrequency=eachEntry.getValue();
                maxName=eachEntry.getKey();
            }
        }

        System.out.println("Max frequency is: "+maxFrequency+" and it's key is: "+maxName);


    }

}

/*
2. Write a program that can return the frequency of characters
        Not: MUST use map

        Ex: str = "bbcccaaaaa"

        output:
            {b=2, c=3, a=5}
 */