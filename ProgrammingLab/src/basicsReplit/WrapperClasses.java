package basicsReplit;

public class WrapperClasses {
    public static void main(String[] args) {
/*     İlkel veri tipleri class olarak da algılatılabilir. int, byte gibi aynı işlemi yapar ama nesne muamelesi görürler.
        İlkellerin uzun yazılışları büyük harfle yazılırsa "int-->Integer" gibi wrapper class olur, nesne tanımlamış oluruz.
        Değer tutmak için kullanılmaz. Bunların içinde hazır metotlar vardır. Bunlardan yaralanmak istenirse kullanırız.
        Daha çok string den int oluşturmak için kullanılır pratikte. Başka metotlarla matematiksel işlemler de yaptırılabilir.*/

        int number = 50;
        Integer number2 = new Integer(256);
        System.out.println(number2);

        int biggerNumber=Integer.max(5698,264);//Büyük sayıyı seçen metot
        System.out.println(biggerNumber);

        int smallerNumber=Integer.min(3213212,8995456);//Küçüğü seçen metot
        System.out.println(smallerNumber);

        int sumNumbers=Integer.sum(64665456,654564654);//Sayıları toplayan metot
        System.out.println(sumNumbers);

    }
}
