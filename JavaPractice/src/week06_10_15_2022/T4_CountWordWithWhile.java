package week06_10_15_2022;

public class T4_CountWordWithWhile {


    public static void main(String[] args) {



        /*
        Task 4: Given a sentence which is string find word how many times repeats in it.

Hint: use replaceFirst() with while loop

input:
*                                String str="Java is java in everywhere is Java";
*                                String word="Java";
output:3

         */


        String str = "Java is java in everywhere is Java";
        String word = "Java";
        str=str.toLowerCase();
        word=word.toLowerCase();
        int counter = 0;
        while (str.contains(word) ) {
            counter++;
            str = str.replaceFirst(word, "");

        }
        System.out.println(counter);


    }
}
