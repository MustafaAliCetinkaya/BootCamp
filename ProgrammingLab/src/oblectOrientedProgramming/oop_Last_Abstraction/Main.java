package oblectOrientedProgramming.oop_Last_Abstraction;
//Abstract metotlar STATIC olamaz!
//Common features olan class sadece ortak özellikleri gösterdiğinden bu class dan nesne oluşturulamamasına soyutlama denir.
public class Main {
    public static void main(String[] args) {
        Cat object = new Cat();
        object.voice();

        //CommonFeatures dog =new CommonFeatures();==>abstract olduğu için nesne üretilemez. Ama miras alınabilir.
        CommonFeatures dog = new Dog();//Abtract dan halen miras alabiliyoruz ama absrtactdan nesne oluşmaz.
        dog.voice();
    }
}
//Biilgiyi kısıtlayarak herkese yeri kadar bilgi erişimi açmak gibidir. "Nasıl yaptığıma karışma ne yaptığımı bil, ne yapacağımı söyle" soyutlamanın sloganıdır.
//İnsan bilgisayarın karmaşık yapısını bilmek zorunda değil. Ön yüz daha sade tutulur, arkada karmaşık işlemler olur, işte bu insan ile makinen arasında SOYUTLAMA yapmaktır.
//Abstract class içinde abstract metotların içi boştur, bu altsaoylara genel bir özellik eklemek için üretilir. Bu metodun içi diğer altsoylarda kendine göre farklı şekillerde doldrurulabilir.
//Inheritance dan abstract ın farkı: Inheritence da kodlar miras verilen metot içindedir. Abstractın ise içi boş, her altsoy kendi özelliğine göre içini doldurur.
//Yeni özellik ekleme, sonradan değişilik yapma, eski koda 10 kat daha inşaat gibi kat ekleme bu sayede mümkün oluyor.

