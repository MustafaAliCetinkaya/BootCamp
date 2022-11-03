package replits;

import java.util.Arrays;

public class CharFrequency {
    public static void main(String[] args) {
        String word = "fdgdkflgdğsksdfsdfklsmdğf";
        String each = "";

        for (int j = 0; j < word.length(); j++) {
            String element = "" + word.charAt(j);
            int frequency = 0;
            for (int i = 0; i < word.length(); i++) {
                if (element.equals("" + word.charAt(i))) {
                    frequency++;
                }
            }
            if (frequency == 2) {
                System.out.print(word.charAt(j) + " - ");
            }
        }
    }
}

