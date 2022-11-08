package basicsReplit;

public class Methods3 {
    public static void main(String[] args) {
        double number1=59;//Tüm işlemlerde bu sayıları kullanacak
        double number2=97;

        addition( number1, number2);//Aşağıdaki metotları buradan çağırmazsak çalışmaz.
        subtraction( number1, number2);
        multiplication( number1, number2);
        division( number1, number2);
    }

    public static void addition(double number1,double number2){
        double addition=number1+number2;
        System.out.println("Result: "+addition+"\n");

    }

    public static void subtraction(double number1,double number2){
        double subtraction=number1- number2;
        System.out.println("Result: "+subtraction+"\n");

    }

    public static void multiplication(double number1,double number2){
        double multiplication=number1*number2;
        System.out.println("Result: "+multiplication+"\n");

    }

    public static void division(double number1,double number2){
        double division=number1/number2;
        System.out.println("Result: "+division+"\n");

    }
}
