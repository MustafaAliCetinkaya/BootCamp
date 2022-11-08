package testing01.utilities;
/*Bekleme süresi gibi sürekli yapılan işlemlerde kullanılmak üzere buraya tanımlarız.
İhtiyaç duyunca sürekli buradan çağırıp tekrar yazıp durmayız.
Java 'da "try-catch ile thread.sleep yapılarak" ile bir sayfanın açılabilmesi için bekleme süresi tanımlanabiliyor.
Burada bir defa yazıp, istediğim yerde kısa bir kodla çağırıp kullanacağım. Yoksa her yerde yazmam gerekirdi. */

public class ReusableMethods {

    public static void sleep(int number) {//Bu sayede test içinde nerede ne kadar bekleyeceğini uzun uzun yazmayız, buradan çağırıp, süre atarız.

        try {
            Thread.sleep(number);//Başka yerde girdiğim sayı kadar dinamik şekilde bir metot yazdık.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
