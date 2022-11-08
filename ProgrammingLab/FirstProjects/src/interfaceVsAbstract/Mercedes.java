package interfaceVsAbstract;

public class Mercedes extends Car implements Features{//ikitane extend yapamayız ama yanına şmplement koyabildik. HATTA Features sonrasına virgül konularak daha fazla interface de koyabilirdik.

    @Override//abstracttan miras alınan metot muhakkak override edilerek kullanılmak zorunda
    public void information() {//İçlerini burada doldururz.
        System.out.println("Year: 2023");
    }

    @Override//imlementten alınan metotlar da muhakkak kullanılmak zorunda. Override ile kullanırız. İçleri kendi class ında boş. Biz burada istediğimiz gibi doldurabiliriz.
    public void run() {//Abstract metotların içi oluştuğu yerde boş olmak zorunda, biz burada dolduruyoruz.
        System.out.println("Gear Type: Automatic");
    }
}
