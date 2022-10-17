package week04_10_01_2022;

import java.util.Scanner;

public class EligibleToDonate {


    /*
    Task 3: ( Scanner Class can be used )
 //if the age greater than 90 a  ----> you can improve it


					        Create a program that accepts age and weight(kg) as int.

					        If age greater than or equal 18 and weight greater than 50 kg give a message
					        	EXPECTED  :  "You are eligible to donate blood"

					        If age greater than or equal 18 and weight smaller or equal than 50 kg give a message
					        	EXPECTED  :  "You are not eligible to donate blood"

					        If age is smaller than 18 "Age must be greater than 18"
					        	EXPECTED  :  "Age must be greater than 18"
     */


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your age ");
        int age= scan.nextInt();



        if (age>=18){ // we checked age is greater tah or equal 18

            System.out.println("please enter your weight");
            int weight=scan.nextInt();

            if (weight>50){
                System.out.println("You are eligible to donate blood");
            }else {
                System.out.println("You are not eligible to donate blood");
            }




        }else{ //  age is smaller than 18


            System.out.println("Age must be greater than 18");
        }



    }



}
