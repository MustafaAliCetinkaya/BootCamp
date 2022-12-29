package lectureTasks.day42_Exceptions;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws ArithmeticException {

        System.out.println("Test started");

        System.out.println(8/0);//Throws can not handle unchecked exceptions. We have to ue try catch block here

        System.out.println("Test completed");


    }

}
