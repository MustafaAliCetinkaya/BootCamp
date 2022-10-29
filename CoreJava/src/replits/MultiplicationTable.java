package replits;

import java.util.Arrays;

/*
Write a piece of code that constructs a two-dimensional array of integers
        named table with 5 rows and 10 columns. Fill the array with a
        multiplication table, so that array element [i][j] contains
        the value i * j. Use nested for loops to build the array.*/
public class MultiplicationTable {
    public static void main(String[] args) {
        int table[][]=new int[5][10];
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 11; j++) {
                table[i-1][j-1]=i*j;
                System.out.print(table[i-1][j-1]+" ");
            }System.out.println();

        }
    }

}
