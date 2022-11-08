package extraTasks;

import java.util.Scanner;

public class NumberOfMonthsSwitchCase {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the current year: ");
        int IsLeapYear = keyboard.nextInt();
        System.out.println("Please enter the number of current month: ");
        int numberOfMonth = keyboard.nextInt();

        switch (numberOfMonth) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("This month has 31 days");
                    break;
            case 2:
                String result=(IsLeapYear%4==0) ? (IsLeapYear+" is a leap year. Therefore February has 29 days ") :
                                                                        (IsLeapYear+" is not a leap year, this month has 28 days");
                System.out.println(result);
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("This month has 30 days");
            default:
                System.out.println("Invalid number. Please enter the number of current month correctly");
                break;
        }
    }
}
