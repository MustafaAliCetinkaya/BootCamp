package Reviews;
/*
Task 2: Given a sentence which is string and count the words in it.
input:
String str="Java is java in everywhere is Java";
output:7
 */
public class CountWord {
    public static void main(String[] args) {
        String sentence="Java JAva ah jaVa, javA is everywhere, my life is JaVA";
        int frequency=0;

        for (int i = 0; i <sentence.length () ; i++) {

            if(sentence.charAt (i)==' '){
                frequency++;}
        }
        System.out.println ("frequency of java is= " + frequency);
    }
}
