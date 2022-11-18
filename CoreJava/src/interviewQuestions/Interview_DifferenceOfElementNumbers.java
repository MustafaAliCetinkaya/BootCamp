package interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class Interview_DifferenceOfElementNumbers {
    public static void main(String[] args) {
        String element = "AAABBBBBBBBBBBABAAAAA";
        int a = 0;
        int b = 0;
        int result = 0;


        for (char each : element.toCharArray()) {
            if (each == 'A') {
                a++;
            } else if (each == 'B') {
                b++;
            }
        }
        result = a - b;
      /*  if (a < b)
            result = b - a;
        else if (a > b)
            result = a - b;*/

        System.out.println(Math.abs(result));

        System.out.println("-------- Second Solution: By using ArrayList method ---------");
        int result2 = 0;
        ArrayList<Character> chars = new ArrayList<>();

        for (Character each : element.toCharArray()) {//Converts the primitive array to ArrayList.
            chars.add(each);
        }

        int counta = Collections.frequency(chars, 'A');
        int countb = Collections.frequency(chars, 'B');

       /* if (counta < countb)
            result2 = countb - counta;
        else if (counta > countb)*/
            result2 = counta - countb;

        System.out.println("Second result = " + Math.abs(result2));
    }
}
