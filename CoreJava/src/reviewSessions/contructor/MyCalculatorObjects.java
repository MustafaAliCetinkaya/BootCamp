package reviewSessions.contructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyCalculatorObjects {
    public static void main(String[] args) {
        MyCalculator object1 = new MyCalculator(45,13);
        MyCalculator object2 = new MyCalculator(95,546);
        MyCalculator object3 = new MyCalculator(32,12);
        MyCalculator object4 = new MyCalculator(99,99);

        ArrayList<MyCalculator>objects=new ArrayList<>();
        objects.addAll(Arrays.asList(object1,object2,object3,object4));

        for (MyCalculator each : objects) {
            if (each.number1>each.number2)
                System.out.println(each);
        }
        System.out.println("*************************");
        for (MyCalculator each : objects) {
            if (each.number1==each.number2)
                System.out.println(each);
        }



    }
}
