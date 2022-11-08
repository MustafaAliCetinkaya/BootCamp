package definingStatic;

public class StringConcept {
    String trademark;//İçi boş bir değişken tanımlarken eşittir kullanmıyoruz. Sadece noktalı virgül koy geç
    String typeOfGear;
    static int year=2019;//Statik bir kere tanımlanır, herkese aittir. Class ın genel özelliğidir. Yani Tüm arabaların modeli budur.
    //Bunun değerini değiştirdiğimizde tüm araçların değeri birden değişecek. Çünkü Static ve tüm class a aittir.
    String color;

    public StringConcept (String newTrademark, String newColor, String newTypeOfGear){
        this.color=newColor;//this bu şekilde yazılınca bu class anlamına gelir. Yani bu class ın atanan color değerini newColor a ata.
        this.trademark=newTrademark;
        this.typeOfGear=newTypeOfGear;
    }
}
