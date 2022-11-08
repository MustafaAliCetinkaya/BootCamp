package collections.sets;

import java.util.HashSet;
import java.util.TreeSet;

public class Hash_Tree_ForEach {
    public static void main(String[] args) {
        HashSet<String> set1=new HashSet<>();//String demezsek bundaki default tip Object olur, herşeyi nesne zannettiği için de for kullandırmaz.
        TreeSet <String>set2=new TreeSet<String>();//Böyle de yazılabilir ama ikinci String ifadesi gereksizdir.

        set1.add("Ali");
        set1.add("Kahraman");
        set1.add("Kamyon");
        set1.add("Ev");
        System.out.println(set1);

        for (String names:set1 ) {//Bu foreach yapısıdır. sırayla döndürerek verileri yazdırır. Normal "i" yöntemi işe yaramaz çünkü sıra yok.
            System.out.print(names+" / ");
        }






    }
}
