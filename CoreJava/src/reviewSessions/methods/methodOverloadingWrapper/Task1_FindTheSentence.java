package reviewSessions.methods.methodOverloadingWrapper;

public class Task1_FindTheSentence {
    /*
    Task 1 : Find the word

					String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

					Write a method that returns : Welcome To Core Java
     */

    public static void main(String[] args) {

        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        getSentence(str);

    }

    public static void getSentence(String str) {
        String temp="";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
          /*  if (('a'<=ch && ch<='z' )||('A'<=ch && ch<='Z' )){ //Charecter.isLetter(ch)
                temp+=ch;
            }

           */

            //if we are talking english letters we can use isAlphabetic()
            // if we are talking other letters we can use isLetter()
            if (Character.isUpperCase(ch))
                temp+=' ';

            if (Character.isAlphabetic(ch)) {
                temp+=ch;
            }

        }
        System.out.println(temp.trim());

    }
}
