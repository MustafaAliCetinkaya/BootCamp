package week03_09_24_2022;

public class IntroPostIncrementDecrement {
/*
Task 1 : Create a class which is "IntroPostIncrementDecrement" define a variable,

          int a=5;
          print a;
          print the a++;
          print the a--;
 */
    public static void main(String[] args) {

        int a=5;
        System.out.println(a);
        System.out.println("a = " + a); // variable name and value at the same time
        System.out.println("===increment start====");
        System.out.println(a++);
        System.out.println(a); //my action is printing first do your action
        System.out.println("===increment end====");
        System.out.println(a); // a will be 6
        System.out.println("===decrement start====");
        System.out.println(a--); //do your action printing

        System.out.println(a);

        System.out.println("===decrement end====");

        int b=10;

        System.out.println(b--); // first do action (print) we will print 10 and teh second change vslue 9
        System.out.println(b--); // I will print 9 and decrement it will be 8 for next statement
        System.out.println(b);
        b=b-1; //b-- //b-=1;


    }







}
