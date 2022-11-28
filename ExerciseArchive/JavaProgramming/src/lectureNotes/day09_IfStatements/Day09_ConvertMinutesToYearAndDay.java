package lectureNotes.day09_IfStatements;

import java.util.Scanner;

public class Day09_ConvertMinutesToYearAndDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int minutes = input.nextInt();

        int hours = minutes / 60;
        int day = hours / 24;
        int year = day / 365;
        int remainder = day % 365;
        System.out.println(minutes + " minutes is equal to " + year + " years and " + remainder + " days");
    }
}
