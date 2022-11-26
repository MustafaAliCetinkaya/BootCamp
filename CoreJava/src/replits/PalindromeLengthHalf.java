package replits;

public class PalindromeLengthHalf {
        public static void main(String [] args){
            String word="anna";
            boolean isPalindrome=false;

            for(int i=0; i<word.length()/2;i++){
                if(word.charAt(i)==word.charAt(word.length()-1-i)){
                    isPalindrome=true;
                }

            }

            System.out.print(isPalindrome);
        }

}
