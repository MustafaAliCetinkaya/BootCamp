package Reviews;

public class PrintEachSeparately {
    public static void main(String[] args) {
        String sentence = "Java JAva ah jaVa, javA is everywhere, my life is JaVA";
        String eachWord = "";
        for (int i = 0; i < sentence.length (); i++) {

            if (sentence.charAt (i) != ' ') {
                eachWord += sentence.charAt (i);
            }

            if (sentence.charAt (i) == ' ') {
                System.out.println (eachWord);
                eachWord = "";//İçini boşalttık, yoksa eskinin üzerine eklemeye devam edecekti
            }
        }
    }
}
