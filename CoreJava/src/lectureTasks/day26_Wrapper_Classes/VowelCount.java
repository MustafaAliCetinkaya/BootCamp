package lectureTasks.day26_Wrapper_Classes;

import java.util.Arrays;

/*Write a static method named vowelCount that accepts a String as a parameter
and returns an array of integers representing the counts of each vowel in the String.
The array returned by your method should hold 5 elements: the first is the
count of As, the second is the count of Es, the third Is, the fourth Os,
and the fifth Us. Assume that the string contains no uppercase letters.

For example, the call vowelCount("i think, therefore i am") should return
the array {1, 3, 3, 1, 0}.*/
public class VowelCount {
    public static void main(String[] args) {
        String sentence = "i think, therefore i am";
        System.out.println(Arrays.toString(vowelCount(sentence)));
    }

    public static int[] vowelCount(String text) {
        int[] array = new int[5];

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if(letter == 'a') {
                array[0]++;
            } else if (letter == 'e') {
                array[1]++;
            } else if (letter == 'i') {
                array[2]++;
            } else if (letter == 'o') {
                array[3]++;
            } else if (letter == 'u') {
                array[4]++;
            }
        }
        return array;
    }
}
