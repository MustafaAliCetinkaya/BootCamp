package lectureTasks.day28_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        //Non-primitive arrays can be directly converted between parenthesis.
        /*
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll( Arrays.asList(names) );
        */

        System.out.println(namesList);

        System.out.println("------------------------------------------------------");

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list2 = new ArrayList<>( Arrays.asList(arr));
//Non-primitive arrays can be directly converted between parenthesis.
        System.out.println(list2);

        System.out.println("-----------------------------------------------------");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
//Primitive arrays can NOT be directly converted. We need method.
        ArrayList<Integer> list3 = new ArrayList<>( convertArrayToArrayList(arr2) );

        System.out.println("list3 = " + list3);

    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {//Converts the primitive array to ArrayList.
            list.add(each);
        }

        return list;
    }

}
