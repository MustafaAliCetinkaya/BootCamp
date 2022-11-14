package interviewQuestions;

public class Interview_SecondBiggestElement {//Without using sort() method

    public static void main(String[] args) {
        int nums[] = {45, 67, 34, -12, 89, 56, 49};
        System.out.println("secondMax(nums) = " + secondMax(nums));
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
        return nums[1];
    }
}
