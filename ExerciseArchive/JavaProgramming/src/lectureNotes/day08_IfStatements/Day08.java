package lectureNotes.day08_IfStatements;

import java.util.Scanner;

public class Day08 {
    public static void main(String[] args) {
        System.out.println("Please enter your score: ");
        Scanner input = new Scanner(System.in);
        int examResult = input.nextInt();

        if (examResult>=90){
            System.out.println("Excellent! Your grade: AA");
        }

        if (examResult>=80){
            System.out.println("Great. Your grade: BA");
        }

        if (examResult>=70){
            System.out.println("Great. Your grade: BB");
        }

        if (examResult>=60){
            System.out.println("Great. Your grade: CB");
        }

        if (examResult>=50){
            System.out.println("Great. Your grade: CC");
        }

        if (examResult>=40){
            System.out.println("Great. Your grade: DC");
        }

        if (examResult>=30){
            System.out.println("Great. Your grade: DD");
        }

        else {
            System.out.println("Failed the course");
        }

    }
}
