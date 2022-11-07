package replits;

import java.util.Arrays;

/*        Given a String str, find and print the shortest words.
                The String will have multiple words separated by commas and spaces.
        If there is words that have the same length, they should all be displayed
        at the end. Print all the shortest words in the following format:*/
public class ShortestWords {
        public static void main(String[] args) {

            String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

            //WRITE YOUR CODE BELOW
            String[] temp = str.split(", ");
            String shortest1 = temp[0];

            for (String each : temp) {
                if (each.length() < shortest1.length())
                    shortest1 = each + ", ";
            }
            int boundary = shortest1.substring(0, shortest1.indexOf(',')).length();

            for (String temp1 : temp) {
                if ((boundary == temp1.length()) & !shortest1.contains(temp1))
                    shortest1 += temp1 + ", ";
            }

            String[] shortest = shortest1.split(", ");
            System.out.print(Arrays.toString(shortest));
        }
    }

