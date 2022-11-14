package lectureTasks.day28_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

/*Write a method removeEvenLength that takes an ArrayList of Strings as a parameter
and that removes all of the strings of even length from the list.
*/
public class RemoveEvenLength {
    public static void main(String[] args) {
        String[] str = {"Did", "you", "solve", "it", "or", "what?"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
        removeEL(list);

    }

    public static void removeEL(ArrayList<String> list) {

        list.removeIf(each -> each.length() % 2 == 0);//Lambda function

        System.out.println(list);
    }
}
