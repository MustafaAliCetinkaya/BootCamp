package replits;

import java.util.Arrays;

public class PalindromeString {
    public static void main(String[] args) {
        String sentence="çekoslavakyalilastiramadiklarimizdan misiniz?";
        String reversed="";
        for (int i = sentence.length()-1; i >=0 ; i--) {
            reversed+=sentence.charAt(i);
        }
        System.out.println(reversed);
        System.out.println("-------------------------------------------");
        char word []={'a','k','r','a'};
        char [] rev=new char[word.length];
        int j=0;
        for (int i = word.length - 1; i >= 0; i--) {
            rev[j++]=word[i];
        }
        System.out.println(Arrays.toString(rev));
    }
}
