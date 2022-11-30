package officeHour;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int arr []=new int[10];
        for (int i = 1, j=0;i <=10 ; i++, j++) {
            arr[j]=i;
        }

        int reversed []=new int[arr.length];
        int i=0;
        for (int j = arr.length-1;j >=0 ; j--) {
            reversed[i++]=arr[j];
        }
        System.out.println(Arrays.toString(reversed));
    }
}
