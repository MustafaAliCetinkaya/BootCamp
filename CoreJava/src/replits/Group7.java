package replits;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Group7 {
    public static void main(String[] args) {
        int [] result = {};
        int[] num = {12, 34, 54, 13, 61, 54};

        for (int each:num) {
            if(each%2!=0) {
                result=ArraysUtility.addElement(result,each);
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
