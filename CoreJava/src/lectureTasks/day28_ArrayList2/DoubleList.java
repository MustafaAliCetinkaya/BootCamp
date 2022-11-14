package lectureTasks.day28_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

/*Write a method doubleList that takes an ArrayList of Strings as a parameter
and that replaces every string with two of that string. For example, if the list stores
the values {"how", "are", "you?"} before the method is called, it should store
the values {"how", "how", "are", "are", "you?", "you?"} after the method finishes executing.
 */
public class DoubleList {
    public static void main(String[] args) {
        String[] str = {"Did", "you", "solve", "it", "or", "what?"};
        String[] str2={"how", "are", "you?"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str2));

        doubleList(list);
        doubleList(list2);

    }

    public static void doubleList(ArrayList<String> list) {
        for(int i=0;i<list.size();i+=2){
            list.add(i,list.get(i));

        }
        System.out.println(list);
    }
}
