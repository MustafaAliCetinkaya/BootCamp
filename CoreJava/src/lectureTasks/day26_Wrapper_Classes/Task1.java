package lectureTasks.day26_Wrapper_Classes;

import java.util.Arrays;

/*1.1 Create a method named insert that passes three
        parameters: integer array, integer index, integer element. the method
        inserts the given element to the given index of the array and returns the
        new array*/
public class Task1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(insert(arr, 2, 100)));
        System.out.println("------------------------------------------");
        System.out.println(Arrays.toString(insert2(arr,5,911)));

    }
    public static int[] insert(int[]array,int index,int element){
        int insert[]=new int[array.length+1];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < insert.length; j++) {
                if (j!=index){
                    insert[j]=array[i];
                } else {
                    insert[j]=element;
                }
            }
        }

        return insert;
    }

    public static int[] insert2(int[]array,int index,int element){
        int insert[]=new int[array.length+1];

        for (int i = 0; i < insert.length; i++) {
            insert[i]=(i!=index)? array[i]:element;//Ternary
        }
        return insert;
    }
}
