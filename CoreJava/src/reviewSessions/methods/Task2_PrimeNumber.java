package reviewSessions.methods;

public class Task2_PrimeNumber {
    public static void main(String[] args) {
        /*
        Task 2 :   Write a method that can check if a number is prime or not

				Note : Prime numbers are special numbers, greater than 1, that have exactly two factors, themselves and 1

				7

			is divisible by	 2
			""	             3
			""	             4
			""	             5
	        ""	             6

         */

        boolean result = isPrime(2); //true
        System.out.println(result);

    }

    public static boolean isPrime(int number) {
        boolean isPrimeNumber = true;

        if (number<2){
            return false;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }
        return isPrimeNumber;
    }
}
