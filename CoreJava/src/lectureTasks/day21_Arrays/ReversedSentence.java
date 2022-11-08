package lectureTasks.day21_Arrays;

import java.util.Arrays;

public class ReversedSentence {
    public static void main(String[] args) {
        String sentence="Today is a good day to learn Java";
        String[] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("================================");
        String[] reversed=new String[words.length];
        int j=0;
        for (int i = words.length - 1; i >= 0; i--){
            reversed[j++]=words[i];
        }
        System.out.println(Arrays.toString(reversed));
        System.out.println("================================");
        String reversed2="";
        for (int i = words.length - 1; i >= 0; i--){
            reversed2+=words[i]+" ";
        }
        System.out.println(reversed2);

    }
}
