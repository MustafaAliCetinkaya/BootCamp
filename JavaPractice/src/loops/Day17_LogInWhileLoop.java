package loops;

import java.util.Scanner;

public class Day17_LogInWhileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println ("enter your username: ");
        String u = scan.next ();

        System.out.println ("enter your password");
        String p = scan.next ();


        if (u.equals ("Cydeo") && p.equals ("Cydeo123")) {
            System.out.println ("Logged in");
        } else {
            int attempts = 3;
            while (!(u.equals ("Cydeo") && p.equals ("Cydeo123")) && attempts > 0) {
                System.out.println ("incorrect username or password, please re-enter");
                System.out.println ("enter your username");
                u = scan.next ();

                System.out.println ("enter your password");
                p = scan.next ();
                attempts--;
            }

            if (u.equals ("Cydeo") && p.equals ("Cydeo123")) {
                System.out.println ("Logged in");
            } else {
                System.out.println ("your account is locked");
            }
        }
        scan.close ();
    }
}
