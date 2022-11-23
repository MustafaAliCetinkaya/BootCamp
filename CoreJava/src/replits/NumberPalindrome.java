package replits;

public class NumberPalindrome {
    public static void main(String[] args) {
        int number=234;
        String temp=""+number;
        boolean isPalindrome=true;

        for (int i = 0; i < temp.length()/2; i++) {
                if(temp.charAt(i)!=temp.charAt(temp.length()-1-i)){
                    isPalindrome=false;
                    break;
                }
        }
        System.out.println(isPalindrome);
    }
}
