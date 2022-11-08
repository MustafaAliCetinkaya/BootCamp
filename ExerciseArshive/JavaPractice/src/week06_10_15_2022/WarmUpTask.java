package week06_10_15_2022;

public class WarmUpTask {


    /*
    - Given a non-empty string like "Code" print a string like below output.

 *                                 Code → "CCoCodCode"
 *                                 abc → "aababc"
 *                                 ab → "aab"
     */
    public static void main(String[] args) {
        String word = "Code";

        String temp = "";

        for (int i = 1; i <= word.length(); i++) {
            String str = word.substring(0, i);
           // System.out.println(str);
            temp += str;
        }


      //  System.out.println(temp+word);
        System.out.println(temp);

    }
}
