package collections.sets;

import java.util.HashSet;

//Bildiğimiz küme mantığıdır. Tekrarlı eleman yok, sıralı bilgi yok.
public class Hash_Set {
    public static void main(String[] args) {
        HashSet sets=new HashSet();
        sets.add("Ali");//Tekrarlı eleman olmayacak, 1 defa ekleyecek
        sets.add("Veli");
        sets.add("Veli");
        sets.add("Ali");
        sets.add("False");
        sets.add(23465);
        System.out.println(sets);
        System.out.println(sets.size());//Eleman sayısını gösterir.
           System.out.println(sets.contains("False"));
        System.out.println(sets);
        sets.remove("Ali");
        System.out.println(sets);

/*        Object [] array=sets.toArray();
        System.out.println(Arrays.toString(array));*/








    }

}
