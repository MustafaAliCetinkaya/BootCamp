package interviewQuestions;

public class Interview_Palindrome {
    public static void main(String[] args) {
        String word="annax";
        System.out.println("isPalindrome(word) = " + isPalindrome(word));

    }
    public static String isPalindrome(String str){
        String result="";
        String isPalindrome1="Yes";
        String isPalindrome2="No";

        for(int i=str.length()-1;i>=0;i--)
            result+=str.charAt(i);

        if(result.equals(str))
            return isPalindrome1;

        return isPalindrome2;
    }
}
