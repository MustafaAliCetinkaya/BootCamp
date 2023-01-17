package lectureTasks.day48_49_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeForCollectionsArrayList {
    public static void main(String[] args) {
        System.out.println("------------------------------1--------------------------------");
        //1. Write a Java program to create a new array list,
        // add some colors (string) and print out the collection.
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println(list_Strings);


        System.out.println("------------------------------2--------------------------------");
        //2. Write a Java program to iterate through all elements in a array list.
        // Print the list
        for (String element : list_Strings) {
            System.out.println(element);
        }


        System.out.println("------------------------------3--------------------------------");
        //3. Write a Java program to insert an element into the array list at the first position.
        // Now insert a color at the first and last position of the list
        list_Strings.add(0, "Pink");
        list_Strings.add(5, "Yellow");
        // Print the list
        System.out.println(list_Strings);


        System.out.println("------------------------------4--------------------------------");
        //4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        // Retrieve the first and third element
        String element = list_Strings.get(0);
        System.out.println("First element: " + element);
        element = list_Strings.get(2);
        System.out.println("Third element: " + element);


        System.out.println("------------------------------5--------------------------------");
        //5. Write a Java program to update specific array element by given element.
        // Update the third element with "Yellow"
        list_Strings.set(2, "Yellow");
        // Print the list again
        System.out.println(list_Strings);


        System.out.println("------------------------------6--------------------------------");
        //Write a Java program to remove the third element from an array list.
        // Remove the third element from the list.
        list_Strings.remove(2);
        // Print the list again
        System.out.println("After removing third element from the list:\n" + list_Strings);


        System.out.println("------------------------------7--------------------------------");
        //7. Write a Java program to search an element in an array list.
        // Search the value Red
        if (list_Strings.contains("Red")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }


        System.out.println("------------------------------8--------------------------------");
        //8. Write a Java program to sort a given array list.
        Collections.sort(list_Strings);
        System.out.println("List after sort: " + list_Strings);


        System.out.println("------------------------------9--------------------------------");
        //9. Write a Java program to copy one array list into another.
        List<String> List1 = new ArrayList<String>();
        List1.add("1");
        List1.add("2");
        List1.add("3");
        List1.add("4");
        Collections.copy(list_Strings, List1); //WE cannot copy Collections.copy(List1, list_Strings )
        System.out.println("List1: " + List1);
        System.out.println("List2: " + list_Strings);


        System.out.println("------------------------------10--------------------------------");
        //10. Write a Java program to shuffle elements in an array list.
        Collections.shuffle(list_Strings);
        System.out.println("List after shuffling:\n" + list_Strings);


        System.out.println("------------------------------11--------------------------------");
        //11. Write a Java program to reverse elements in an array list.
        Collections.reverse(list_Strings);
        System.out.println("List after reversing :\n" + list_Strings);


        System.out.println("------------------------------12--------------------------------");
        //12. Write a Java program to extract a portion of an array list.
        List<String> sub_List = list_Strings.subList(0, 3);
        System.out.println("List of first three elements: " + sub_List);


        System.out.println("------------------------------13--------------------------------");
        //13. Write a Java program to compare two array lists.
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        //Storing the comparison output in ArrayList<String>
        ArrayList<String> c3 = new ArrayList<String>();
        for (String each : c1)
            c3.add(c2.contains(each) ? "Yes" : "No");
        System.out.println(c3);


        System.out.println("------------------------------14--------------------------------");
        //14. Write a Java program of swap two elements in an array list.
        Collections.swap(list_Strings, 0, 2);
        System.out.println("Array list after swap: " + list_Strings);



        System.out.println("------------------------------15--------------------------------");
        //15. Write a Java program to join two array lists.
        // Let join above two list
        ArrayList<String> a = new ArrayList<String>();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("New array: " + a);

    }
}
