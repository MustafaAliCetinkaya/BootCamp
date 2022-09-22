package oblectOrientedProgramming.oblectOrientedProgramming1;

public class Main {
    public static void main(String[] args) {
        Student1 object1=new Student1();//Baştaki class ismine constructor denir. "new" ifadesi olmazsa olmazdır.
        Student2 object2=new Student2();//Class lardaki bilgiler object kelimesine bağlanmış durumda
        Student3 object3=new Student3();//Aslında iç içe klasöt oluşturmak gibi. Daha düzenli olsun diye kişiye özel klasörler oluşturduk.
   //Yukardaki ifadeleri yazarak nesneler oluşturduk, nesne isimlerini çağırdığımızda class daki bilgilere erişeceğiz.

        System.out.println("object3 contact information = " + object3.phoneNumber+"\n");
        System.out.println("object2 education information = " + object2.schoolName+"\n");
        System.out.println("object1 gender information = " + object1.gender+"\n");

        object1.likes();//Nesnelere ait class da bulunan metotlar da çağrılabilir.Bu yöntemle tüm bilgiler tek seferde de yazdırılabilir.
        object1.dislikes();
    }
}
