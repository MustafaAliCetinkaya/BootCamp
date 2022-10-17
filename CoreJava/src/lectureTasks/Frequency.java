package lectureTasks;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence=input.nextLine();
        System.out.println("Please enter a sentence");
        char aChar=input.nextLine().charAt(0);

        int frequency=0;

        for (int i = 0; i < sentence.length(); i++) {
            char temprorary=sentence.charAt(i);
            if (aChar==temprorary){
                frequency++;

            }

        }if (frequency==1) {
            System.out.println(aChar + " is a unique character");
        }else
            System.out.println(aChar + " is not a unique character. There are "+frequency+" "+aChar+" in the sentence");


    }
}
