package interviewQuestions;

import java.util.Arrays;

public class Interview_MissingOddNumber {
    public static void main(String[] args) {
        int [] nums={17,13,7,9,11,3,15,1};
        int missing=0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i+1]-nums[i]!=2)
                missing=nums[i]+2;
        }
        System.out.println(missing);
    }

}
