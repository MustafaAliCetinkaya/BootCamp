package Reviews;

public class StringHowManyJava {
    public static void main(String[] args) {
        String sentenceJava="Java JAva ah jaVa, javA is everywhere, my life is JaVA";
        String wordJava="Java";
        int frequencyJava=0;

        for (int i = 0; i <=sentenceJava.length ()-wordJava.length () ; i++) {
            String each=sentenceJava.substring (i,i+wordJava.length());

            if(each.equalsIgnoreCase (wordJava)){
                frequencyJava++;}

        }
        System.out.println ("frequency of java is= " + frequencyJava);
    }
}
