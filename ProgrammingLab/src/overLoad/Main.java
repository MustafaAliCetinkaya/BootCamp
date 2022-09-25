package overLoad;

//Aynı metodun parametresini değiştirerek kullanmaya overload denir.
//Aynı isimde farklı class lar oluşturulabilir. ŞARTI==> Metot imzası, yani parametresi farklı olmalıdır.
//Metot ismi ve parametrelere=Metot imzası denir. Metot ismini değiştir, parametreler aynı kalsın da denilebilir ama okunaklı bir yazılım için isim aynı kalıp parametreler değiştirilir.
public class Main {
    public static void main(String[] args) {
//Yeni class buraya yazılmaz. Buradan çağırma işlemi yapacağız.
        toplama(98,487);
        int result=toplama(98,487);
        System.out.println("Result = " + toplama(98,487));//Bu şekilde doğrudan metotla da hesaplanır.
        System.out.println("result = " + result);//Aynı sonucu yukarıda tanımlayıp buradan da yazdırabiliriz.
        System.out.println("**********************************");
        System.out.println(toplama(985,354,698877));
    }

    public static int toplama(int number1, int number2) {//Aşağıda ismi aynı olan bir metot daha kullanabiliriz. Olay budur.
        return number1 + number2;
    }

    public static int toplama(int number1, int number2, int number3) {//İçindeki parametreler değiştirilmeli. Yoksa hata veriri.
        return number1 + number2 + number3;
    }
    //Overloading de imza değişmeden aynı metot kullanılmaz. Nedir İmza? Ya metot ismi değişecek ya da parametreler değişecek.
}
