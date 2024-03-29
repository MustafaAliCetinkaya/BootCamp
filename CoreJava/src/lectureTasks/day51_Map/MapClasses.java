package lectureTasks.day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {
        //    key     value
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Ahmet");//Keys are same. So last added one will be stored.
        hashMap.put(5, "Isabella");
        hashMap.put(6, null);
        hashMap.put(7, null);//Values can be duplicated. So all of them will be stored.
        hashMap.put(8, null);
        hashMap.put(null, null);
        hashMap.put(null, "Emre");//Keys must be unique
        hashMap.put(null, "Hulya");//If the keys are same, last inserted value will be stored. It is stored in the zero index
        System.out.println(hashMap.size());
        System.out.println("hashMap = " + hashMap);
        System.out.println(hashMap.get(null));
        System.out.println("===================================================");

       // System.out.println(hashMap.get());
        

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();//Keeps the insertion order
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(null, "Hulya");

        System.out.println("linkedHashMap = " + linkedHashMap);
        

        Map<Integer, String> treeMap = new TreeMap<>(); // Key can not be null, value can be null and duplicated
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5,"Isabella");
        treeMap.put(7, null);

        System.out.println("treeMap = " + treeMap);


        Map<Integer, String> hashtable = new Hashtable<>(); // key and value both can not null
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");
        hashtable.put(5,"Isabella");
        System.out.println("hashtable = " + hashtable);
        System.out.println(hashtable.size());
        hashtable.put(6, null);//Will cause error
        System.out.println("hashtable = " + hashtable);
        //Exception in thread "main" java.lang.NullPointerException will be thrown.



     //   String str = null;
       // System.out.println(str.toUpperCase());


    }

}

/*
browser   chrome
url
username   cydeo
password  cydeo123



 */