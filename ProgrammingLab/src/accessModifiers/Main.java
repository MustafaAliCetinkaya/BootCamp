package accessModifiers;
//PRIVATE: Sadece sınıftan erişilebilir, DEFAULT: Sadece paketten erişilebilir.
//PUBLIC: Aynı paketteki bütün class lardan da çağrılabilir. PROTECTED: Paket içinden ve sub-class lardan erişime izin verir.
//Erişim Belirteçleri bilgiye erişimle ilgilidir. Erişim kısıtlanarak güvenlik tedbiri şeklinde kullanılabiliyor.
public class Main {
    public static void main(String[] args) {
        Private_AccessModifiers object1 = new Private_AccessModifiers();
        Default_AccessModifiers object2 = new Default_AccessModifiers();
        Protected_AccessModifiers object3 = new Protected_AccessModifiers();

        System.out.println("object3 defaultNumber = " + object3.defaultNumber);
        System.out.println("object3 = protectedNumber" + object3.protectedNumber);
        //Başka bir package da "public class XXX extends Protected_AccessModifiers" yazılırsa istisnai olarak çağrılabilir.
        //Ama private tanımlanan erişemiyoruz. Teklif dahi etmiyor.
        System.out.println("*************************");
        System.out.println("object2 Name = " + object2.name);
        System.out.println("object2 Age= " + object2.age);
        System.out.println("*************************");
        System.out.println("object1 Name = " + object1.name);
        System.out.println("object1 Age= " + object1.age);
        //Bunlar gibi kimlik numarasını çağıramıyorum. Çünkü private tanımlandı.

        //object1.info(); burada hata verir çünkü info private olduğu için erişemez. Public tanımlansaydı içerideki bilgi gizli bile olsa buradan çağrılabiliyor.

        //Aynı class dan hepsi (private, protected, default, public) erişime izin verir
        //Aynı paket ama farklı classdan izin verilenler: "protected, default, public"
        //Farklı paketten MİRAS yoluyla: "protected, public"
        //Her yerden: public
        //TÜM BUNLAR GÜVENLİ VE DÜZENLİ BİR PROGRAMLAMA SAĞLAR. JAVA DİĞERLERİNDEN GÜVEN SEBEBİYLE DAHA ÜSTÜN
    }
}
