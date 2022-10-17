package week02_09_17_2022;

public class VariablesIntro {


    public static void main(String[] args) {
        /*
        Variable Types:
        1-Primitive
         - Numerical primitives:
         double>float>long>int>short>byte
         - boolean
         - char define char 'A'


        2-Non-Primitive(in future we will go on deep)
        String define String in "Adam"


        - how to declare variables :

       * data type variable name=data;

       Variable Naming Rules:

       1. MUST be unique (inside the same block-method)
       2. Lower camelCase
       3. We CAN NOT start with numbers
       4. We CAN NOT use Java Reserved words
       5. For special character _ (under score) $ (dolar sign)
       6. make it readable and unterstandable



         */

        //data type variable name=data;
        //we need to use byte ()
        int age = 34;
        //  byte myByte=129; // we can not but this value in a byte from -128 to 127

        short myShort = 12;
        long myLong = 12232321111l; //(if you want to make integer to long we need to put L or l)
        //default data type for compiler is int


        double myDouble = 25.5;
        double myDouble1 = 25; //what is my output

        float myFloat = (float) 12.5; //default data type for compiler is double
        /*
        Explicit casting
        Done by developer
        Manual

         */

        long l = 20; //l=20
        int i = (int) l; // we have to say to compiler make l is int
        //double data type     long data dype
        double d = l;  //implicit casting done by compiler


        //implicit casting vs explicit casting


        //implicit casting is assigning small data type to bigger one

        int a = 20;
        long b = 20;
        //long data type    int data type
        b = a; //assigning from right to left  //implicit casting


        //explicit casting is assigning bigger data type to smaller one
//int data type   long data type
        a       =    (int)   b;  //explicit casting



        // addition
        /*
        number + number = number

        int+ int =int
        double+int=double

        int+short=int

        6+6=12


         */
        //Concatenation


        /*
        String+ anything => String
        123+Adam=123Adam


         */

        /*

Compiler works from top to bottom and left to right
        12+23+"Adam"=?

        35+Adam
        35Adam

      "12+23+Adam"
         */




    }

}
