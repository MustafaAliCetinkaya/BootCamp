package officeHour.recepBySolvingProblems;

import java.util.Arrays;

/* // create a 2d array of fruits, has fruits, price, count
    // print --> apple price is 10 dollar, 100 left.*/
public class Task7 {
    public static void main(String[] args) {
        Object[][] fruitx = {{"apple", "$" + 20, 45}, {"banana", "$" + 10, 98}, {"cherry", "$" + 8, 75}};
        for (Object[] each : fruitx) {
            System.out.println(Arrays.toString(new String[]{each[0] + " price is " + each[1] + ", " + each[2] + " left"}));
        }

        System.out.println("-----------------------");

        String[][] fruits = new String[3][];

        String[] fruit = {"apple", "banana", "pear"};
        String[] price = {"10", "12", "4"};
        String[] count = {"100", "190", "200"};

        fruits[0] = fruit;
        fruits[1] = price;
        fruits[2] = count;

        System.out.println(Arrays.deepToString(fruits));

        for (int i = 0; i < 3; i++) {
            String name = fruits[0][i];
            String price1 = fruits[1][i];
            String count1 = fruits[2][i];

            System.out.println(name + " price is " + price1 + " dollar, " + count1 + " left.");
        }
    }
}
