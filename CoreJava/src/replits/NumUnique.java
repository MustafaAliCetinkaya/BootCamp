package replits;

import java.util.ArrayList;

/*Write a method named numUnique that takes three integers as parameters and that returns
the number of unique integers among the three. For example, the call numUnique(18, 3, 4)
should return 3 because the parameters have 3 different values. By contrast, the call
numUnique(6, 7, 6) would return 2 because there are only 2 unique numbers among the three
parameters: 6 and 7.*/
public class NumUnique {
    public static void main(String[] args) {
        System.out.println(numUnique(4, 6, 7));
        System.out.println(numUnique(4, 4, 7));
        System.out.println(numUnique(7, 7, 7));
    }

    public static int numUnique(int a, int b, int c) {

        ArrayList<Integer> result = new ArrayList<>();

        if (!result.contains(a)) {
            result.add(a);
        }
        if (!result.contains(b)) {
            result.add(b);

        }
        if (!result.contains(c)) {
            result.add(c);

        }
        return result.size();
    }
}
