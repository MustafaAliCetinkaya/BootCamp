package oblectOrientedProgramming.oop_Last_Abstraction;
//Ortak özellikleri topladığım class bir canlı değildir, sadece nitelikleri/özellikleri içeriri.
public abstract class CommonFeatures {//Burayı abstract yaparak nesne oluşturulamaz hale getirdik.
    //Abstract class neyi yaptığıyla ilgilenir, nasıl yaptığıyla ilgilenmez. Yani BODY bölümü boş olur. Nasıl ses çıkaracağına kendisi karar verir.
    int numberOfLegs;
    boolean hasTail;
    String color;
    //Abstract class içinde abstract metot oluşturulabilir. Hatta abstract metot sadece abstract class içinde oluşturulabilir.
    //Oluşturulan abstract metotlar kullanılmak zorundadır.

    public abstract void voice();//Abstract metotların süslü parantez içinde body bölümleri olmaz.
    //body bölümü olmadığında bişey döndürmez. Niye yaptık peki: BUNLARI OVERRIDE CLASS A EKLEMEK İÇİN ÜRETİRİZ.
//İstersek Abstract olmayan metot da oluşturabilirdik. Böyle olduğunda miras alır ama override etmek zorunda değildir.
}
