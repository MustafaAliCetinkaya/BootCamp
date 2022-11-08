package basicsReplit;

import java.util.Arrays;

public class SplitStringToArray {
    public static void main(String[] args) {
        String diller= "Turkish, German, English, French";
        String[] array=diller.split(",");/*Tırnak arasındaki virgül bize strindeki virgüllerden parçalara ayır ve bunu array yap diyor.*/
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);

        System.out.println(array.length);

        String mors="I love bip too much bip java bip I strongly believe that bip I will be a good developer ";
        String[] array2=mors.split("bip");
        System.out.println(Arrays.toString(array2));
        System.out.println(array2.length);

        String dot="Today is Friday. Have a nice day. Have a nice weekend. Thanks to God";
        String[] array3=dot.split("\\.");//Noktaya göre ayıramıyor. Bu nedenle özel karakter önüne çift slaş konulur ve oradan böleceğini anlar. Yoksa sadece noktayla boş array olarak algılar.
        System.out.println(Arrays.toString(array3));
        System.out.println(array3.length);

    }
}
