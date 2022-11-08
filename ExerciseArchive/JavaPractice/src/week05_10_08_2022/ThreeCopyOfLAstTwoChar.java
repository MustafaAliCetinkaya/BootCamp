package week05_10_08_2022;

public class ThreeCopyOfLAstTwoChar {

    public static void main(String[] args) {
        /*
        Task 2: Create a logic print a new string made of 3 copies of the last 2 chars of the original string.
input:Hello
output:lololo

      Hint: The string length will be at least 2.
         */
        String word = "Hello";
        int indexOfLastChar = word.length() - 1; //index of o
        int indexOfSecondFromLast=word.length()-2;//index of l
        char last=word.charAt(indexOfLastChar);
        char beforeLast=word.charAt(indexOfSecondFromLast);
        String lastTwo=""+beforeLast+last;
        System.out.println(lastTwo+lastTwo+lastTwo);


    }
}
