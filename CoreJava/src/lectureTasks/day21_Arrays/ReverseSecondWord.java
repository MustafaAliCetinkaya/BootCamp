package lectureTasks.day21_Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String sentence = "I love Java very much";
        String[] words = sentence.split(" ");

        System.out.println("-------------------------");
        String reversedSecondWord = "";
        for (String each : words) {
            if (each.equalsIgnoreCase("love")) {
                for (int i = each.length() - 1; i >= 0; i--) {
                    each += each.charAt(i);

                }
                each = each.substring(4);
            }
            reversedSecondWord += each + " ";
        }
        System.out.println(reversedSecondWord);
    }
}
