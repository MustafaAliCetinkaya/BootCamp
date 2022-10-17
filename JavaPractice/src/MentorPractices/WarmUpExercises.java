package MentorPractices;

public class WarmUpExercises {
    public static void main(String[] args) {
        String word="Code";
        String newWord="";

        for (int i = 1; i <= word.length(); i++) {
            String str=word.substring (0,i);
            newWord+=str;

        }
        System.out.println (newWord);
    }
}
