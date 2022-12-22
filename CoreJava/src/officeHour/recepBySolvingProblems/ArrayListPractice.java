package officeHour.recepBySolvingProblems;

import java.util.*;

public class ArrayListPractice {

    public static void main(String[] args) {

//        one();
//        two();
//        three();
//        four();
//        five();
        six();
    }

    //1.Write a Java program that creates an ArrayList of strings and then adds five strings to the list.
    // Then remove the first and last elements of the list, and then print the remaining elements to the console.

    public static void one() {
        ArrayList<String> fruits = new ArrayList<>();  // arraylist only receives primitive/wrapper class / object data type
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pear");
        fruits.add("grape");
        fruits.add("ananas");

        System.out.println(fruits);  // arraylist can be printed directly

        fruits.remove(0);
        fruits.remove(fruits.size() - 1);

        System.out.println(fruits);
    }

    //2.Write a Java program that creates an ArrayList of 10 integers, and then
    // removes the elements at index positions 2, 4, and 6 from
    //the list. The program should then print the resulting list to the console.

    // Array to arraylist  --> use add all method, arrayList.addAll(arrays)
    // Arraylist to array -->  no need to do that, arraylist works as arrays inside

    public static void two() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        numbers.remove(2);
        System.out.println(numbers);

        numbers.remove(4);
        System.out.println(numbers);

        numbers.remove(6);

        System.out.println(numbers);

    }

//    3.Write a java program that create an arraylist has random numbers, then check those number,
//    if they are even, add again to the arraylist

    public static void three() {
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextInt(100));
        }

        System.out.println(randomNumbers);

        for (int num : randomNumbers) {
            if (num % 2 == 0){
                randomNumbers.add(num);
            }
        }

        System.out.println(randomNumbers);

    }

//    4.Write a Java program that creates an ArrayList of 10 random integers between 1 and 100,
//    and then sorts the list in ascending order.

    public static void four(){
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextInt(100));
        }

        System.out.println(randomNumbers);
        Collections.sort(randomNumbers);
        System.out.println(randomNumbers);
    }

    //5. Write a Java program that creates an ArrayList of strings
    // and adds five strings to the list. The program   should then reverse
    // the order of the elements in the list and print the resulting list to the console.

    public static void five(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("python");
        list.add("selenium");
        list.add("c++");
        list.add("api");

        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }

//    6. Write a Java program that creates an ArrayList of integers and
//    adds 10 random integers to the list. The program should then find
//    the smallest and largest elements in the list and print them to the console.

    public static void six(){
        ArrayList<Integer> nums = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            nums.add(random.nextInt(100));
        }
        System.out.println(nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }



}
