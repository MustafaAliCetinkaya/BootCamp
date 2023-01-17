package lectureTasks.day48_49_Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class PracticeForCollectionsLinkedList {
    public static void main(String[] args) {
        System.out.println("------------------------------1--------------------------------");
        //1. Write a Java program to append the specified element to the end of a linked list. Go to the editor
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");

        // print the list
        System.out.println("The linked list: " + l_list);


        System.out.println("------------------------------2--------------------------------");
        //2. Write a Java program to iterate through all elements in a linked list.
        // Print the linked list
        for (String element : l_list) {
            System.out.println(element);
        }


        System.out.println("------------------------------3--------------------------------");
        //3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        // set Iterator at specified index
        Iterator p = l_list.listIterator(1);

        // print list from second position
        while (p.hasNext()) {
            System.out.println(p.next());
        }


        System.out.println("------------------------------4--------------------------------");
        //4. Write a Java program to iterate a linked list in reverse order.
        // print original list
        System.out.println("Original linked list:" + l_list);

        Iterator it = l_list.descendingIterator();

        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        System.out.println("------------------------------5--------------------------------");
        //5. Write a Java program to insert the specified element at the specified position in the linked list.
        System.out.println("Original linked list: ");
        System.out.println("Let add the Yellow color after the Red Color: " + l_list);
        l_list.add(1, "Yellow");
        // print the list
        System.out.println("The linked list:" + l_list);


        System.out.println("------------------------------6--------------------------------");
        //6. Write a Java program to insert elements into the linked list at the first and last position.
        System.out.println("Original linked list:" + l_list);
        // Add an element at the beginning
        l_list.addFirst("White");

        // Add an element at the end of list
        l_list.addLast("Pink");
        System.out.println("Final linked list:" + l_list);


        System.out.println("------------------------------7--------------------------------");
        //7. Write a Java program to insert the specified element at the front of a linked list.
        System.out.println("Original linked list:" + l_list);
        // Add an element to front of LinkedList
        l_list.offerFirst("Pink");
        System.out.println("Final linked list:" + l_list);


        System.out.println("------------------------------8--------------------------------");
        //8. Write a Java program to insert the specified element at the end of a linked list.
        System.out.println("Original linked list:" + l_list);
        // Add an element at the end of a linked list
        l_list.offerLast("Pink");
        System.out.println("Final linked list:" + l_list);


        System.out.println("------------------------------9--------------------------------");
        //9. Write a Java program to insert some elements at the specified position into a linked list.
        // create a new collection and add some elements

        LinkedList<String> new_l_list = new LinkedList<String>();
        new_l_list.add("White");
        new_l_list.add("Pink");

        // Add the collection in the second position of the existing linked list
        l_list.addAll(1, new_l_list);

        // print the new list
        System.out.println("LinkedList:" + l_list);


        System.out.println("------------------------------10--------------------------------");
        //10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        // Find first element of the List
        Object first_element = l_list.getFirst();
        System.out.println("First Element is: " + first_element);

        // Find last element of the List
        Object last_element = l_list.getLast();
        System.out.println("Last Element is: " + last_element);


        System.out.println("------------------------------11--------------------------------");
        //11. Write a Java program to display the elements and their positions in a linked list.
        // print original list
        System.out.println("Original linked list:" + l_list);
        for (int i = 0; i < l_list.size(); i++) {
            System.out.println("Element at index " + i + ": " + l_list.get(i));
        }




        System.out.println("------------------------------12--------------------------------");
        //12. Write a Java program to remove a specified element from a linked list.
        // print the list
        System.out.println("The Original linked list: " + l_list);

        // Remove the element in third position from the said linked list
        l_list.remove(2);
        System.out.println("The New linked list: " + l_list);




        System.out.println("------------------------------13--------------------------------");
        //13. Write a Java program to remove first and last element from a linked list.
        // Remove the first element
        Object firstElement = l_list.removeFirst();
        System.out.println("Element removed: "+ firstElement);

        // Remove the last element
        Object lastElement = l_list.removeLast();
        System.out.println("Element removed: "+ lastElement);
        System.out.println("The New linked list: " + l_list);




        System.out.println("------------------------------14--------------------------------");
        //14. Write a Java program to remove all the elements from a linked list.
        // print the list
        System.out.println("The Original linked list: " + l_list);

        // Removing all the elements from the linked list
        // l_list.clear();

        System.out.println("The New linked list: " + l_list);


        System.out.println("------------------------------15--------------------------------");
        //15. Write a Java program of swap two elements in a linked list. Go to the editor
        //Swapping 1st(index 0) element(Red) with the 3rd(index 2) element (Black)
        Collections.swap(l_list, 0, 2);
        System.out.println("The New linked list after swap: " + l_list);
    }
}

