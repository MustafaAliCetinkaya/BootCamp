package reviewSessions.arrayList;

import java.util.*;

public class WrapperClassMethods {

    public static void main(String[] args) {

//        one();
        two();
        // autoboxing
        int a = 40;
        Integer b = a;

        // unboxing
        Integer c = 50;
        int d = c;

        /*
        1. parseInt():  parse a string and return its integer value
        2. valueOf(): convert a string to an Integer object
        3. toString(): take a int/Integer's string value( convert it to string object)
        4. Integer.max or min take maximum Integer value or minimum integer value
         */

//        System.out.println(Integer.toString(123).concat("OneTwoThree"));  // "123"

        String str = "123house2589936";
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                total += Integer.valueOf("" + str.charAt(i));
            }
        }

//        System.out.println("total = " + total);
    }

    public static void one() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        String number = scanner.nextLine();

        boolean isPositive = false;

        int num = Integer.parseInt(number); //"123"
        if (num >= 0) {
            isPositive = true;
        }

        System.out.println(isPositive);
    }

    public static void two() {
        String str = "456number87459963";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (Integer.valueOf(str.charAt(i)) % 3 == 0) {
                    sum += Integer.valueOf("" + str.charAt(i));
                }
            }
        }

        System.out.println(sum);
    }
}