package replits;

import java.util.ArrayList;
import java.util.Arrays;

/*Write a method stutter that takes an ArrayList of Strings and an integer k as parameters
and that replaces every string with k copies of that string. For example, if the list stores
 the values ["how", "are", "you?"] before the method is called and k is 4, it should store
 the values ["how", "how", "how", "how", "are", "are", "are", "are", "you?", "you?", "you?",
  "you?"] after the method finishes executing. If k is 0 or negative, the list should be
  empty after the call.*/
public class CopyProducer {
    public static void main(String[] args) {
        String[]words={"how", "are", "you"};
        ArrayList<String>list=new ArrayList<>(Arrays.asList(words));
        stutter(list,5);
        System.out.println(list);
    }

    public static void stutter(ArrayList<String> list, int k) {
        int size = k * (list.size());
        if (k <= 0) {
            list.clear();
        } else {
            for (int i = 0; i < size; i += k) {
                for (int j = 1; j < k; j++)
                    list.add(i, list.get(i));
            }
        }

    }
}
