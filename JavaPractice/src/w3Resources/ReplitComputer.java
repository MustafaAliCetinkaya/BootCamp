package w3Resources;

import java.util.Scanner;

public class ReplitComputer {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double total = 0D;

        System.out.println ("Select screen size:");
        double secreenSize = input.nextDouble ();
        if (secreenSize == 13.3) {
            total += 200;
        } else if (secreenSize == 15.0) {
            total += 300;
        } else if (secreenSize == 17.3) {
            total += 400;
        }
        input.nextLine ();

        System.out.println ("Select CPU type:");
        String cpu = input.nextLine ();
        switch (cpu) {
            case "i3":
                total += 150;
                break;
            case "i5":
                total += 250;
                break;
            case "i7":
                total += 350;
                break;
        }

        System.out.println ("Select RAM size:");
        int ram = input.nextInt ();
        if (ram % 4 == 0) {
            total = total + (ram / 4) * 50;
        }

        input.nextLine ();

        System.out.println ("Select storage type:");
        String storage1 = input.nextLine ();

        System.out.println ("Select storage size:");
        int storage2 = input.nextInt ();
        switch (storage1) {
            case "HDD":
                total = total + (storage2 / 500) * 50;
                break;
            case "SSD":
                total = total + (storage2 / 500) * 100;
                break;
        }

        input.nextLine ();

        System.out.println ("Select screen resolution:");
        String resolution = input.nextLine ();
        switch (resolution) {
            case "FULLHD":
                total += 100;
                break;
            case "4K":
                total += 200;
                break;
        }

        System.out.println ("Final price is: " + "$" + total);

        input.close ();
    }
}
