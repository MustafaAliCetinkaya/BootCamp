package myInterviewPreperationQuestions.practiceIt;

import java.util.*;

/*Write a method countUnique that takes a List of integers as a parameter and returns
the number of unique integer values in the list. Use a Set as auxiliary storage to help
you solve this problem.

For example, if a list contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15], your method
should return 5. The empty list contains 0 unique values.

*/
public class SetCountUnique {
    public static void main(String[] args) {
        List<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));
        System.out.println("All Numbers: "+numbers.size());

        System.out.println("===================================================");

        Set<Integer>setOfNumbers=new HashSet<>(numbers);
        System.out.println("Unique Numbers: "+setOfNumbers.size());
    }
}
