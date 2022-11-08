package replits;

import java.util.Arrays;

public class DoubleMainMethod {
    public static void main(char[] why) {
        System.out.println('a');
    }

    public static void main(String[] args) {
        System.out.println("hello");

        String s1 = "java";
        String s2 = "java";
        String s3 = new String(s1);

        System.out.println(s1 == s2);
        System.out.println(s3 == s2);
        System.out.println(s3 == s1);
        System.out.println(s3.equals(s2));
        System.out.println("*************************");

    }


}
