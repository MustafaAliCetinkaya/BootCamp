package lectureTasks.day33_Static;

import java.util.Arrays;

public class Task2_CircleTest {
    public static void main(String[] args) {
        Task2_Circle circle1=new Task2_Circle(19.2);
        Task2_Circle circle2=new Task2_Circle(8.8);
        Task2_Circle circle3=new Task2_Circle(134.56);

        Task2_Circle circles[]={circle1,circle2,circle3};

        for (Task2_Circle each : circles) {
            if(each.diameter<50) {
                System.out.println("Radius of the cirle is: "+each.radius+" - Area: "+each.calcArea());
                System.out.println("Diameter of the cirle is: "+each.diameter+" - Perimeter: "+each.calcPerimeter());
            }
        }
        System.out.println("-----------------------------------------------");

        System.out.println(Arrays.toString(circles));
    }


}
