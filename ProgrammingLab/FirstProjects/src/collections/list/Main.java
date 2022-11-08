package collections.list;

/*Listeler sayesinde istediğimiz kadar veri tutabiliriz, başlangıçya array gibi boyut belirtilmek zorunda değildir.
Tutulan bilgiler sıralı bir şekilde tutulur. İndexleri yazma sırasına göre tutulur.
Aynı bilgiden tekrarlı bir şekilde tutabilirz. Kümeye benzettik ama kümedeki kısıtlama listelerde yok. Tekrarlı veriye izin veriyor.
TÜRLERİ: 1- ArrayList (Sıralı Liste)==>Daha çok bunu kullanacağız / 2- Linkedlist (Bağlı liste)==>Nadiren kullanılır.
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[3];//Boyuru 3 olan, istersek 3 e kadar aynı elemandan birer defa yazabileceğimiz bir array bu.

        numbers [0]=12;
        numbers [1]=36;
        numbers [2]=96;
        //numbers [3]_31; Bu şekilde 4. elemanı eklemeye çalışırsam hata veriri. İstersem 3 yer tutup bir eleman koyabilirim ama fazla eleman koyamam.

    }
}
