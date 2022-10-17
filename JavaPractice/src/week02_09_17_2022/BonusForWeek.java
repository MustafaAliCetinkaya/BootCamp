package week02_09_17_2022;

import java.time.LocalDateTime;

public class BonusForWeek {


    public static void main(String[] args) {
        /*
        Write a Java program that prints the current time.
               hour:minutes:seconds
        Output: 3:55:23
         */
        LocalDateTime today = LocalDateTime.now();
        System.out.println("today = " + today);

        int hour = today.getHour();
        System.out.println("hour = " + hour);
        int minute = today.getMinute();

        int second = today.getSecond();

        System.out.println(hour+":"+minute+":"+second);


    }
}
