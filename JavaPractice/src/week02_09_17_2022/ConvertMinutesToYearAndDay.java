package week02_09_17_2022;

public class ConvertMinutesToYearAndDay {

    public static void main(String[] args) {
/*
Create class named ConvertMiutesToYearAndDay, write a Java program to convert minutes into a number of years and days.

     Input the number of minutes: 3456789
     Expected Output :
     3456789 minutes is approximately 6 years and 210 days
 */
  /*
  how many minutes we have in an hour? 60 min we have in one hour
  how many hours we have in a day? 24 hours we have in a day
  how many days we have in a year? 365 day in a year (it means that 24*365 hours) (it means that 24*60*365 minutes)

   */
        int givenMinutes = 34567890;
        int howManyMinutesInAYear = (24 * 365 * 60);
        int year = givenMinutes / howManyMinutesInAYear;
        System.out.println("year = " + year);
        int remainderMinutes = givenMinutes % howManyMinutesInAYear;
        System.out.println("remainderMinutes = " + remainderMinutes);
        int days = remainderMinutes / (24 * 60);
        System.out.println("days = " + days);

        System.out.println(givenMinutes+" minutes is approximately "+year+" years and "+days+" days");


        /*
        120 seconds

        seconds/60 we can find the minutes

        24*60 minutes

        1 minute =60 second;
        1 hour =60 minutes;
        1 day=24 hour; (24*60*60 seconds)





         */




    }
}
