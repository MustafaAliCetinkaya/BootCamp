package exceptions;
/* 3 türlü sistem hatası vardır:
 *1- Syntax (Yazım hataları, hemen belli oluyor, kod çalışmıyor zaten)
 *2- Logical Errors (Mantıksal hatalar. En tehlikelisi bu. Kod çalışıyor, hata göstermiyor ama kod yanlış işlem yapıyor.
 *3- Run-time errors (Koşma zamanı hataları, başta hata uyarısı vermez, tam run deyince istediği sonuçları göremeyince hataya düşer. Mesela şu adrese git al ve kullan deriz. Java o adreste istediğimiz dosyayı bulamayınca hata verir)
 * Run time dan kaçınmak için Java'ya talimatlar verilir o halde şunu yap deriz. İşle bunlara:
 * Try-Catch-Finally ve Throw-Throws yöntemleri denir*/

// TRY-CATCH-FINALLY Aşağıda gösterilmektedir.
public class TypeOfExceptions {
    public static void main(String[] args) {
        int number = 38 / 0;//Bu tarz hatalara exceptions denir. "ArithmeticException: / by zero". Bu hatayı atlayıp aşağıya geçsin ve devam etsin istiyoruz.

        /*Try-Catch-Finally ile bu hataların önüne geçeriz. Akışı durdurmayız. Hatalı yer varsa atlar/yakalar ve yoluna devam eder.
        try{
        Çalıştırılacak kodlar
        }catch(){
        Yakalanacak hatalar
        }kalıp budur. Sonuna finally eklense de olur eklenmese de olur. */

        System.out.println("Hello World");
    }
}
