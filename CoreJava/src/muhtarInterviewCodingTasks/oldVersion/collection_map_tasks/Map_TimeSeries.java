package collection_map_tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Map_TimeSeries {

    /*
    A time series is represented as a list of time/value pairs. Write a function whose input is two time series and whose output is a new time series of the summation of them.
        Example:
            series A: [(1, 1.0), (2, 1.5), (3, 2.0)]
            series B: [(2, 1.0), (3, 2.5), (5, 1.0)]
        Assuming we have '0' for a time pair that's missing, this is the result:

        output:
            [(1, 1.0), (2, 2.5), (3, 4.5), (5, 1.0)]
     */


    public static Map<Integer, Double> solution(Map<Integer, Double> map1, Map<Integer, Double> map2) {
        Map<Integer, Double> result = new HashMap<>();
        result.putAll(map1);
        Set<Integer> keys = new HashSet<>();
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());

        boolean flag = true;
        while (flag) {
            map2.keySet().forEach((k) -> {
                if (result.keySet().contains(k)) {
                    result.put(k, result.get(k) + map2.get(k));
                } else {
                    result.put(k, map2.get(k));
                }
            });

            if (keys.size() == result.keySet().size())
                flag = false;
        }

        return result;

    }


}
