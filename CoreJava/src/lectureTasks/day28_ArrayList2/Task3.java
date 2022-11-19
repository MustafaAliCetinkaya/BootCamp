package lectureTasks.day28_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

/*3. write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]*/
public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer each : nums) {
            if (each % 2 == 0)
                result.add(each);
            else
                result.add(each * 2);
        }
        System.out.println(result);
    }
}
