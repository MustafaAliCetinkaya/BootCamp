package utilities;

public class MathUtility {
    public static void main(String[] args) {

    }
    //2.1 Create a method that can return the sum of two integers
    public static int sumOfTwoIntegers (int num1, int num2){
        return num1+num2;
    }

    //2.2 Create a method that can return the sum of two decimal numbers
    public static double sumOfTwoDoubles (double num1, double num2) {
        return num1+num2;
    }

    //2.3 Create a method that can return the subtraction of two integers
    public static int subtractionOfTwoIntegers (int num1, int num2){
        return num1-num2;
    }
    //2.4 Create a method that can return the subtraction of two decimals
    public static double subtractionOfTwoDoubles (double num1, double num2){
        return num1-num2;
    }
    //2.5 Create a method that can return the multiplication of two integers
    public static int multiplicationOfTwoIntegers (int num1, int num2){
        return num1*num2;
    }

    //2.6 Create a method that can return the multiplication of two decimals
    public static double multiplicationOfTwoDoubles (double num1, double num2){
        return num1*num2;
    }
    //2.7 Create a method that passes two double parameters and return the division result
    public static double divisionOfTwoDoubles (double num1, double num2){
        return num1/num2;
    }

    //2.8 Create a method that can check if an integer is even number
    public static boolean isEven (int num){
        return (num%2==0) ? true : false;
    }

    //2.9 Create a method that can check if an integer is odd number
    public static boolean isOdd (int num){
        return (num%2!=0) ? true : false;
    }

    //2.10 Create a method that can return the maximum number between two integers
    public static int maxOfTwoInteger (int num1, int num2) {
        return (num1>num2)? num1 : num2;
    }

    //2.11 Create a method that can return the maximum number between two decimal numbers
    public static double maxOfTwoDoubles (double num1, double num2) {
        return (num1>num2)? num1 : num2;
    }

    //2.12 Create a method that can return the minimum number between two integers
    public static int minOfTwoInteger (int num1, int num2) {
        return (num1<num2)? num1 : num2;
    }

    //2.13 Create a method that can return the minimum number between two decimal numbers
    public static double minOfTwoDoubles (double num1, double num2) {
        return (num1<num2)? num1 : num2;
    }
    //2.14 Create a method that can return the square of an integer
    public static int squareOfInteger (int num){
        return num*num;
    }

    //2.15 Create a method that can return the square of a double
    public static double squareOfDouble (double num){
        return num*num;
    }

    //2.16 Create a method that can return the cube of an integer
    public static int cubeOfInteger (int num){
        return num*num*num;
    }

    //2.17 Create a method that can return the cube of a double
    public static double cubeOfDouble (double num){
        return num*num*num;
    }
}


