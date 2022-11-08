package collections.maps;

import java.util.TreeMap;

//Hash den farkı anahtar bölümünü sıralı eklemesidir. Diğerleri aynı
public class Tree_Map {
    public static void main(String[] args) {
        TreeMap object=new TreeMap();
        object.put("Ali", 456);
        object.put("Ali Baba", 4596);
        object.put("Hasan", 1200);
        object.put("Veli", 1000);
        System.out.println(object);
        System.out.println(object.size());
        System.out.println(object.lastEntry());//Daha fazla metot mevcut




    }

}
