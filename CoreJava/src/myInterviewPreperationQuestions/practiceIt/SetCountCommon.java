package myInterviewPreperationQuestions.practiceIt;

import java.util.*;

/*Write a method countCommon that takes two Lists of integers as parameters and returns
the number of unique integers that occur in both lists. Use one or more Sets as storage
to help you solve this problem.

For example, if one list contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] and the other
list contains the values [-5, 15, 2, -1, 7, 15, 36], your method should return 4
(because the elements -1, 2, 7, and 15 occur in both lists).*/
public class SetCountCommon {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(-5, 15, 2, -1, 7, 15, 36));

        System.out.println("===================================================");
        List<Integer> temp=new ArrayList<>();
        for (Integer eachList1 : list1) {
            for (int i = 0; i < list2.size(); i++) {
                if (eachList1 == list2.get(i)) {
                    if(!temp.contains(eachList1)){
                        temp.add(eachList1);
                    }
                }
            }
        }
        System.out.println(temp.size());
        System.out.println("===================================================");

        Set<Integer> set = new HashSet<Integer>(list1);
        Iterator<Integer> i = set.iterator();
        int count = 0;

        while (i.hasNext()) {
            if (list2.contains(i.next())) {
                count++;
            }
        }

        System.out.println(count);

    }

}
