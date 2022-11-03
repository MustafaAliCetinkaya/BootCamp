package replits;

import java.util.Arrays;

public class CharFrequency {
    public static void main(String[] args) {
        String word = "fdgdkflgdğsksdfsdfklsmdğf";
        String result="";

        for (int j = 0; j < word.length(); j++) {
            int frequency = frequencyFinder(word,word.charAt(j));

            if (frequency == 2) {
                if (!result.contains(""+word.charAt(j))) {
                    result += word.charAt(j) + " - ";
                }
            }
        }System.out.print(result);
    }
    public static int frequencyFinder(String str, char ch){
        int count=0;
        for(char each:str.toCharArray()){
            if(ch==each){
                count++;
            }
        } return count;
    }
}

