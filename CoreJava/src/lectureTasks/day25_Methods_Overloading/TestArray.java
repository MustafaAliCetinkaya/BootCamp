package lectureTasks.day25_Methods_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

import static utilities.ArraysUtility.replace;
import static utilities.ArraysUtility.replaceAll;

public class TestArray {

        public static void main(String[] args) {

            int[] arr1 = {1987, 20989, 35, 64, 51};

            ArraysUtility.printEachElement(arr1);
            System.out.println(Arrays.toString(ArraysUtility.reverse(arr1)));
            System.out.println("Maximum number is: "+ArraysUtility.max(arr1));

            System.out.println("--------------------------------");

            double[] arr2 = {19.5, 2.5, 3.5, 44.5};

            ArraysUtility.printEachElement(arr2);
            System.out.println(ArraysUtility.contains(arr2, 56));
            System.out.println(ArraysUtility.min(arr2));

            System.out.println("--------------------------------");

            char[] arr3 = {'A', 'B', 'C', 'D'};

            ArraysUtility.printEachElement(arr3);
            System.out.println(ArraysUtility.contains(arr3, 'J'));
            System.out.println(Arrays.toString(ArraysUtility.addElement(arr3,'Ğ')));

            System.out.println("--------------------------------");

            String[] names = {"David", "Elvira", "Ali", "Igor", "Ali","Elvira"};

            ArraysUtility.printEachElement(names);
            System.out.println(Arrays.toString(ArraysUtility.unique(names)));
            System.out.println(Arrays.toString(ArraysUtility.removeDup(names)));


            System.out.println("--------------------------------");

            int[] n1 = {10,1,2,4,1,6,3,4,5,3,6,10,4};

            int max1 = ArraysUtility.max(n1);

            System.out.println("max1 = " + max1);
            System.out.println(ArraysUtility.frequency(n1, 4));
            System.out.println(Arrays.toString(ArraysUtility.unique(n1)));

            System.out.println("--------------------------------");

            double[] n2 = {2.3, 4.5, 6.6, 7.8, 20.5};

            double max2 = ArraysUtility.max(n2);

            System.out.println("max2 = " + max2);
            System.out.println(ArraysUtility.min(n2));

            System.out.println("--------------------------------");


            int[] a1 = {189,256,3,445,5,6,7};

            boolean r1 = ArraysUtility.contains(a1, 10);

            System.out.println("r1 = " + r1);
            ArraysUtility.addElement(a1,1453);
            System.out.println(Arrays.toString(ArraysUtility.remove(a1, 2)));

            System.out.println("--------------------------------");

            int[] arr8 = {1,2,3,4,5};

            arr8 = replace(arr8, 2, 30);

            System.out.println(Arrays.toString(arr8));

            System.out.println("------------------------------------");

            String[] arr7 = {"Java", "Python", "C++", "Ruby"};

            arr7 = replace(arr7, 2, "C#");

            System.out.println(Arrays.toString(arr7));

            System.out.println("------------------------------------");

            int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};
            //            0   1   2   3   4   5   6   7

            arr = replaceAll(arr, 30, 300);

            System.out.println(Arrays.toString(arr));

            arr = replaceAll(arr, 300, 500);

            System.out.println(Arrays.toString(arr));
        }
    }

