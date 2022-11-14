package interviewQuestions;

public class Interview_EqualStrings {
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
        System.out.println("-----------------------");
        String s1="abc";
        String s2="abc";
        System.out.println("s1==s2 is "+s1==s2);
        System.out.println("s1==s2 is "+(s1==s2));
        System.out.println("-----------------------");
        int n1=3;
        int n2=33;
        System.out.println("test / "+false);
        System.out.println(31+n1==n2);
    }
}
