package lectureTasks.day48_49_Collections;

import java.util.*;

public class PracticeForCollectionsHashSet {
    public static void main(String[] args) {
        System.out.println("------------------------------1--------------------------------");
        //1. Write a Java program to append the specified element to the end of a hash set.
        // Create a empty hash set
        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Pink");
        h_set.add("Green");
        h_set.add("Green");
        h_set.add("Yellow");
        h_set.add("Black");
        h_set.add("White");
        // print the hash set
        System.out.println("The Hash Set: " + h_set);


        System.out.println("------------------------------2--------------------------------");
        //2. Write a Java program to iterate through all elements in a hash list.
        // set Iterator
/*        Iterator<String> p = h_set.iterator();
        // Iterate the hash set
        while (p.hasNext()) {
            System.out.println(p.next());
        }*/

        System.out.println("------------------------------3--------------------------------");
        //3. Write a Java program to get the number of elements in a hash set.
        System.out.println("Size of the Hash Set: " + h_set.size());

        System.out.println("------------------------------4--------------------------------");
        //4. Write a Java program to empty an hash set.
        // h_set.removeAll(h_set);
        //System.out.println("Hash Set after removing all the elements "+h_set);


        System.out.println("------------------------------5--------------------------------");
        //5. Write a Java program to test a hash set is empty or not.
        //System.out.println("Checking the above array list is empty or not! "+h_set.isEmpty());
        //System.out.println("Remove all the elements from a Hash Set: ");
        //h_set.removeAll(h_set);
        //System.out.println("Hash Set after removing all the elements "+h_set);


        System.out.println("------------------------------6--------------------------------");
        //6. Write a Java program to clone a hash set to another hash set.
        System.out.println("Original Hash Set: " + h_set);
        HashSet<String> new_h_set = new HashSet<String>();
        new_h_set = (HashSet) h_set.clone();
        System.out.println("Cloned Hash Set: " + new_h_set);

        System.out.println("------------------------------7--------------------------------");
        //7. Write a Java program to convert a hash set to an array.
        System.out.println("Original Hash Set: " + h_set);
        // Creating an Array
        String[] new_array = new String[h_set.size()];
        h_set.toArray(new_array);

        // Displaying Array elements
        System.out.println("Array elements: ");
        for (String element : new_array) {
            System.out.println(element);
        }


        System.out.println("------------------------------8--------------------------------");
        //8. Write a Java program to convert a hash set to a tree set.
        System.out.println("Original Hash Set: " + h_set);

        // Creat a TreeSet of HashSet elements
        Set<String> tree_set = new TreeSet<String>(h_set);

        // Display TreeSet elements
        System.out.println("TreeSet elements: ");
        for (String element : tree_set) {
            System.out.println(element);
        }


        System.out.println("------------------------------9--------------------------------");
        //9. Write a Java program to convert a hash set to a List/ArrayList.
        System.out.println("Original Hash Set: " + h_set);

        // Create a List from HashSet elements
        List<String> list = new ArrayList<String>(h_set);

        // Display ArrayList elements
        System.out.println("ArrayList contains: " + list);


        System.out.println("------------------------------10--------------------------------");
        //10. Write a Java program to compare two hash set.
        HashSet<String> h_set2 = new HashSet<String>();
        h_set2.add("Red");
        h_set2.add("Pink");
        h_set2.add("Black");
        h_set2.add("Orange");
        //comparison output in hash set

        for (String element : h_set) {
            System.out.println(h_set2.contains(element) ? "Yes" : "No");
        }


        System.out.println("------------------------------11--------------------------------");
        //11. Write a Java program to compare two sets and retain elements which are same on both sets.
        System.out.println("Frist HashSet content: " + h_set);

        System.out.println("Second HashSet content: " + h_set2);
        h_set.retainAll(h_set2);
        System.out.println("HashSet content:");
        System.out.println(h_set);


        System.out.println("------------------------------12--------------------------------");
        //12. Write a Java program to remove all the elements from a hash set.
        System.out.println("Original hash set contains: " + h_set);
        //  clear() method removes all the elements from a hash set
        // and the set becomes empty.
        h_set.clear();

        // Display original hash set content again
        System.out.println("HashSet content: " + h_set);

    }
}

