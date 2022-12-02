package replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CloseStrings {
    public static void main(String[] args) {
        System.out.println(closeStrings("javax", "aajvy"));
    }

        public static boolean closeStrings(String word1, String word2) {
            boolean isCloseStrings=true;
            ArrayList<Character> temp1=new ArrayList<>();
            for (char each: word1.toCharArray()) {
                temp1.add(each);
            }
            ArrayList<Character> temp2=new ArrayList<>();
            for (char each: word2.toCharArray()) {
                temp2.add(each);
            }

            if(word1.length()!=word2.length()){
                isCloseStrings= false;
            } else{
                Collections.sort(temp1);
                Collections.sort(temp2);
                if (!temp1.equals(temp2))
                    isCloseStrings=false;
            }
            return isCloseStrings;
        }

}
