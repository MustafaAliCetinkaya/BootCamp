package day03;

import java.util.Scanner;

public class ExtraPractices {
    public static void main(String[] args) {
        System.out.println("Please type your gender as \"male or female\":");
        Scanner input1=new Scanner (System.in);
        String gender=input1.next();
        System.out.println("Congratulations! Your gender has been successfully saved as "+gender.toUpperCase());

        System.out.println("Please type your name:");
        Scanner input2=new Scanner (System.in);
        String name=input2.next();
        System.out.println("Congratulations! Your name has been successfully saved as "+name.toUpperCase());

        System.out.println("Please type your name ans date of birth as \"dd.mm.yy\":");
        Scanner input3=new Scanner (System.in);
        String dateOfBirth=input3.next();
        System.out.println("Congratulations! Your date of birth has been successfully saved as "+dateOfBirth);

        System.out.println("Please type your name ans phone number:");
        Scanner input4=new Scanner (System.in);
        String phoneNumber=input4.next();
        System.out.println("Congratulations! Your date of birth has been successfully saved as "+phoneNumber);

        System.out.println();
        System.out.println("\t\t\t\t\t"+gender.toUpperCase());
        System.out.println("\t\t\t\t\t"+name.toUpperCase());
        System.out.println("\t\t\t\t\t"+dateOfBirth);
        System.out.println("\t\t\t\t "+phoneNumber);
    }
}
