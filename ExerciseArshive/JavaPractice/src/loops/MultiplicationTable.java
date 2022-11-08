package loops;
/*1. Create a class called MultiplicationTable, Write a program that can
        display the multiplication table:*/
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            System.out.println (i + " times table: ");
            for (int j = 1; j <=10 ; j++) {
                System.out.print (i*j+" ");
            }
            System.out.println ();
        }
    }
}
