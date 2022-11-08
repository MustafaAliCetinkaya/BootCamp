package lectureTasks.day24_Methods_Return;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int []arr ={1,2,3};
        int num = 4;
        System.out.println(Arrays.toString(addElement(arr,num)));

    }
    public static int [] addElement(int [] array,int addNumber){
        int [] newArray=new int[array.length+1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i]=(i!=newArray.length-1)?
                        array[i]:addNumber;
            }
        return newArray;
    }
}
