package reviewSessions.collection.setListOthers.spartanMapTask;

import java.util.*;

public class Spartans {

    public static List<Map<String,Object>> getSpartans(){
        Map<String, Object> spartan1=new HashMap<>();
        spartan1.put("id",1);
        spartan1.put("name","Adam");
        spartan1.put("gender","Male");
        spartan1.put("phone",1234567890);


        Map<String, Object> spartan2 =new HashMap<>();
        spartan2.put("id",2);
        spartan2.put("name","Aynur");
        spartan2.put("gender","Female");
        spartan2.put("phone",1234567890);


        Map<String, Object> spartan3=new HashMap<>();
        spartan3.put("id",3);
        spartan3.put("name","Emre");
        spartan3.put("gender","Male");
        spartan3.put("phone",1234567890);



        Map<String, Object> spartan4 =new HashMap<>();
        spartan4.put("id",4);
        spartan4.put("name","Nigar");
        spartan4.put("gender","Female");
        spartan4.put("phone",1234567890);


        Map<String, Object> spartan5 =new HashMap<>();
        spartan5.put("id",5);
        spartan5.put("name","Fazilat");
        spartan5.put("gender","Female");
        spartan5.put("phone",1234567890);


        Map<String, Object> spartan6 =new HashMap<>();
        spartan6.put("id",6);
        spartan6.put("name","Alev");
        spartan6.put("gender","Female");
        spartan6.put("phone",1234567890);


        Map<String, Object> spartan7 =new HashMap<>();
        spartan7.put("id",7);
        spartan7.put("name","Melda");
        spartan7.put("gender","Female");
        spartan7.put("phone",1234567890);



        Map<String, Object> spartan8 =new HashMap<>();
        spartan8.put("id",8);
        spartan8.put("name","Hamid");
        spartan8.put("gender","Male");
        spartan8.put("phone",1234567890);



        Map<String, Object> spartan9 =new HashMap<>();
        spartan9.put("id",9);
        spartan9.put("name","Vasyl");
        spartan9.put("gender","Male");
        spartan9.put("phone",1234567890);



        Map<String, Object> spartan10 =new HashMap<>();
        spartan10.put("id",10);
        spartan10.put("name","Kubra");
        spartan10.put("gender","Female");
        spartan10.put("phone",1234567890);


        Map<String, Object> spartan11 =new HashMap<>();
        spartan11.put("id",11);
        spartan11.put("name","Serhan");
        spartan11.put("gender","Male");
        spartan11.put("phone",1234567890);


        //Spartan
        List<Map<String,Object>> spartans=new ArrayList<>();
        spartans.addAll(Arrays.asList(spartan2,spartan3,spartan4,spartan5,spartan6,spartan11,spartan1,spartan7,  spartan8,spartan9,spartan10));
return spartans;

    }
}