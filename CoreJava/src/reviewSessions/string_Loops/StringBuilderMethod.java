package reviewSessions.string_Loops;

public class StringBuilderMethod {
    public static void main(String[] args)
    {

        // create a StringBuilder object
        // with a String pass as parameter
        StringBuilder str
                = new StringBuilder("AAAABBBCCCC");

        // print string
        System.out.println("String = "
                + str);

        // reverse the string
        StringBuilder reverseStr = str.reverse();

        // print string
        System.out.println("Reverse String = "
                + reverseStr);
    }
}
