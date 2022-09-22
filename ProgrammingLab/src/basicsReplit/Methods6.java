package basicsReplit;

public class Methods6 {
    public static void main(String[] args) {
        double result=addition(985.06,5659.65);
        System.out.println(result+"\n");
        double result1=subtraction(985.06,5659.65);
        System.out.println(result1+"\n");
        double result2=multiplication(985.06,5659.65);
        System.out.println(result2+"\n");
        double result3=division(985.06,5659.65);
        System.out.println(result3+"\n");
    }
    public static double addition(double number1,double number2){
        double addition=number1+number2;
        return addition;

    }

    public static double subtraction(double number1,double number2){
        double subtraction=number1- number2;
        return subtraction;

    }

    public static double multiplication(double number1,double number2){
        double multiplication=number1*number2;
        return multiplication;

    }

    public static double division(double number1,double number2){
        double division=number1/number2;
        return division;

    }
}
