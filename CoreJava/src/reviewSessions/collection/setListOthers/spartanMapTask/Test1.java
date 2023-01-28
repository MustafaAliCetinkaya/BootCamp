package reviewSessions.collection.setListOthers.spartanMapTask;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test1 {

    public static void main(String[] args) {
        Map<String, String> spartan1 = new TreeMap<>();

        //add key and value

        spartan1.put("id", "1");
        spartan1.put("name", "Adam");
        spartan1.put("gender", "M");


        System.out.println(spartan1);


        Map<String, String> spartan2 = new LinkedHashMap<>();
        Spartan spartan = new Spartan();

        spartan2.put("id", "2");
        spartan.setId("2");

        spartan2.put("name","Burhan");
        spartan.setName("Burhan");

        spartan2.put("gender","M");
        spartan.setGender("M");


        System.out.println(spartan2.get("id"));
        System.out.println(spartan.getId());


    }
}