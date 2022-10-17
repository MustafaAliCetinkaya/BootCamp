package week03_09_24_2022;

public class NumberPositiveOrNegative {

    public static void main(String[] args) {
        /*
        Task 4: Create a class which is "NumberPositiveOrNegative"
        and create a variable if the variable is positive print "positive" if not "negative"
         */

        // create a variable
        int a=10;
        //compare variable with zero
        boolean aIsPositive = a > 0;
        //IF condition is tru print te POSITIVE
        if (a > 0){

    //    if (aIsPositive){
            System.out.println("POSITIVE");
        }else {
            //ELSE print NON-POSITIVE
            System.out.println("NON-POSITIVE");
        }


        if (false) {
            System.out.println("if block is working");

            System.out.println("I am outside of the block");
        }
        /*
        if the contion is true
        print 45
        print 50

         */

        if (true){
            System.out.println(45);
            System.out.println(50);
        }
        /*
        if the condition is true
        print 6
         */
        /*
        if (true) {
            System.out.println(6);
        }

         */
        boolean result=true;
        if (result)
            System.out.println(6);


/*
        if (true) {
            System.out.println("if block is working");
}

 */






    }
}
