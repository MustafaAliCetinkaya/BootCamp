package reviewSessions.methods.methodOverloadingWrapper;

import java.util.Arrays;

/*Summary
    these are overloading : same method name and;
    different types of parameter
    different sequence of parameters
    different number of parameters*/

public class Intro {
    public static void main(String[] args) {
        System.out.println("Test - 1");
    }

    public static void main(Arrays[] args2) {
        System.out.println("Test - 2");
    }

  /*  this is not overloading
    public static void sum( int i, double d){}
    public static double sum( int i, double d){}*/
}
