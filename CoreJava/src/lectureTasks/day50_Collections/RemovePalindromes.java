package lectureTasks.day50_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

//My solution1
        List<String> withoutPalindromes = new ArrayList<>();
        for (String eachName : names) {
            for (int i = 0; i < eachName.length() / 2; i++) {
                if (eachName.toLowerCase().charAt(i) != eachName.toLowerCase().charAt(eachName.length() - 1 - i)) {
                    if (!withoutPalindromes.contains(eachName)) {
                        withoutPalindromes.add(eachName);
                    }
                }
            }
        }
        System.out.println("My solution1" + withoutPalindromes);
        System.out.println("===================================================");
//My solution2
        List<String>solution2=new ArrayList<>();
        for (String eachName : names) {
            String reverse="";
            for (int i=eachName.length()-1;i>=0;i--){
                reverse+=eachName.charAt(i);
            }
            if(! reverse.equalsIgnoreCase(eachName)){
                if(! solution2.contains(reverse)){
                    solution2.add(eachName);
                }
            }
        }
        System.out.println("Solution2: "+solution2);

        System.out.println("===================================================");

//Muhtar's solution
        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String each = it.next();
            String reverse = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }

            if (each.equalsIgnoreCase(reverse)) {
                it.remove();
            }
        }

        System.out.println(names);

        System.out.println("-----------------------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        /*
        Predicate<String> palindrome = str -> {
            String reverse = "";
            for(int i = str.length()-1; i >= 0; i--){
                reverse += str.charAt(i);
            }
            return reverse.equalsIgnoreCase(str);
        };

        names2.removeIf(palindrome);
         */

        /*
        names2.removeIf(str -> { String reverse = "";
            for(int i = str.length()-1; i >= 0; i--){
                reverse += str.charAt(i);
            }
            return reverse.equalsIgnoreCase(str);}
        );

        System.out.println(names2);
        */


    }
}