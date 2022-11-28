package w3Resources;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        double n1, n2;
        int mathOperartor;

        Scanner inputs = new Scanner(System.in);
        System.out.println("Enter a number:");
        n1 = inputs.nextDouble();
        System.out.println("Enter a number:");
        n2 = inputs.nextDouble();
        System.out.println("Enter the \"NUMBER\" of Operation below options:\n" +
                "1.Subtraction(-)\n2.Addition(+)\n3.Multiplication(*)\n4.Division(/)");
        mathOperartor = inputs.nextInt();

        if (mathOperartor == 1) {
            System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        } else if (mathOperartor == 2) {
            System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        } else if (mathOperartor == 3) {
            System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        } else if (mathOperartor == 4) {
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
        } else {
            System.out.println("invalid operator number");
        }

    }
}
