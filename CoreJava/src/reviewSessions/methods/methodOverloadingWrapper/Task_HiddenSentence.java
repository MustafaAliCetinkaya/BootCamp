package reviewSessions.methods.methodOverloadingWrapper;

/*Task 1 : Find the word

                    String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

                    Write a method that returns : Welcome To Core Java*/
public class Task_HiddenSentence {
    public static void main(String[] args) {
        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        System.out.println(hiddenSentence(str));
    }

    public static String hiddenSentence(String str) {
        String temp = "";
        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)||each==' ') {
                temp+=each;

            }
        }
        return temp;
    }
}
