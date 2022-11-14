package interviewQuestions;

public class Interview_CharFrequency2 {
    public static void main(String[] mali) {
        String words = "Afyonkarahisar Sülümenli Kasabası";

        String result = "";

        for (int i = 0; i < words.length(); i++) {
            char each = words.charAt(i);

            int count = 0;
            for (int j = 0; j < words.length(); j++) {
                if (words.charAt(j) == each) {
                    count++;
                }
            }
            if (count == 2) {
                if (!result.contains("" + each)) {
                    result += each+" ";
                }
            }
        }
        System.out.println(result);
    }
}

