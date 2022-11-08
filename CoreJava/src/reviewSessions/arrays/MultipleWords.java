package reviewSessions.arrays;

public class MultipleWords {
    public static void main(String[] args) {

        String str = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

        String[] words = str.split(", ");

        for (String word : words) {
            if(word.contains(" "))
                System.out.println(word);
        }
    }
}
