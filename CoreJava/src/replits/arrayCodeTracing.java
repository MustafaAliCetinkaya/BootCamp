package replits;

import java.util.Arrays;
/*Swap the indexes*/
public class arrayCodeTracing {
    public static void main(String[] args) {
        int[]numbers={11,12,13,23,24,34,33,45,56,67,78};
        int i=0;
        for (i = 0; i < numbers.length-1; i++) {
            numbers[i]=numbers[i+1];

            System.out.println("[" + i + ". index is swapped]  =" + Arrays.toString(numbers));
        }

    }
}
