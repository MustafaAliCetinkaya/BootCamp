package lectureTasks.day46_47_Polymorphism;

import lectureTasks.day43_Abstraction.employeeTask.*;
import lectureTasks.day44_45_Interface.animalTask.Animal;
import lectureTasks.day44_45_Interface.animalTask.Cat;
import lectureTasks.day44_45_Interface.animalTask.Dog;
import lectureTasks.day44_45_Interface.animalTask.Playable;
import lectureTasks.day44_45_Interface.shapeTask.*;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        Integer n1 = 2;

        Double n2 = 5.5;

        Boolean r1 = true;

        Object[] array = {str, n1, n2, r1, new Circle(4) , new Square(7)};

        System.out.println(array[4]);
        System.out.println(array[5]);

        /*

            WebDriver driver;


            driver = new ChromeDriver();

            driver = new FireFoxDriver();

         */

        System.out.println("-------------------------------------------");

        Employee tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Employee developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Employee teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Employee driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

        ArrayList<Person> cydeoEmployees = new ArrayList();

        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);

        System.out.println(cydeoEmployees);
        System.out.println(teacher);


        System.out.println("-------------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);
        employee.work();
        System.out.println("employee.getId() = " + employee.getId());
        // employee.bugReport();

        /*
            WebDriver driver1 = new ChromeDriver();
            WebDriver driver2 = new ChromeDriver();


            driver1.get(amazon)
            driver2.get(google)


            Animal animal = new Dog();
            animal.drink()

            Animal animal = new Cat()
            animal.drink()

            Animal animal = new Tiger()
            animal.drink()

         */
        System.out.println("-------------------------------------------");

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        animal.drink();
        animal.eat();
       // animal.play();
      //  animal.bark();
        System.out.println("-------------------------------------------");

        Playable animal2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        System.out.println(animal2.isFriendly);
        animal2.play();
      //  animal2.drink();
      //  animal2.eat();


        Animal animal3 = new Cat("Max", "Husky", 'M', 3, "Small", "White");
        System.out.println("animal3 = " + animal3);

        System.out.println("-------------------------------------------");

        Shape shape = new Circle(5);
        System.out.println("shape = " + shape);
        System.out.println("shape.area() = " + shape.area());
        System.out.println("shape.perimeter() = " + shape.perimeter());

        //  System.out.println( shape.getRadius());
       // System.out.println( shape.PI);
        System.out.println("-------------------------------------------");

        boolean isSquare = shape instanceof Square;
        boolean isRectangle = shape instanceof Rectangle;
        boolean isTriangle = shape instanceof Triangle;
        boolean isCircle = shape instanceof Circle;

        System.out.println("isSquare = " + isSquare);
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isRectangle = " + isRectangle);
        System.out.println("isCircle = " + isCircle);



        /*
        WebDriver driver:

            if(driver instanceof Chrome){
                Chrome browser will open
            }else if(driver instanceof firefox){
                Firefox browser will open
            }

            ...

         */


    }


}