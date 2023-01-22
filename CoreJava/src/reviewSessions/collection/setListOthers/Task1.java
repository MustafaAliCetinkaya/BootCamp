package reviewSessions.collection.setListOthers;

import java.util.*;

public class Task1 {
    /*
 List<Integer> numbers=new ArrayList<>(Arrays.asList(24,1,2,3,3,9,24,3,4,3,5,3,5,3));

 - get the unique numbers(one of them) from list
 [24, 1, 2, 3, 9, 4, 5]
 */

    public static void main(String[] args) {

        List<Integer> numbers=new ArrayList<>(Arrays.asList(24,1,2,3,3,9,24,3,4,3,5,3,5,3));

        Set<Integer> set=new HashSet<>(numbers);
        System.out.println(set);

        set=new TreeSet<>(numbers); //sorted order
        System.out.println("TreeSet is sorted order = " + set);

        set=new LinkedHashSet<>(numbers); //keeps the order
        System.out.println("LinkedHashSet keeps the order= "+set);

/*
//old solution
        List<Integer> result=new ArrayList<>();


        for (Integer number : numbers) {

            if (!result.contains(number))
                result.add(number);
        }
        System.out.println(result);
//[24, 1, 2, 3, 9, 4, 5]

 */





    }


}