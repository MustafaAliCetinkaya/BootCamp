package reviewSessions.contructor;
/*Task-2
version 1: without instance variables and no setInfo method
Create a "MyCalculator" class that has instance methods which can do simple math operations
on two numbers. The methods are: plus, minus, multiply and divide.All the methods get two
ints then the method does the required math operation and returns the result as an int.

In version one we just have instance methods with parameters (actions) no attributes of the class

version 2: with instance variables and with a setInfo method (or constructor) that sets value
 to integers which will be used in instance methods of the class we create

for example:
MyCalculatorV2 myCal2 = new MyCalculatorV2();
myCal2.setInfo(1,1);
myCal.plus();
returns:2
myCal.minus();
returns:0*/
public class MyCalculator {
public int number1;
public int number2;

    public MyCalculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int minus(){
        int result=number1-number2;
        return Math.abs(result);
    }
    public int plus(){
        int result=number1+number2;
        return result;
    }
    public int multiply(){
        int result=number1*number2;
        return result;
    }
    public double divide(){
        int result=number1/number2;
        return result;
    }

    public String toString() {
        return "MyCalculator{" +"\n"+
                "number1= " + number1 +"\n"+
                ", number2= " + number2 +"\n"+
                "Plus result= " + plus() +"\n"+
                ", Minus result= " + minus() +"\n"+
                "Multiply result= " + multiply() +"\n"+
                ", Divide result= " + divide() +"\n"+
                '}';
    }
}
