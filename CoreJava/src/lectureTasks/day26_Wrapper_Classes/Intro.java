package lectureTasks.day26_Wrapper_Classes;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        String number="198340";
        double number2=Double.parseDouble(number);
        System.out.println(number2);
        System.out.println("-------------------------");
        byte a=Byte.MAX_VALUE;
        byte b=Byte.MIN_VALUE;
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println("-------------------------");
        System.out.println("Short values: "+Short.MIN_VALUE+" / "+Short.MAX_VALUE);
        System.out.println("-------------------------");
        System.out.println("Double values: "+Double.MIN_VALUE+" / "+Double.MAX_VALUE);
        System.out.println("-------------------------");
        String s1 = "maybe";

        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1);

        System.out.println("--------------------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2); //Integer
        int y = Integer.valueOf(s2);// Integer

        System.out.println(x);
        System.out.println(y);

        String s3 = "1.5";
        Double z = Double.valueOf(s3);// Double

        System.out.println(z);

        System.out.println("-----------------------------------------------------");
    }
}
