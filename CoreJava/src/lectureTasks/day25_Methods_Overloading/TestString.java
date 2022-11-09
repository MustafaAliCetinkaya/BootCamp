package lectureTasks.day25_Methods_Overloading;

import utilities.StringUtility;

public class TestString {

    public static void main(String[] args) {

        String sentence = "Java Programming Language";

        StringUtility.printEachChar(sentence);

        System.out.println("----------------------------------------");

        String s1 = "Cydeo School";

        String reverse = StringUtility.reverse(s1);

        System.out.println(reverse);

        System.out.println("-----------------------------------------");

        String word = "Java";

        boolean palindrome = StringUtility.isPalindrome(word);

        System.out.println("palindrome = " + palindrome);

        System.out.println("-----------------------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }
        }

        System.out.println(count);

        System.out.println("-----------------------------------------");

        String s2 = "aaaaabbbbbbccccddddd";

        String nonDup = StringUtility.removeDup(s2);

        System.out.println(nonDup);

        System.out.println("-----------------------------------------");
        String word1 = "earth";
        String word2 = "heart";
        System.out.println(StringUtility.isAnagram(word1, word2));

        System.out.println("-----------------------------------------");

        String sentence2="qwşlqwşlqwşlqwğdfudftdfş";
        System.out.println(StringUtility.uniqueChars(sentence2));

        System.out.println("-----------------------------------------");
        String sentence3="I love Java programming very very much folks";
        System.out.println(StringUtility.frequencyOfChars(sentence3));

    }
}
