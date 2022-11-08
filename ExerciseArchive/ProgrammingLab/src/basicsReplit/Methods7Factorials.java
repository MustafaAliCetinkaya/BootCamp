package basicsReplit;

import java.util.Scanner;

public class Methods7Factorials {
    public static void main(String[] args) {
        System.out.println("Please enter a positive integer: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
//Bunu aşağıdaki gibi FOR döngüsüyle zaten yapabiliriz. Şimdi de return eden bir metotla yapalım.
/*        int result=1;
        for (int i=1;i<=number;i++){
            result*=i;


        System.out.println("The result of factorail is --> "+number+"! = "+result);*/

        //int number = 12;
        System.out.println("The result of factorail is --> " + number + "! = " + getFactorial(number));

    }
        public static int getFactorial (int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
        }


    }

