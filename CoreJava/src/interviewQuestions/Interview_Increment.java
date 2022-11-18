package interviewQuestions;

import java.util.Arrays;

public class Interview_Increment {
    public static void main(String[] args) {
        int a, b, c;
        a = 9;
        b = 10;
        c = ++a + b++;

        System.out.println(c);
        System.out.println(b);
        System.out.println(a);

        System.out.println("-------------------------------");

        int i = 0;
        i = i++ + i;
        System.out.println("i = " + i);

        System.out.println("-------------------------------");

    }
}
