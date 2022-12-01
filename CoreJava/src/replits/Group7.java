package replits;

import java.util.ArrayList;
import java.util.Arrays;

public class Group7 {
    public static void main(String[] args) {
/*        String s1 = "cydeo";
        String s2 = "cydeo";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println("----------------------");
        int[] arr1 = {3, 2, 1};
        int[] temp = {};
        temp = arr1;
        System.out.println(temp == arr1);
        System.out.println(temp.equals(arr1));
        System.out.println("----------------------");
        int[] arr2 = {3, 2, 1};
        int[] dummy;
        dummy = arr2;
        System.out.println(dummy == arr2);
        System.out.println(dummy.equals(arr2));
        System.out.println("----------------------");
        System.out.println(arr2 == arr1);
        System.out.println(dummy == temp);
        System.out.println("----------------------");
        System.out.println(arr2.equals(arr1));
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println("----------------------");
        String[] words = {"Alican", "Hakan", "Selami"};
        for (String each : words) {
            System.out.print(each.substring(0, 2) + " ");
        }
        System.out.println();
        for (String each : words) {
            System.out.println("" + each.charAt(0) + each.charAt(each.length() - 1));
        }
        System.out.println("----------------------");
        int[] nums = {23, 45, 67, 89, -12, 87};
        Arrays.sort(nums);
        System.out.println(nums[nums.length - 1]);
        System.out.println("----------------------");
        int arr[] = {1, 34, 56, 87, 88, 39};
        int count = 0;


        for (int each : arr) {
            if (each % 2 == 0)
                count++;
        }

        int result[] = new int[count];
        int i=0;

        for (int each : arr) {
            if (each % 2 == 0)
                result[i++]= each;
        }

        System.out.println(Arrays.toString(result));*/
        System.out.println("----------------------");
        String names="Ali, Veli";
        String[]words={"Kara", "Ak","Kara", "Ak"};
        ArrayList<String> temp=new ArrayList<>(Arrays.asList(words));
        System.out.println(temp);

        ArrayList<String> temp2=new ArrayList<>(Arrays.asList("Ak"));

        temp.removeAll(temp2);
        System.out.println(temp);




    }
}