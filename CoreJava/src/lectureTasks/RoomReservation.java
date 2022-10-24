package lectureTasks;

import java.util.Scanner;

/*Create a class called RoomReservation, write a program for the room
        reservation:
        King Bed ==> 120$
        Queen Bed ==> 100$
        single Bed ==> 80$
        the program asks the user which bedroom does he/she wants to
        reserve, and how many nights he/she is staying.
        Then Ask the user "would you like to reserve another room?""
        if yes ==> repeat the entire steps
        if no ==> return the  total price
        If user enters any invalid entry,  ask the user to re-
        enter until user provides a valid entry*/
public class RoomReservation {
    public static void main(String[] args) {
        boolean flag = true;
        int totalPrice = 0;
        while (flag) {
            Scanner input = new Scanner(System.in);
            System.out.println("Which bedroom do you want to reserve: \nKing Bed ==> 120$\nQueen Bed ==> 100$\nSingle Bed ==> 80$");
            String roomType = input.nextLine();
            System.out.println("How many nights will you stay");
            int howManyNight = input.nextInt();

            while (!(roomType.equalsIgnoreCase("King Bed") || roomType.equalsIgnoreCase("Queen Bed") || roomType.equalsIgnoreCase("Single Bed"))) {
                System.out.println("Invalid entry. Please re-enter the room type correctly");
                roomType = input.nextLine();
            }

            if (roomType.equalsIgnoreCase("King Bed")) {
                totalPrice += howManyNight * 120;
            } else if (roomType.equalsIgnoreCase("Queen Bed")) {
                totalPrice += howManyNight * 100;
            } else if (roomType.equalsIgnoreCase("Single Bed")) {
                totalPrice += howManyNight * 80;
            }

            input.nextLine();
            System.out.println("Would you like to reserve another room?");
            String another = input.nextLine();

            while (!(another.equalsIgnoreCase("yes") || another.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry. Please re-enter the room type correctly");
                System.out.println("Which bedroom do you want to reserve: \nKing Bed ==> 120$\nQueen Bed ==> 100$\nSingle Bed ==> 80$");
                roomType = input.nextLine();
                System.out.println("How many nights will you stay");
                howManyNight = input.nextInt();
            }
            if (another.equalsIgnoreCase("no")) {
                System.out.println("Your total price is: $" + totalPrice);
                flag = false;
            }
            System.out.println(totalPrice);

        }
    }
}
