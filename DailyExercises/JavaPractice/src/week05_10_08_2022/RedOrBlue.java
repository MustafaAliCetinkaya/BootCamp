package week05_10_08_2022;

public class RedOrBlue {


    public static void main(String[] args) {
        /*
         Task 4: Given a string, if the string begins with "red" or "blue" print that color string, otherwise print the empty string.

     *                 input :"redxx" → "red"
     *                 input :"xxred" → ""
     *                 input :"blueTimes" → "blue"
         */

        String str="xxxxx";

        if (str.startsWith("red")){
            System.out.println("red");
        } else if (str.startsWith("blue")) {
            System.out.println("blue");
        }else {
            System.out.println(" ");
        }

    }
}
