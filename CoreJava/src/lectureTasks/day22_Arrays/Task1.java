package lectureTasks.day22_Arrays;

import java.util.Arrays;

/*Write a program that can reverse a two dimensional array (return new
        array)
        Ex:
        array = { {1,2,3}, {4,5,6}};
        output:
        reverse = { {6,5,4}, {3,2,1},};*/
public class Task1 {
    public static void main(String[] args) {
        int[][] array =  { {1,2,3}, {4,5,6}};

/*        int[][] reversed = new int[array.length][];

        for (int i = 0; i < array.length; i++) {
            int index = array.length - i - 1;             // 3, 2, 1, 0
            reversed[i] = new int[array[index].length];   // 6, 5, 4, 3

            for (int j = 0; j < array[index].length; j++) {
                reversed[i][j] = array[index][array[index].length - j - 1];
            }

        }*/
        int[][] reversed = new int[array.length][];

        for (int i = array.length - 1,k = 0; i >= 0; i--,k++) {

            reversed[k] = new int[array[i].length];

            for (int j = array[i].length - 1,l = 0; j >= 0; j--,l++) {

                reversed[k][l] = array[i][j];

            }

        }

/*        int[][] arr2D =  { {1,2,3}, {4,5,6}};
        int[][] reversed = new int[arr2D.length][3];

        for (int i = arr2D.length-1,m=0; i>=0; i--,m++) {
            for (int j = arr2D[i].length-1,l=0; j>=0 ; j--,l++) {
                reversed[m][l]=arr2D[i][j];
            }
        }*/
        System.out.println(Arrays.deepToString(reversed));
    }
}
