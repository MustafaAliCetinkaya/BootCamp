package myInterviewPreperationQuestions;

public class Reverse_StringBufferMethod {
    public static void main(String[] args) {
        System.out.println(IsReversed("levxel"));

        reverseMethod2("Software Development Engineer in Test-SDET");

        System.out.println(reverseMethod3("Hello Group-7. Get Better Together!"));
        System.out.println(reverseMethod4("This is String Builder method"));
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
    public static StringBuilder reverseMethod4(String str) {
        /*StringBuilder in Java represents a mutable sequence of characters.
        Since the String Class in Java creates an immutable sequence of characters,
        the StringBuilder class provides an alternative to String Class,
        as it creates a mutable sequence of characters. The function of StringBuilder is
        very much similar to the StringBuffer class, as both of them provide an alternative to String
        Class by making a mutable sequence of characters. However, the StringBuilder class
        differs from the StringBuffer class on the basis of synchronization. The StringBuilder
        class provides no guarantee of synchronization whereas the StringBuffer class does.
        The StringBuffer was being used by a single thread (as is generally the case).
         Where possible, it is recommended that this class be used in preference to StringBuffer
          as it will be faster under most implementations.*/
        StringBuilder temp = new StringBuilder(str);
        return temp.reverse();
    }
}
