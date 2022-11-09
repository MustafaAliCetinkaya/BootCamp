package basicsReplit;

public class WrapperClasses_StringtoInteger {
    public static void main(String[] args) {
        String age="50";//Metin halindeki 50 dir bu
        int ageNumber=Integer.parseInt(age);//age deki metin halinde bulunan 50 yi sayıya dönüştürüyor.
        System.out.println(ageNumber+10);//50+10 şeklinde hesap yapacak. Metinle sayıyıy dönüştürerek toplayabildim.

        //Tersi de mümkün. Yani sayılar metne de dönüştürülebilir. Bunun için .valueof kullanılır.

 /*    int number=6568;
        String text=String.valueOf(number);===>Bu yöntem pek kullanılmaz. Daha güzel bir yazımı daha var
        System.out.println(text);===>Sayıyı metne dönüştürecek. Ekrana çıkan sayı aslında bir metin*/

        String text=6568+"";//Bir sayı ile tırnak toplanırsa, sayı tırnağın içine yazılır ve elde edilen değer string olur.
        System.out.println(text);

        String text1=""+658.02;
        System.out.println(text1);

    }
}
