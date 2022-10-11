package extraTasks;

import java.util.Scanner;

public class HasJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int length=word.length();

        String firstIsJava=word.substring(0,4);
        String secondIsJava=word.substring(1,5);

        System.out.println (firstIsJava);
    }
}
