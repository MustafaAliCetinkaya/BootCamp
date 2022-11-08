package collections.arrayList;

import java.util.ArrayList;

// add() iki türlüdür. Biri son kaldığı yerden eklemeye devam eder. Diğeri index belirtiriz istediğimiz yere ekler.
// ArrayListler aşağıdaki örnekte olduğu gibi istersek tek bir tür data tutabilir.
public class IndexUsage {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();//Görüleceği üzere başta ve sonda <> işareti mevcut. Tek tip data tanımaldık.
//İstersen ikinci <> işaretinin içine de String yazılabilir ama gerekli değildir.
        names.add("Hamza Kaya");
        names.add("Faruk Çetin");
        names.add("Evimiz");
        System.out.println(names+"\n*********************************");
        names.add(0, "İlknur");//İlk sıraya konulacağını da tanımladık. Birde böylesi var.
        names.add(4, "Seyhan");
        System.out.println("new ordered names = " + names+"\n*********************************");
        names.remove(2);// İkinci sıradaki evimiz ifadesi çıkarıldı.
        System.out.println(names);


    }
}
