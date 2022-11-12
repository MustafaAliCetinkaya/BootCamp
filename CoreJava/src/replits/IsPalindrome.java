package replits;
/*Write a method isPalindrome that accepts an array of Strings as its argument and returns true if that array is a palindrome (if it reads the same forwards as backwards)
and /false if not. For example, the array {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"} is a palindrome, so passing that array to your method would return true.
Arrays with zero or one element are considered to be palindromes.*/
import java.util.Arrays;

public class IsPalindrome {
    public static void main(String[] args) {
        String[] array = {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"};
        String[] reversed = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[j++] = array[i];
        }

        boolean isPalindrome= Arrays.equals(reversed,array);
        System.out.println("Is Given array palindrome? = " + isPalindrome);
    }
}
