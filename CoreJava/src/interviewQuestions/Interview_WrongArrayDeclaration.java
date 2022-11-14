package interviewQuestions;

import java.util.Arrays;

public class Interview_WrongArrayDeclaration {
    public static void main(String[] args) {
        /*int [] nums= int[10];   Wrong  */
        float[] nums2={2,5,6,78};
        int a[]={4,7,9}; int [] b; b=a;
        System.out.println(Arrays.toString(b));

    }
}
