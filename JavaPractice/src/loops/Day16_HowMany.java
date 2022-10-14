package loops;

import java.util.Scanner;

public class Day16_HowMany  {
    public static void main(String[] args) {
        int positive=0, negative=0, zero=0;

        for (int i = 1; i < 6; i++) {
            System.out.println ("Please enter your "+i+". number:");
            int number=new Scanner (System.in).nextInt ();
            if(number>0){
                positive++;
            }else if (number<0){
                negative++;
            }else {
                zero++;
            }
        } System.out.println ("We have "+positive+" positive and "+negative+" negative number");
    }
}
