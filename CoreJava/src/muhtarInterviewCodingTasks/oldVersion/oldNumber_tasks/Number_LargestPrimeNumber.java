package number_tasks;

public class Number_LargestPrimeNumber {

    /*
    Write a program that accepts a number and returns the largest two-digit prime number that occurs the most
    within the given number. If there are two numbers with the same count return the larger number.

    Assume you are given a function called "isPrime" that takes any number and returns a true or false.

    Prime numbers up to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.

        For example, 3193152311479 would return 31 and 373137313 would return 73.
     */

    public static void main(String[] args) {

        long num = 3193152311479l;
        long num1 = 373137313l;

        System.out.println("largestPrimeNumber(num1) = " + largestPrimeNumber(num));

    }

    public static long largestPrimeNumber(long number) {
        long reminder;
        long largest = 0;
        while (number > 0) {
            reminder = number % 100;
            if (isPrime(reminder)) {
                if (reminder > largest) {
                    largest = reminder;
                }
            }
            number = number / 10;
        }

        return largest;
    }


    public static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }

        for (long i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
