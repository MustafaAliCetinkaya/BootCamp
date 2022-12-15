package myInterviewPreperationQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class Interview_CharFrequency2 {
    public static void main(String[] mali) {
        String words = "AnkaraxyAnkaraxyAnkara";

        String result = "";

        for (int i = 0; i < words.length(); i++) {
            char each = words.charAt(i);

            int count = 0;
            for (int j = 0; j < words.length(); j++) {
                if (words.charAt(j) == each) {
                    count++;
                }
            }
            if (count == 2) {
                if (!result.contains("" + each)) {
                    result += each + " ";
                }
            }
        }
        System.out.println(result);

        System.out.println("-------- Second Solution: By using ArrayList method ---------");

        ArrayList<Character> chars = new ArrayList<>();
        for (Character each : words.toCharArray()) {//Converts the primitive array to ArrayList.
            chars.add(each);
        }

        ArrayList<Character> answer = new ArrayList<>();
        for (Character each : chars) {
            int freq = Collections.frequency(chars, each);
            if (freq == 2) {
                if (!answer.contains(each)&&each!=' ')
                answer.add(each);
            }
        }
        System.out.println(answer);
    }
}

