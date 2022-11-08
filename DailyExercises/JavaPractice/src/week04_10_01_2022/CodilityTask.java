package week04_10_01_2022;

public class CodilityTask {

    /*
     Task 1:
  Write a function:
			that, given a positive integer N  However, any number
			divisible by 2, 3 or 5 should be replaced by the word

				    			Codility -- 2
				    			Test     -- 3
				    			Coders   -- 5

			- If a number is divisible by more than one of the numbers:2,3 or 5, it should be replaced by a concatenation of the respective words Codility,
			 Test and Coders in this given order.

				    			EXPECTED

				    	numbers divisible by both 2 and 3 should be replacée by CodilityTest
				    	INPUT : 6    OUTPUT :  CodilityTest

				    	numbers divisible by allthree numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
				    	INPUT : 30    OUTPUT :  CodilityTestCoders
     */
    public static void main(String[] args) {

        // we will get one number from the user(create a variable ) positive
        int number = 30;

        // we will create a varible in order to put our result in it
        String result = "";

        //we will check the number is positive or negative
        if (number > 0) {  // I can go on with other steps
            // if the number is positve we will check the number divisible by 2 We put the Codility inside variable
            if (number % 2 == 0) {
                result = "Codility";
            }
            // if the number is positve we will check the number divisible by 3 We append the Test inside variable
            if (number % 3 == 0) {
             //   result = result + "Test";
                result+="Test";
            }
            // if the number is positve we will check the number divisible by 5 We append the Coders inside variable

            if (number%5==0){
               // result=result+"Coders";
                result+="Coders";
            }


        } else {
            result="invalid or the number is not divisible by 2 or 3 or 5";
        }

        System.out.println("result = "+ result);


    }


}
