package replits;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeFinder {
    public static void main(String[] args) {
        /*LocalTime time =LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter. ofPattern("h:mm a");
        time.plusHours(2);
        System.out.println(time.format(format));*/
        System.out.println("---------------------------------------------------");
        /*LocalDate date =LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter. ofPattern("M/d/yy");
        date = date.plusDays (1). minusYears (2). minusWeeks (1);
        System.out.println(date.format(format));*/
        System.out.println("---------------------------------------------------");
        LocalDate date = LocalDate. of (2022, 11, 25);
        LocalTime time = LocalTime. of (14, 42);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("MM/dd/yyyy | hh:mm");
        System.out.println(dateTime);


    }
}