package officeHour;

public class Task12 {
    public static void main(String[] args) {
//        spaces(" this is java office hour    ");
//        investment(20000.0, 0.12, 5);
//        System.out.println(space("this is data base testing"));
        System.out.println(leap(2100));
    }
    //write a java method, count all the space in given string, then print the number of space
    //" this is java office hour" -- > 5


    // write a java method to calculate total money in your bank account
    // mehtod receives 3 arguents: original amount, rate, year.
    public static void investment(double amount, double rate, int year) {
        for (int i = 0; i < year; i++) {
            amount = amount + amount * rate;
        }
        System.out.println("Total amount is = " + amount);

        // amount = amount + amount*rate   1
        // amount = amount + amount*rate
    }

    public static void spaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("count = " + count);
    }

    public static int space(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    // 4. write a java method, check given year is leap year or not. return boolean
    //
    public static boolean leap(int year) {
        // year should be divisible by 4
        // year can not only be divisible by 100
        // year should be divisible by 100 and 400 at the same time

        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = ((year % 100) == 0 && (year % 400) == 0);

        return a && (b || c);


    }
}
