package extraTasks;

import java.util.Scanner;

public class OperatingSystem {
    //TERNARY
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please choose your device and write your selection as a number from written below list:");
        System.out.println("1- Mac \n2- Lenovo \n3- Iphone \n4- Samsung");

        int operatorSystem = input.nextInt();
        String choice;

       choice= (operatorSystem ==1) ? "Your operating system is : \"MacOS\"" :(operatorSystem ==2) ? "Your operating system is : \"Windows\"" :(operatorSystem ==3) ? "Your operating system is : \"IOS\"" :(operatorSystem ==4) ? "Your operating system is : \"Android\"" : "Invalid choice! \nPlease choose your device again and write your selection correctly!";
        System.out.println(choice);

    }

    }

