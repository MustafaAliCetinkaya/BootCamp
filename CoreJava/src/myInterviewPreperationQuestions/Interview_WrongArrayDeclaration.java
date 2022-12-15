package myInterviewPreperationQuestions;

import java.util.Arrays;

public class Interview_WrongArrayDeclaration {
    public static void main(String[] args) {
        /*int [] nums= int[10];   Wrong  */
        float[] nums={2,5,6,78};
        int a[]={4,7,9}; int [] b; b=a;
        System.out.println(Arrays.toString(b));

        System.out.println("-------------------------------");

        //int x [] = int [10]; Error
        int [] nums1={1,3,5};
        int nums2 []={};
        nums2=nums1;
        System.out.println("I was empty "+Arrays.toString(nums2));

        System.out.println("-------------------------------");

        int[] myIntArray1 = new int[3];
        int[] myIntArray2 = {19, 27, 35};
        int[] myIntArray3 = new int[]{1, 2, 3};

        System.out.println(Arrays.toString(myIntArray1));
        System.out.println(Arrays.toString(myIntArray2));
        System.out.println(Arrays.toString(myIntArray3));

        System.out.println("-------------------------------");

        String[] myStringArray1 = new String[3];
        String[] myStringArray2 = {"a", "b", "c"};
        String[] myStringArray3 = new String[]{"avb", "bfg", "crt"};
        String[] myStringArray4;
        myStringArray4 = new String[]{"99a09", "12b65", "432c"};
        System.out.println(Arrays.toString(myStringArray1));
        System.out.println(Arrays.toString(myStringArray2));
        System.out.println(Arrays.toString(myStringArray3));
        System.out.println(Arrays.toString(myStringArray4));

    }
}
