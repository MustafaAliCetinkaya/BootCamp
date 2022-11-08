package basicsReplit;

import java.util.Arrays;
import java.util.Scanner;

public class SplitStringToArray2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please write a long sentence: ");
        String primeNumbers=input.nextLine();//Sadece next dersek cümlenin ilk kelimesini alır, diğerlerini algılamaz.
        System.out.println("Abstract: "+primeNumbers);

        String [] sentence=primeNumbers.split("\\.");//Ters slaş olmazsa cümleleri noktaya göre ayırmaz.
        String [] word=primeNumbers.split(" ");//Boşluk karakterine göre ayırırsak kelime sayısını buluruz.
        String [] character=primeNumbers.split("");//Hiçbirşey yazmazsak da karakter sayısını buluruz.

        System.out.println("Number of sentences: "+sentence.length);
        System.out.println("Number of words: "+word.length);
        System.out.println("Number of characters: "+character.length);
    }
}
