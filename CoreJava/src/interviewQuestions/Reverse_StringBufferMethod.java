package interviewQuestions;

public class Reverse_StringBufferMethod {
    public static void main(String[] args) {
        System.out.println(IsReversed("levxel"));

        reverseMethod2("Software Development Engineer in Test-SDET");

        System.out.println(reverseMethod3("Hello Group-7. Get Better Together!"));
    }

    public static boolean IsReversed(String str) {
        boolean IsReversed = true;
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                IsReversed=false;
                break;
            }
        }
        return IsReversed;
    }

    public static void reverseMethod2(String str) {
        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            temp += str.charAt(i);
        }
        System.out.println(temp);
    }

    public static StringBuffer reverseMethod3(String str) {
        /*StringBuffer is a peer class of String that provides much of the functionality of strings.
         * StringBuffer class is used to create mutable (modifiable) string.
         * The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.
         * https://www.geeksforgeeks.org/stringbuffer-class-in-java/*/
        StringBuffer temp = new StringBuffer(str);
        return temp.reverse();
    }
}
