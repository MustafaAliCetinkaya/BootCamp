package reviewSessions.methods.methodOverloadingWrapper;

import java.util.Arrays;

/*Task 2 : Four or less


                    Given an Array of Strings, go through and read only Strings that are 4 characters or less.

                    Take those Strings and put them into a different Array

                    Ex:

                    Input:
                    “apples”, “tree”, “loop, “cat”, “animal”, “shortcut”

                    Output:
                    [ tree, loop, cat ]*/
public class Task2_ShortWords {
    public static void main(String[] args) {
        String[] words = {"apples", "tree", "loop", "cat", "animal", "shortcut"};
        System.out.println(Arrays.toString(fourOrLess(words)));
    }

    public static String[] fourOrLess(String[] str) {
        String temp = "";
        for (String each:str){
            if(each.length()<=4){
                temp+=each+", ";
            }
        }

        String[] answer = temp.split(", ");
        return answer;
    }
}
