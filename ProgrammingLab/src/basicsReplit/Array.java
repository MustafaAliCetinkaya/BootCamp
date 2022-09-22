package basicsReplit;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] array_Primes={2,3,5,7,11,13,17,19};
        System.out.println("Some of the prime numbers: "+Arrays.toString(array_Primes));//Array ler doğrudan yazdırılamıyor. Bunun için Arrays.toString() kullanılır. Import edilir.

        String [] array_Names=new String[5];
        array_Names[0]="Ali";
        array_Names[1]="Veli";
        array_Names[3]="Selami";//İkinci ve dördüncüyü yazmadık. Sistem default atayacak, NULL gösterecek.

        System.out.println(Arrays.toString(array_Names));





    }
}
