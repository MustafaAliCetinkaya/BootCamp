package reviewSessions.arrayList;

import java.util.ArrayList;

import java.util.Arrays;

public class ArrayListIntro {

    public static void main(String[] args) {
        // how to create an arraylist

        ArrayList<String> cities = new ArrayList<>();
        //  ArrayList<String> cities=new ArrayList<String>();
        // how to add element
        cities.add("London"); //returns boolean //0
        cities.add("Paris");  //1
        cities.add("Istanbul"); //2
        cities.add("Rome"); //3

        //how to print it

        //for Array Arrays.toString(arrayname)
        System.out.println(cities);

        //how to add one lement at the begining

        cities.add(0, "Vienna");
        // 0        1       2       3       4

        //Vienna, London, Paris, Istanbul, Rome

        System.out.println(cities);
        cities.remove("Rome");
        System.out.println("Test: "+cities);

        //how to get element
        System.out.println(cities.get(0)); //Vienna

        //how to update your element
        System.out.println(cities.set(2, "NewYork")); // set method is returning element which you updated Paris
        System.out.println(cities.set(3, "Angara")); //Istanbul

        System.out.println("===========After Update=============");
        System.out.println(cities);

        //how to learn positon of the element or index of element


        System.out.println(cities.indexOf("NewYork")); //2

        System.out.println(cities.indexOf("Paris")); // if it is not exist you will get -1


        System.out.println(cities.indexOf("New")); //-1

        // lastIndexOf()
        System.out.println(cities.lastIndexOf("London"));

        //indexOf and lastIndexOf will give same index if the elemnt is unique

        cities.add("London");
        System.out.println(cities);
        // 0      1         2       3      4     5
        //Vienna, London, NewYork, Angara, Rome, London
        System.out.println(cities.indexOf("London")); //it is checking the elemnt from beginnig and return the index
        // 1
        System.out.println(cities.lastIndexOf("London")); // it is checking the element from last //5


        // ArrayList<int> arrayList=new ArrayList<int>(); // it will give me compile error

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.add(1);

        System.out.println(numbers);
        //0  1  2  3  4  5  6  7   88indexes
        //1, 1, 1, 2, 3, 4, 5, 1, 1


        System.out.println(numbers.indexOf(1)); //0
        System.out.println(numbers.lastIndexOf(1)); //7

        ArrayList<Integer> numbers1=new ArrayList<>();

        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);
        numbers1.add(1);
        // 0  1  2  3  4
        // 2, 3, 4, 5, 1
        System.out.println(numbers1);
        //how to remove element

        numbers1.remove(1);// 3
        System.out.println(numbers1);
        Integer b=4;
        numbers1.remove(b); // it will remove your element
        System.out.println(numbers1);
        numbers1.remove(new Integer(5));
        System.out.println(numbers1);

        Integer a=new Integer(4);

        //bulk operations

        //addAll

        ArrayList<String> names=new ArrayList<>();

        names.addAll(Arrays.asList("Mesut","Osman","Şeyma"));


        //removeAll

        //retainAll

        //removeIf()
        System.out.println("=================================");

        System.out.println(numbers);

     /*   for (Integer number : numbers) {
            if (number<3)
                numbers.remove(number); // we are not able to use like this because for each iterations the indexes  are changing

        }  */              // each
        System.out.println(numbers);
        numbers.removeIf(k   -> k<3);



        ArrayList<Integer> number3=new ArrayList<>(Arrays.asList(1,2,3,4,5));


        //  ArrayList<String> names4 = {"James", "Jack", "John"};






    }
}