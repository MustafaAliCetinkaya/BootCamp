package lectureTasks.day26_Wrapper_Classes;

import java.util.Arrays;

/*Swap Task:
2.1 Create a method named swap that passes three parameters: integer
array, integer i, integer j. the method swaps the element at index i with
the element at index j, and returns the new array*/
public class Task2 {
    public static void main(String[] args) {
        int []arr = {10, 20, 30, 40, 50};
        System.out.println("Swapped array: "+Arrays.toString(swap(arr, 2, 4)));
    }

    public static int[] swap(int[] array, int i, int j){
        int[] swap=new int[array.length];
        int temp1=array[i];
        int temp2=array[j];
            for (int n = 0; n < swap.length; n++) {
                if(n!=i){
                    swap[n]=array[n];
                }else{
                  continue;
                }
            }
        swap[j]=temp1;
        swap[i]=temp2;
        return swap;
    }
}
