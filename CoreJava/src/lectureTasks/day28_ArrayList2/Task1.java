package lectureTasks.day28_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

/*1. write a program that can set the last element of the Integer arraylist
to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];*/
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5));

        nums.add(nums.size(),0);
        System.out.println(nums);
    }

}
