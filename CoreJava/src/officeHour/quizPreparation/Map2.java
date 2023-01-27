package officeHour.quizPreparation;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        for (Integer eachKey : map.keySet()) {//if we do not use keySet() method, throws error
            if (eachKey% 2 == 0) {
                System.out.print(map.get(eachKey));
            }
        }
    }
}
