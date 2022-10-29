package reviewSessions.arrays;

public class Task4_LongestPalindrome {

    public static void main(String[] args) {
/*
 Task 4 :  For Each - Nested For
Longest Palindrome
Given a String array. Find the longest Palindrome String in your array.
 Ex:
Input: ["java", "longer word", "civic" "apple", "racecar", "mom", "anna"] Output: racecar
 Ex:
Input: ["abc", "dna", "kevin", "joe", "lamp"]
Output: No palindrome
 */

        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna","raxexar"};

        String longestPalindrome = "";

        for (String eachWord : words) {

            //is palindrome or not
            boolean isPalindrome = true;

            for (int i = 0; i < eachWord.length() / 2; i++) {
                //"racecar"
                char ch1 = eachWord.charAt(i);
                char ch2 = eachWord.charAt(eachWord.length() - i - 1);

                if (ch1 != ch2) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome && eachWord.length() > longestPalindrome.length()) {
                longestPalindrome = eachWord;
            }else if(isPalindrome && (eachWord.length() == longestPalindrome.length())){
                longestPalindrome = longestPalindrome+", "+eachWord;
            }
        }
        System.out.println(longestPalindrome);
    }
}
