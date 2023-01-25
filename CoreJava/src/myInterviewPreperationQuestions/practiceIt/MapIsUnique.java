package myInterviewPreperationQuestions.practiceIt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Write a method isUnique that accepts a Map from strings to strings as a parameter and returns true if no two keys map to the same value (and false if any two or more keys do map to the same value). For example, calling your method on the following map would return true:

{Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}
Calling it on the following map would return false, because of two mappings for Perkins and Reges:

{Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}
The empty map is considered to be unique, so your method should return true if passed an empty map.

*/
public class MapIsUnique {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Kendrick", "Perkins");
        map.put("Stuart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Bruce", "Ali");
        map.put("Hal", "Perkins");

        System.out.println(isUnique(map));
    }

    public static boolean isUnique(Map<String, String> map) {
        boolean isUnique = true;
        ArrayList<String> temp = new ArrayList<>();
        Set<String> keys = map.keySet();
        for (String eachKey : keys) {
            if (!temp.contains(map.get(eachKey))) {
                temp.add(map.get(eachKey));
            } else {
                isUnique = false;
            }
        }
        return isUnique;
    }
}
