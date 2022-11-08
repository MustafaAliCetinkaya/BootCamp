package reviewSessions.arrays;

public class MoreSpaces {
    public static void main(String[] args) {
        //to match multiple empty spaces

        String sentence = "Java  is    a    good     language.";

        String[] words = sentence.split("\\s+");//for more spaces \\s+
        for (String each: words) {
            System.out.println(each);
        }
    }
}
