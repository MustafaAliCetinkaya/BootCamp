package myInterviewPreperationQuestions.practiceIt;
/*
 * Write a method rarest that accepts a map whose keys are strings and whose values are
 * integers as a parameter and returns the integer value that occurs the fewest times in
 * the map. If there is a tie, return the smaller integer value. If the map is empty, throw
 * an exception. If there is a tie (two or more rarest ages that occur the same number of
 * times), return the youngest age among them.
 */

import java.util.*;

public class MapRarest {
    public static void main(String[] args) {
        Map<String,Integer>allPeople=new HashMap<>();
        allPeople.put("Alyssa",22);
        allPeople.put("Char",25);
        allPeople.put("Dan",25);
        allPeople.put("Jeff",20);
        allPeople.put("Kasey",20);
        allPeople.put("Kim",20);
        allPeople.put("Mogran",25);
        allPeople.put("Ryan",25);
        allPeople.put("Stef",22);

        rarestAge(allPeople);
    }

    public static void rarestAge(Map<String,Integer>allPeople){
        List<Integer>ages=new ArrayList<>();
        allPeople.forEach((k,v)->{
            ages.add(v);
        });

        List<Integer>frequencyOfAges=new ArrayList<>();
        Map<Integer,Integer>ageAndFrequency=new HashMap<>();

        for (Integer eachAge : ages) {
            Integer frequencyOfEachAge= Collections.frequency(ages,eachAge);
            frequencyOfAges.add(frequencyOfEachAge);
            ageAndFrequency.put(eachAge,frequencyOfEachAge);
        }
        Integer minFrequency=Collections.min(frequencyOfAges);

        for (Map.Entry<Integer, Integer> each : ageAndFrequency.entrySet()) {
            if(each.getValue()==minFrequency){
                System.out.println(each.getKey());
            }
        }

    }

}
