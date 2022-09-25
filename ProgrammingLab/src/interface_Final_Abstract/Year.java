package interface_Final_Abstract;
//Interface da ya STATIC ya da ABSTRACT metot oluşturulabilir. Başka çeşit metot oluşmaz.
//Abstract oluşturursak miras aldığımız yerde override etmke zorundayız.

public interface Year {//Bu Class değil interface. Interfacen NESNE  OLUŞTURULAMAZ.

    int number=2021;//Değerleri değiştirlemez. "final" yani sabit olarak oluşur. Önünde gizli "final" yazar. Biz yazmasak da gizli olarak orada.
    String name="New product";

    void newProduct(); //Metot oluşturulabilir ama interface de oluşan TÜM METOTLAR OTOMATİK ABSTRACT olur.
    //Abstract olduğu için BODY kısmı yoktur.
    //BODY olsun istiyorsak public static bir class tanımlamamız gerekir.
    //Yani metodun başıbda gizli (public abstract) yazar. Biz elle yazsak da yanlış olmaz.

    public static void example (){
        System.out.println("example");
    }
}
