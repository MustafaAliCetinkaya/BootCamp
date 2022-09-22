package oblectOrientedProgramming.oblectOrientedProgramming4;

public class Main {
    public static void main(String[] args) {
        Calculator object=new Calculator();

        int additionResult= object.addition(9856,3254);
        int subtractionResult= object.subtraction(658,213);
        int multiplication= object.multiplication(9870,3025);
        int division= object.division(9200,12);

        System.out.println("division = " + division);
        System.out.println("multiplication = " + multiplication);
        System.out.println("subtractionResult = " + subtractionResult);
        System.out.println("multiplication = " + multiplication);
    }
}
