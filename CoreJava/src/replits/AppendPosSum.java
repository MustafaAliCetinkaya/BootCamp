package replits;

import java.util.ArrayList;
import java.util.Arrays;

/*Finish the method called appendPosSum() that will take an ArrayList<Integer> argument
list and returns an ArrayList<Integer>. The ArrayList return should have
only positive numbers with the sum of all those positive numbers added to the end of
the list. The appendPosSum() method is already called in the main method with an argument.*/
public class AppendPosSum {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(4, -6, 3, -8, 0, 4, 3));
        System.out.println(appendPosSum(nums));
    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {
        int temp = 0;
        list.removeIf(p -> p <= 0);
        for (Integer each : list) {
            temp += each;

        }
        list.add(temp);
        return list;
    }
}
