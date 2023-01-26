package myInterviewPreperationQuestions.practiceIt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRemoveEvenLength {
    public static void main(String[] args) {
        Set<String> evenLength = new HashSet<>();
        evenLength.addAll(Arrays.asList("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"));
        System.out.println(evenLength);
        removeEvenLength(evenLength);
    }

    public static void removeEvenLength(Set<String> set) {
        Set<String> evenLength = new HashSet<>();
        Iterator<String> iterator = evenLength.iterator();
        {
            while (iterator.hasNext()) {
               String each= iterator.next();
                if (each.length() % 2 == 0) {
                    iterator.remove();
                }
            }
        }
        //evenLength.removeIf(p->p.length()%2==0);
        System.out.println(evenLength);
    }
}
