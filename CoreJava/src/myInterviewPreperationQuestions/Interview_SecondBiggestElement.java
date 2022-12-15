package myInterviewPreperationQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Interview_SecondBiggestElement {//Without using sort() method

    public static void main(String[] args) {
        int nums[] = {45, 67, 34, -12, 89, 56, 49};
        System.out.println("secondMax(nums) = " + secondMax(nums));



        System.out.println("-------- Second Solution: By using ArrayList method ---------");

        ArrayList<Integer> max = new ArrayList<>();
        max.addAll(Arrays.asList(45, 67, 34, -12, 89, 56, 49));
        System.out.println("All elements: "+max);
        Integer firstmax= Collections.max(max);
        max.removeIf(p->p==firstmax);
        Collections.sort(max);//sort is not necessary
        System.out.println("Without max: "+max);
        System.out.println("Second maximum number is: "+Collections.max(max));



    }

    public static int secondMax(int[] nums) {
 /*     int max=nums[0];
        int secondMax=0;

       for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max)
                max=nums[i];
        }*/

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int tmp = 0;
                if (nums[i] > nums[j]) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        return nums[nums.length - 2];
    }

}
