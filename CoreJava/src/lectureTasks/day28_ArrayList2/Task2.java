package lectureTasks.day28_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*write a program that can swap the first and last elements of an
integer arraylist
            ex:
                list = [1,2,3,4,5];
                output: [5,2,3,4,1];*/
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(nums);
        Collections.reverse(nums);
        System.out.println(nums);
    }
}
