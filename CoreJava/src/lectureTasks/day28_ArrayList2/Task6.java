package lectureTasks.day28_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*Write a program that can find the minimum number from an ArrayList of
integers
Ex:
list = [1,2,3,4,5];
output:
1*/
public class Task6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));

        int min = Collections.min(list);
        System.out.println(min);

        System.out.println("-------------------------------------------");
        int tempMin = list.get(0);
        for (Integer each : list) {
            if (tempMin > each)
                tempMin = each;
        }
        System.out.println(tempMin);

    }
}
