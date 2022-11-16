package replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*Write a method minToFront that takes an ArrayList of integers as a parameter and
that moves the minimum value in the list to the front, otherwise preserving the order of
the elements. For example, if a variable called list stores the following
values: {3, 8, 92, 4, 2, 17, 9} and you make this call: minToFront(list);
it should store the following values after the call: {2, 3, 8, 92, 4, 17, 9}
You may assume that the list stores at least one value.*/
public class MinToFront {
    public static void main(String[] args) {
        ArrayList<Integer>str=new ArrayList<>();
        str.addAll(Arrays.asList(3, 8, 92, 4, 2, 17, 9));
        System.out.println("Original list: "+str);

        int a= Collections.min(str);//Firstly save the min
        str.removeIf(p->p==a);//Then remove the min
        str.add(0,a);//And add the min to the first index
        System.out.println("Add-Dropped list: "+str);
        /*Integer [] arrayResult=str.toArray(new Integer [0]);
        System.out.println(Arrays.toString(arrayResult));*/

    }
}
