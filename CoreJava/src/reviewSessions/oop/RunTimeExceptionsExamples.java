package reviewSessions.oop;

import lectureTasks.day39_Encapsulation_Inheritence.scrumTask.Employee;

public class RunTimeExceptionsExamples {
    static Employee employee; //we need to make it static in oreder to use inside main method which is static

    public static void main(String[] args) {
//ArithmeticException
        /*
       For Windows ctrl   +alt + T
       For mac     command+alt + T
         */

        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println(60 / i);  //java.lang.ArithmeticException
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()); //Simple Message
            e.printStackTrace(); //Detailed message

        }

//NullPointerException
//You can not reach instance variables or methods from the static block or method
        //java.lang.NullPointerException if you want to reach object fields or methods you have  to initialize it. I
        // mean creating object
        try {
            System.out.println(employee.getSalary());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //NumberFormatException
        String str="Adam 123.";
        String s=str.substring(str.indexOf(" ")+1);
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {

            System.out.println(e.getMessage());
        }

        //ArrayIndexOutOfBoundsException

        int[] array={1,2,3};

        try {
            System.out.println(array[3]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

        //StringIndexOutOfBoundsException
        String name="Adam";

        try {
            //TODO I will find the solution later lets skip it now

            System.out.println(name.charAt(4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //java.lang.StringIndexOutOfBoundsException: String index out of range: 4


        System.out.println("YOU FINISHED YOUR TESTS");

    }
}
