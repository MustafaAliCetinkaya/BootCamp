package officeHour.assigmentPreparation;

import java.util.Arrays;

public class Test1 {
    /* line 3 */ public static int minNum(int []nums){//Method name must be like this.
        Arrays.sort(nums);
        return nums[0];
    }
    public static void main(String[] args) {
        int[] arr = {4,1,0,8,-9,3,4};
        int min = minNum(arr);//do not write anything.
        System.out.println(min);//In order to see the result, we must print it.
    }
}
