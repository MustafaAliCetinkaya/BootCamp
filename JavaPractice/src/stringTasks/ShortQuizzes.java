package stringTasks;

public class ShortQuizzes{
    public static void main(String[] args) {
        int number =10;
        number++;
        System.out.println (number++);
        System.out.println (number);
        number=--number + number++ + number-- + number++;
        System.out.println ("number = " + number);

/*        System.out.println (number++ +",");
        System.out.println (number==0);
        System.out.println (","+ --number);*/

/*        number++;
        System.out.println ("number = " + number);*/
        
 /*       int number1=number++;
        System.out.println ("number1 = " +number1);
        
        int number2=++number;
        System.out.println ("number2 = " + number2);*/

/*        if (++number>10){
            System.out.println ("Hello CyberTech "+number);
        }else if(number==9){
            System.out.println ("Hello World "+number);
        }

        if (number++==13){
            System.out.println ("Hello World "+number);
        }else{
            System.out.println ("Hello Universe "+number);
        }*/

      /*  Review Questions

        1- What do you know about Scanner class?
        2- What is the difference between next() and nextLine() method in Scanner class?

==============================================
        Warm Up Task :

        Create a class which is "Calculator" and add functions which are add, substract, divide and multiply.
        (Use switch case)

================================================

        Topics:

        - String :

        •An object that represents sequences of characters
		•String is immutable, Once the object is created it can’t be Modified.
		•There are two ways to create String object:

        - By String literal (String pool)
        - By new keyword




                * Presented in "java.lang" package

     * Any class in "java.lang" package can be imported implicitly

        String Methods:

   * charAt(index) : returns the character at the given index, returns char

   * length()      : returns the total number of characters. returns int

   * toLowerCase() : make letters lower case

   * toUpperCase() : make letters upper case

   * trim()        : removes whitespace from both ends of a string

   * indexOf()     : returns the position of the first found occurrence of specified characters in a string

   * lastIndexOf() : returns the position of the last found occurrence of specified characters in a string

   * replace()     : searches a string for a specified value, and returns a new string where the specified values are replaced

   * replaceFirst(): replaces the first occurrence of a substring that matches the given regular expression with the given replacement

                * substring()   : returns a new string which is the substring of a specified string

   * repeat()      : repeats the string for given number of times. returns string

   * isEmpty()     : checks whether a string is empty or not (check the length is 0)

   * isBlank()     : checks whether a string is blank or not (length is not important)

   * equals()      : compares two strings. Returns true if the strings are equal, and false if not (check the value)

                * equalsIgnoreCase() : compares two strings, ignoring case considerations

                * startsWith()  : check the string starts with sequance of char or not

                * endsWith()    : check the string ends with sequance of char or not

                * contains()    : check the string contains in sequance of char or not

                ===================================================

        - Loops

        1. For loop
        2. While loop
        3. Do while

        1- For Loop :

        for ( init ; test ; increment/decrement ) {
            body

        }


        Tasks:

  **** String :

        Task 1: Given a string, print the string made of its first two chars, so the String "Hello" yields “HE".

        Task 2: Create a logic print a new string made of 3 copies of the last 2 chars of the original string.

                Hint: The string length will be at least 2.

        Task 3: Given a string, return a version without the first and last char, so "Hello" yields "ell".
                Hint: The string length will be at least 2.

        Task 4: Given a string, if the string begins with "red" or "blue" print that color string, otherwise print the empty string.

     *                 input :"redxx" → "red"
                *                 input :"xxred" → ""
                *                 input :"blueTimes" → "blue"

        Task 5: Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
        Hint: The string length will be at least 2.

                *                 input :"Hello" -> "lloHe"
                *                 input :"java" → "vaja"
                *                 input :"Hi" → "Hi"


                **** Loop :

        Create a class LoopIntro

        - print numbers 0 to 100

                - print even numbers 0 to 98

                - print odd numbers 1 to 99


        Task 6: Given a string password. Encrypt with "x" a given password and print.

                Hint: do with for loop

                * password: cydeo
                * encrypt with char :x
                * output:cxyxdxexox*/
    }
}
