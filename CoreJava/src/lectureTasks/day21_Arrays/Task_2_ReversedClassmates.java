package lectureTasks.day21_Arrays;

import java.util.Arrays;

public class Task_2_ReversedClassmates {

    public static void main(String[] args) {

        String[] names = {"Marco Polo", "Ziya Gökalp", "Khalil Gibran", "Ernest Hemingway", "Stephen Hawking", "Martin Luther", "Herman Melville", "Thomas Paine", "Hermann Hesse", "Omar Khayyam"};

        String[] reversedArray = new String[names.length];

        String reversedWord = "";

        int k = 0; // this is to change index of reversedArray one by one

        for (int i = names.length-1; i >= 0; i--) { // i is used for index number of elements

            for (int j = names[i].length()-1; j >= 0; j--) { // j is used for index number of characters

                reversedWord += "" + names[i].charAt(j); // this adds characaters from ending to beginning

            }

            reversedArray[k++] = reversedWord; // this add the reversed word to new array

            reversedWord = ""; // this clear reversed word for next iteration
        }

        System.out.println(Arrays.toString(reversedArray));

    }
}