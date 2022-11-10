package replits;

public class EqualStrings {
    public static void main(String[] args) {
        String word1=new String("java");
        String word2=new String("java");
        if(word2==word1){//Are they same object
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
        System.out.println("-----------------------");
        if(word2.equals(word1)){//are they same word
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
}
