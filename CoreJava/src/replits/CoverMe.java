package replits;
/*Finish the method called coverString() that will take two String arguments main
and coverMe and returns a String. Find each occurrence of the String coverMe in main.
Wrap each occurrence of coverMe in square brackets. In the case that main
does not have any occurrence of coverMe return a String with the whole main
String wrapped in square brackets*/
public class CoverMe {
    public static void main(String[] args) {
        System.out.println(coverString("java methods", "me"));
        System.out.println(coverString("Certified Wooden Spoon", "o"));
        System.out.println(coverString("hello hello", "ello"));
        System.out.println(coverString("apples", "pears"));

    }

    public static String coverString(String main, String coverMe) {
        // your code here
        String temp="["+coverMe+"]";
        if (main.contains(coverMe)) {
            main=main.replace(coverMe,temp);
        } else
            main="["+main+"]";
        return main;

    }
}

