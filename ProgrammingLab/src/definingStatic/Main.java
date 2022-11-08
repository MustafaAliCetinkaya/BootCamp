package definingStatic;

public class Main {
    public static void main(String[] args) {
        StringConcept car1=new StringConcept("Toyota", "Green", "Manuel");
        StringConcept car2=new StringConcept("Mercedes", "White", "Automatic");
        StringConcept car3=new StringConcept("Lexus", "Red", "Semi-Automatic");

        System.out.println("car3 year = " + car3.year);//Buradaki year diğer tarafta değiştirilirse tümü birden değişir.
        System.out.println("car3.typeOfGear = " + car3.typeOfGear);
        System.out.println("car3.trademark = " + car3.trademark);
        System.out.println("car3.color = " + car3.color+"\n");

        System.out.println("car2 year = " + car2.year);
        System.out.println("car2.typeOfGear = " + car2.typeOfGear);
        System.out.println("car2.trademark = " + car2.trademark);
        System.out.println("car2.color = " + car2.color+"\n");

        System.out.println("car1 year = " + car1.year);
        System.out.println("car1.typeOfGear = " + car1.typeOfGear);
        System.out.println("car1.trademark = " + car1.trademark);
        System.out.println("car1.color = " + car1.color+"\n");

        System.out.println("Year of all cars: "+StringConcept.year);//int year STATIC tanımlandığı için class aittir. Tüm araçların yaşı budur. 
// Static olan metotlar ve değişkenler class aittir. Neyneye değil. Bu nedenle nesne oluşturulmadan "ClassAdı.metot" şeklinde kullanılabilir.
//STATIC olarak tanımlanan herşey evvel emirde hafızaya kaydedilir. Kullanılmasa bile hafızada yer tutar. Sonra konsoldan istenildiğinde derlenir, yazdırılır.
        //Static de çalışacak bir verinin ya kendisi static olmalı ya da static bir class içinde üretilmelidir. Aksi halde çalışmayacaktır.
    }
}
