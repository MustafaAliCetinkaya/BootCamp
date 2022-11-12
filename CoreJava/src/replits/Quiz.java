package replits;

public class Quiz {
    public static void main(String[] args) {
        String str = "The whole time it was raining.";
        while (!str.isEmpty()) {
            System.out.println(str.charAt(0));
            str = str.substring(3);
            System.out.println(str + " / " + str.length());
        }
        System.out.println("-------------------------");
        String word = "ali";
        String w = word.substring(3);
        System.out.println(w);
        System.out.println(w.length());

    }
}
