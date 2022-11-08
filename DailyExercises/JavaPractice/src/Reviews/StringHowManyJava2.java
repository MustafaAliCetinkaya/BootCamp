package Reviews;

public class StringHowManyJava2 {
    public static void main(String[] args) {
        String sentenceJava="Java JAva ah jaVa, javA is everywhere, my life is JaVA";
        String wordJava="Java";
        int frequencyJava=0;

        while(sentenceJava.toLowerCase ().contains (wordJava.toLowerCase ())){
                frequencyJava++;

                sentenceJava=sentenceJava.toLowerCase ().replaceFirst ("java","");
        }
        System.out.println ("frequency of java is= " + frequencyJava);
    }
}
