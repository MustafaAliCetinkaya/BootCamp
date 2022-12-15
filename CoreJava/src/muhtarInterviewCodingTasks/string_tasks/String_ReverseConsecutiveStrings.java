package string_tasks;

public class String_ReverseConsecutiveStrings {

    /*
    Write a program that can reverse  the consecutive strings.
            Do not use any lambda or stream or any build in reverse methods
        Ex:
            input:
                str = "test12pop90java989pyt"

            output:
                tset12pop90avaj989typ

     */

    public static void main(String[] args) {

        String s = "test12pop90java989pyt";
        String temp = "";

        boolean lastCharIsLetter = Character.isLetter(s.charAt(s.length() - 1));

        for (int i = 0; i < s.length() - 1; i++) {
            temp += s.charAt(i);
            boolean nextCharIsLetter = Character.isLetter(s.charAt(i + 1));
            if (Character.isLetter(s.charAt(i))) { // substrings with letters only

                if (i == s.length() - 2 && lastCharIsLetter)
                    temp += s.charAt(s.length() - 1);

                if (!nextCharIsLetter)
                    temp += " ";

            } else { // substrings with digits only

                if (i == s.length() - 2 && !lastCharIsLetter)
                    temp += s.charAt(s.length() - 1);

                if (nextCharIsLetter)
                    temp += " ";
            }
        }

        String[] subs = temp.trim().split(" ");
        String result = "";

        for (int j = 0; j < subs.length; j++) {
            boolean isWord = true;
            for (int i = 0; i < subs[j].length(); i++) {
                if (!Character.isLetter(subs[j].charAt(i))) {
                    isWord = false;
                    break;
                }
            }

            result += isWord? new StringBuilder(subs[j]).reverse().toString() : subs[j];
        }

        System.out.println(result);

    }

}
