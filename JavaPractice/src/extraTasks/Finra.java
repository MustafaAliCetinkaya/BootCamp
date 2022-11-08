package extraTasks;

import java.util.Scanner;

public class Finra {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = data.nextInt();

        if (number % 3 == 0 || number % 5 == 0) {
            if (number % 3 == 0 && number % 5 != 0) {
                System.out.println("FIN");
            } else if (number % 5 == 0 && number % 3 != 0) {
                System.out.println("RA");
            } else {
                System.out.println("FINRA");
            }
        }
        else {
            System.out.println("Your number is not divisible by 3 or 5. It returns back without change: \n"+"\""+number+"\"");
        }
    }
}
