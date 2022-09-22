package basicsReplit;

public class Loops8_For {
    public static void main(String[] args) {
        int[] array = {45, 98, 36,};

        for (int i = 0; i < array.length; i++) {//Array uzunluğu 11 olduğu için 11 kez yazdırmalı.
            System.out.println("Write the word \"Hello\" as many as array length");
        }
        System.out.println("\nNumbers divided by 3");
        for (int i = 20; i < 120; i++) {
            if ( i % 3 == 0){//Kaç ile bölünenleri istiyorsak buraya yazar ve her istediğimizi yazdırırdık.
                System.out.println(i);
            }
        }
    }

}
