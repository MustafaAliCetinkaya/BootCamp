package basicsReplit;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
/*Çok boyutlu arrayler liste şeklinde yazılan alt kümeler içeren bir küme gibidir.
* Tek boyutlu array liste şeklinde yazılan küme gibidir.*/
        int [][][] eightClassStudents=new int[3][2][5];
        //Toplam 3 sınıfı olan 8 leri sınıflarına göre ayırdık. Her sınıfı kız erkek şeklinde gruplandırdık. Eşit sayıdaki (5 kişilik) kız ve erkeklerin notlarını ayrı ayrı yazacağız.
        eightClassStudents[0][0][0]=70;//İlk sınıftaki grup kız-erkek olarak 5 ar kişilik 2 gruba ayrıldı. Birinci grup olan kızların ilki 70 notunu aldı.
        eightClassStudents[0][0][1]=50;
        eightClassStudents[0][0][2]=40;
        eightClassStudents[0][0][3]=20;
        eightClassStudents[0][0][4]=85;
        eightClassStudents[0][1][0]=90;//İlk sınıftaki grup kız-erkek olarak 5 ar kişilik 2 gruba ayrıldı. İkinci grup olan erkeklerin ilki 90 notunu aldı.
        eightClassStudents[1][0][4]=65;//İlk sınıftaki grup kız-erkek olarak 5 ar kişilik 2 gruba ayrıldı. Birinci grup olan kızların 5.si 70 notunu aldı.
        eightClassStudents[2][1][3]=30;//İlk sınıftaki grup kız-erkek olarak 5 ar kişilik 2 gruba ayrıldı. İkinci grup olan erkeklerin 4.sü 90 notunu aldı.

        System.out.println(eightClassStudents[0][0][2]);
        System.out.println(eightClassStudents[1][0][4]);

        System.out.println(Arrays.toString(eightClassStudents[0][0]));
        System.out.println(Arrays.toString(eightClassStudents[1][0]));
        System.out.println(Arrays.toString(eightClassStudents[2][1]));
//        System.out.println(Arrays.toString(eightClassStudents));Bu şekilde iç içe kümeleri yazdıramıyor. Alt kümeleri tek tek isteyerek yazdırabiliriz.
    }



}
