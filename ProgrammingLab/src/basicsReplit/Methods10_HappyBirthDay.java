package basicsReplit;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Methods10_HappyBirthDay {

    public static void main(String[] args) {
        HappyBirthDay(1999, 8, 15);
    }

    public static void HappyBirthDay(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        int month2 = today.getMonthValue();
        int day2 = today.getDayOfMonth();

        if (month == month2 && day == day2) {
            System.out.println("\nCongratulations! Today is your birthday.");
            System.out.println("\n\t\t\t         **********************************");
            System.out.println("\n\t\t\t     **************************************");
            System.out.println("\n\t\t\t  ********           Happy Birthday               ********");
            System.out.println("\n\t\t\t*******                     to you !!                         *******");
            System.out.println("\n\t\t\t   ********                    :)                            ********");
            System.out.println("\n\t\t\t     **************************************");
            System.out.println("\n\t\t\t       ***********************************");

        } else {
            System.out.println("\n :(  Unfortunately, today is not your birthday yet");
        }
    }
}
