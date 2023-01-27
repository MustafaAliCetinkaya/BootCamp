package officeHour.quizPreparation;

import java.util.*;

public class MapQuestion {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(3,1,4,1,2,3,4,5,7,23,83));
        Set<Integer> set = new LinkedHashSet<>();

        for(Integer eachNumber:numbers){
            set.add(eachNumber);
            if (eachNumber == 7) {
                set.add(null);
            }
        }
        System.out.println(set);
    }

}
