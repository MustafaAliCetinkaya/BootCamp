package lectureTasks.day52_MapContinueFunctionalInterfaceLambdaIntro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assigment {
    public static void main(String[] args) {
        List<Integer> keyNumbers = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            keyNumbers.add(i);
        }

        System.out.println("All keys: " + keyNumbers);

        System.out.println("===================================================");

        List<String> valuesOfNumbers = new ArrayList<>();
        for (Integer eachKeyNumber : keyNumbers) {
            String eachValuesOfNumbers =
                    eachKeyNumber % 15 == 0 ?
                            "FINRA" : eachKeyNumber % 5 == 0 ?
                            "FIN" : eachKeyNumber % 3 == 0 ?
                            "RA" : "EMPTY";
            valuesOfNumbers.add(eachValuesOfNumbers);
        }

        System.out.println("All values: " + valuesOfNumbers);
        System.out.println("===================================================");

        Map<Integer, String> finraMap = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            finraMap.put(keyNumbers.get(i), valuesOfNumbers.get(i));
        }

        System.out.println(finraMap);
        System.out.println("===================================================");

        for (Map.Entry<Integer, String> eachKeyAndValue : finraMap.entrySet()) {
            System.out.println("Each Key and Value: " + eachKeyAndValue);
        }
        System.out.println("===================================================");
        int count = 1;
        // forEach(action) method to iterate map
        finraMap.forEach((k, v) -> System.out.println("Key = "
                + k + ", Value = " + v));

    }
}
