package officeHour.recapBySolvingProblems;

public class Task10 {
    public static void main(String[] args) {
        String sentence = " Let's go to  the cinema  ";
        System.out.println(countSpaces(sentence));
    }

    public static int countSpaces(String sentence) {
        int numberOfSpaces = 0;
        for (Character each : sentence.toCharArray()) {
            if (Character.isSpaceChar(each)) {
                numberOfSpaces++;
            }
        }
        return numberOfSpaces;
    }
}
