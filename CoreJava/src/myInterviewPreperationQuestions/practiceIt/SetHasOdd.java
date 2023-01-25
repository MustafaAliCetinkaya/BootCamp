package myInterviewPreperationQuestions.practiceIt;

import java.util.Iterator;
import java.util.Set;
/*Write a method hasOdd that takes a Set of integers as a parameter and that returns true
if the set contains at least one odd integer, and false otherwise. If passed the empty set,
your method should return false.

 */
public class SetHasOdd {

    public static boolean hasOdd(Set<Integer> set) {
        boolean hasOdd=true;
        int count=0;
        Iterator<Integer> iterator= set.iterator();
        while (iterator.hasNext()){
            if(iterator.next()%2!=0){
                count++;
            }
        }
        return hasOdd;
    }
}
