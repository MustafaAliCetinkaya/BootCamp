package reviewSessions.methods.customMethods;

/*  Task 3 :   Write a method that can check if a number is Armstrong number

  Note: if I have a 3-digit number then each of the digits is raised to
  the power of three and added to obtain a number.
  If the number obtained equals the original number then,
  we call that armstrong number.

  Armstrong numbers are     === 153 370 371 407 === for 3 digits*/
public class Task3_ArmstrongNumber {

    public static void main(String[] args) {
        boolean result = isArmstrong(329);
        System.out.println(result);
    }

    public static boolean isArmstrong(int number) {
        boolean isArmstrong = false;
        String temp = "" + number;

        int num1=temp.charAt(0)-48;
        int num2= temp.charAt(1)-48;
        int num3=temp.charAt(2)-48;

        if( (num1*num1*num1)+(num2*num2*num2)+(num3*num3*num3)==number ) {
            isArmstrong = true;
        }
        return isArmstrong;
    }
}

