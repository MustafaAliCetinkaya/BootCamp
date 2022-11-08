package day03;

import java.util.Scanner;

public class OperatingSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please choose your device and write your selection as a number from written below list:");
        System.out.println("1- Mac, \n2- Lenovo, \n3- Iphone, \n4- Samsung");
        int operatorSystem = input.nextInt();

        if (operatorSystem ==1) {
            System.out.println("Your operating system is : \"MacOS\"");
        } else if (operatorSystem ==2) {
            System.out.println("Your operating system is : \"Windows\"");
        } else if (operatorSystem ==3) {
            System.out.println("Your operating system is : \"IOS\"");
        } else if (operatorSystem ==4) {
            System.out.println("Your operating system is : \"Android\"");
        } else {
            System.out.println("Your number is out of the list. \nPlease choose your device again and write your selection corretly!");
        }

    }
}
