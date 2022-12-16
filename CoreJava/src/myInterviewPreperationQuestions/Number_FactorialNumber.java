package myInterviewPreperationQuestions;

public class Number_FactorialNumber {

    /*
    Write a return method that returns the factorial number of any given number

        Ex:
                Input: 5
                outPut: 120

                because 5 * 4 * 3 * 2 * 1 = 120
     */

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialNumber(15));
    }

    public static int factorial(int n){
        if (n == 0) {
        return 1;
    } else {
        return n * factorial(n-1);
    }

    }

    public static int factorialNumber(int n) {

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;

    }

}
