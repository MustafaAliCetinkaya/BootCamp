package replits;
/*Write a method called wordCount that accepts a String as its parameter and returns
the number of words in the String. A word is a sequence of one or more non space characters
(any character other than ' '). For example, the call wordCount("hello") should return 1,
the call wordCount("how are you?") should return 3, the call
wordCount(" this     string has     wide       spaces ") should return 5,
and the call wordCount(" ") should return 0.*/

public class MultiSpaceWordCount {
    public static void main(String[] args) {
        String str=" this     string has     wide       spaces ";
        int result=wordCount(str);
        System.out.println("First method's result: "+result);
        System.out.println("Second method's result: "+wordCount2(str));
    }

    public static int wordCount(String s) {
        String t = (s == null) ? "" : s.trim();
        return t.isEmpty() ? 0 : t.split("\\s+").length;
    }

    public static int wordCount2(String s) {
        int result=0;
        if(!s.isEmpty()){
             result= s.trim().split("\\s+").length;
        }else return 0;
        return result;
    }


    /*
split("\\s+") will split the string into string of array with separator as space
or multiple spaces. \s+ is a regular expression for one or more spaces.

\\s - matches single whitespace character. \\s+ - matches sequence of one or more whitespace */
}
