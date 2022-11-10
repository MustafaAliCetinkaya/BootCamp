package lectureTasks.day26_Wrapper_Classes;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if( Character.isDigit(each) ){//Select the numbers
                sum +=  Integer.parseInt(""+each);//Convert the char numbers into int
            }

        }

        System.out.println("sum = " + sum);
    }
}
