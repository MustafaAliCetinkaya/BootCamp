package reviewSessions.collection.setListOthers;

import java.util.*;
/*
    Write a program that can find the element that has the highest frequency in an arrayList
            Note: Must use a map

            Ex:
                list: [java, java, python, c#]

            output:
                [java=2, python=1, c#=1]
                element java has the highest frequency

     */
public class Task4 {
    public static void main(String[] args) {
        List<String> codingLanguages=new ArrayList<>();
        codingLanguages.addAll(Arrays.asList("java", "java", "python", "c#","java", "javaScript", "python", "c#","java", "java", "python", "c#", "c#"));

        Map<String, Integer> result = new LinkedHashMap<>();  //    [java=2, python=1, c#=1]

        for (String each : codingLanguages) {
            int frequency = Collections.frequency( codingLanguages, each);
            result.put(each,  frequency  );
        }

        System.out.println(result);     //codingLanguages and their frequencies are stored in the map

        System.out.println("-------------------------------------------------------------");

        Integer maxFrequency=Integer.MIN_VALUE;
        String maxName="";

        for (Map.Entry<String, Integer> eachEntry : result.entrySet()) {
            if(eachEntry.getValue() > maxFrequency){
                maxFrequency=eachEntry.getValue();
                maxName=eachEntry.getKey();
            }
        }

        System.out.println("Max frequency is: "+maxFrequency+" and it's key is: "+maxName);

        System.out.println("-------------------------------------------------------------");

        Collection<Integer> allFrequencies=result.values();
        List listOfAllFrequencies = new ArrayList(allFrequencies);
        Collections.sort(listOfAllFrequencies);


        result.forEach((k,v)->{
            if(v==listOfAllFrequencies.get(listOfAllFrequencies.size()-2)){
                System.out.println("Second most popular coding language is : "
                        + k + "\n, and it's frequency is : " + v);
            }
        });


    }

}