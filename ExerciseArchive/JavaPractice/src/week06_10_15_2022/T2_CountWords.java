package week06_10_15_2022;

public class T2_CountWords {

    /*
    Task 2: Given a sentence which is string and count the words in it.

input:

  String str="Java is java in everywhere is Java";

  output:7
     */

    public static void main(String[] args) {

        String str="Java is java in everywhere is Java"; //if we count the spaces and adding +1 we can get the words
     int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' ')
                counter++;

        }

        System.out.println(counter+1);




    }
}
