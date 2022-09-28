package collections.arrayList;

import java.util.ArrayList;

// Liste uzunluğu dinamiktir, yani boyut belirtmeden istediğim kadar data tutabilrim.
// Farklı tipte dataları aynı anda tutabiliyorum.
// add() yöntemiyle içine eleman ekleyebiliyorum.
// get() metotu ile istediğimiz sıradaki verileri yazdırabiliyoruz. Başka metotlar da var ama bunlar en sık kullanılan ikisidir.
//Biz istersek içerde sadece bir tek data tipi olmasını isteyebiliriz.
public class Main {
    public static void main(String[] args) {
        //ArrayList kavramı kullanılınca impoer edilmek zorunda. Normal arrays de bu yoktu.
        ArrayList names=new ArrayList();
        names.add("Ali Can");
        names.add("Murtaza");
        names.add("Kahraman");
        names.add(1453);
        names.add(355.54654);

        //Farklı türdeki dataları ekleyebildim. Eklediğimiz sıraya göre yazdırır.
        System.out.println(names);
        System.out.println(names.get(2));// get(2) metodu ile istediğimiz indexteki verileri alabiliyoruz.
        System.out.println(names.size());// içerdeki eleman sayısını gösterir.

        //names.clear(); içerdeki herkesi temizler

        boolean IsExist=names.contains("Kahraman");//Strindeki gibi içinde ne var ne yok sorabiliyoruz.
        System.out.println(IsExist);

        System.out.println("Index of 1453: "+names.indexOf(1453));//Aranılan datanın hangi indexte olduğunuı öğrenmiş oluruz.

        ArrayList<String> cars=new ArrayList<>();//Küçüktür büyüktür işareti 2 dafa kullanılır. Baştakinin içine istediğimiz tür yazılır.
        //içeriye primitive data typler yazılamaz (int, short, byte). İçerdeki büyük harfli olmalıdır. Yani Wrepper class (primitivelerin büyük harfle başlayanları kullanılabilir)
    }
}
