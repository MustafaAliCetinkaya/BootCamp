package myInterviewPreperationQuestions.practiceIt;

import java.lang.reflect.Array;

public class FirstAndSecondBiggestNumberInArray {
    public static void main(String[] args) {
        int salaries[]={12000,14230,15023,10907,11900};

        int firstMaxNumber=Integer.MIN_VALUE;
        int secondMaxNumber=Integer.MIN_VALUE;

        for (int eachSalary : salaries) {

            if( eachSalary>firstMaxNumber ){
                secondMaxNumber=firstMaxNumber;
                firstMaxNumber=eachSalary;
            }else if(eachSalary<firstMaxNumber){
                secondMaxNumber=eachSalary;
            }
        }

        System.out.println("firstMaxNumber = " + firstMaxNumber);
        System.out.println("secondMaxNumber = " + secondMaxNumber);

/*        int max=salaries[0];      ==> Regular max number finding method
        //int max=Integer.MIN_VALUE; This is more common

        for (int i = 0; i < salaries.length; i++) {
            if(salaries[i]>max){
                max=salaries[i];
            }
        }

        System.out.println("Max salary is: "+max);*/
    }
}
