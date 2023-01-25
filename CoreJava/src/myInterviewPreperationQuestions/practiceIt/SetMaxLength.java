package myInterviewPreperationQuestions.practiceIt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*Write a method maxLength that takes a Set of strings as a parameter and that returns
the length of the longest string in the set. If your method is passed an empty set, it should
return 0.
*/
public class SetMaxLength {

    public static void main(String[] args) {
        Set<String>str=new HashSet<>();
        str.addAll(Arrays.asList("Ali","Hakan","Selami"));
        System.out.println(maxLength(str));
    }

    public static int maxLength(Set<String> set) {
        int maxLength=0;
        for (String each : set) {
            if(each.length()>maxLength){
                maxLength=each.length();
            }
        }
        return maxLength;
    }

    public static int maxLength2(Set<String> set) {
        int max = 0;
        Iterator<String> i = set.iterator();

        while (i.hasNext()) {
            String word = i.next();
            if (word.length() > max) {
                max = word.length();
            }
        }

        return max;
    }
}
