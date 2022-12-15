package string_tasks;

import java.util.*;

public class String_MostFrequentWord {
    // write a program that finds the  highest number of times repeated word in a string.

    public static void main(String[] args) {

        String str = "How many times any word repeated many many times in this sentence";

        String[] arr = str.split(" ");

        Map<String, Integer> unSortedMap = new LinkedHashMap<>();

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), each);
            unSortedMap.put(each, frequency);
        }

        Map<String, Integer> reverseSortedMap = new LinkedHashMap<>();

        unSortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        System.out.println("Unsorted Map : " + unSortedMap);
        System.out.println("Reverse (descending order) Sorted Map   : " + reverseSortedMap);

    }

}
