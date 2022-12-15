package myInterviewPreperationQuestions;

import java.util.Arrays;

public class SortArrayWithoutMethod {
    public static void main(String[] args) {
        int nums[] = {45, 67, 34, -12, 89, 56, 49};
        System.out.println("Normal: "+Arrays.toString(nums));
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
        System.out.println("Sorted: "+Arrays.toString(nums));
    }
}
