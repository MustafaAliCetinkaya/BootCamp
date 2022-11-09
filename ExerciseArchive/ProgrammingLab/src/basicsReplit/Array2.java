package basicsReplit;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] array=new int[5];

        System.out.println("Please enter your first array number");
        array [0]=input.nextInt();

        System.out.println("Please enter your second array number");
        array [1]=input.nextInt();

        System.out.println("Please enter your fifth array number");
        array [4]=input.nextInt();


        System.out.println(Arrays.toString(array));
    }
}
