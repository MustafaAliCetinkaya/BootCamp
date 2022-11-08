package collections.sets;
// Developerler if yapıları ile arraylist birleşimini kullanır. Bu aşağıdakiler çok verimli görülmüyor.
import java.util.TreeSet;
// Hem küme özelliği taşır (tekrarlı eleman bulunmaz) + hem de list özelliği taşır  (sıralı bir şekilde data tutar).
public class Tree_Set {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet();
        treeSet.add("İlknur");//Harf sırasına göre sıralanmış hallerini aşağıda gösterir.
        treeSet.add("Ali");//Birden fazla elemanı 1 kere yazar.
        treeSet.add("Veli");
        treeSet.add("Ali");
        treeSet.add("Veli");
//        treeSet.add(100); TreeSet sıralamaya çalıştığı için farklı tipte bir veri girdiğinde hata veriri. Sıralayamaz.
        //ArrayList de olduğu gibi <> arasına (başa ve sona) tip yazıp sadece bir tip eklenecek hale getirebiliriz.
        System.out.println(treeSet);
        System.out.println(treeSet.size());
        System.out.println(treeSet.contains("Veli"));
    }
}
