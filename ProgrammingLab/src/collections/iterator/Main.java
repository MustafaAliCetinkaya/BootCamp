package collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
// Collection özelliklerinden biridir. Bizi veri içinde gezintiye çıkaran yapılardır. Gezinti sırasında üzerinden geçtiğimiz datalar üzerinde her istediğimizi yapabiliriz.
// Bi normali birde ListIterator var. Normalinde baştan sona doğru hareket, ListIterator da son elemandan ilk elemana doğru tersine hareket edebiliyoruz.
// Import edilmeden tanımlanmadan bunu kullanamıyoruz.
public class Main {
    public static void main(String[] args) {
        ArrayList <String>names=new ArrayList<>();
        names.add("Melike");
        names.add("Fatih");
        names.add("Selma");
        names.add("Ezgi");

        Iterator navigate=names.iterator();//ListIterator yazarak da tersden elemanları dolanabilriz. Daha fazla metot vardır. Data eklenir, üzerinden geçilen değiştirilir. Daha fonksiyonel özelliklere sahiptir.

/*        while(navigate.hasNext()){      Bir kerede bu şekilde tüm elemanları da yazdırabiliriz.
            System.out.println(navigate.next());
        }*/
        System.out.println(navigate.hasNext());//Listede data var mı sorusuna true false der.
        System.out.println(navigate.next());//Data varsa harekete geçerek sırayla gezdirir.

        System.out.println(navigate.next());//Remove etmek için bastırdığım next in altına romeve yaarız.
        //navigate.remove();Bir elemanın altına yazmazsak neyi sileceğini bilemez.

        System.out.println(navigate.next());//for döngüsünü kullanmadan iterator yardımıyla daha kolay yapmış oluyoruz.
        System.out.println(navigate.next());
        //System.out.println(navigate.next()); Burada hata veriri çünkü eleman bitti, ötesi yok diye hata çıkarır.
        }
    }



