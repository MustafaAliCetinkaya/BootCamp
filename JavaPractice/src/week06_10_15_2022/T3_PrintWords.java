package week06_10_15_2022;

public class T3_PrintWords {

    public static void main(String[] args) {

/*
Task 3: Given a sentence which is string and print the each word.


input:

String str="Java is java in everywhere is Java";

output:
Java
is
java
in
.
.
.
 */
        String str="Java is java in everywhere is Java";


        String temp="";
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)!=' ') {
                temp += str.charAt(i);

            }

            if (str.charAt(i)==' '){
                System.out.println(temp);
                temp="";
            }

        }
        System.out.println(temp);


    }
}
