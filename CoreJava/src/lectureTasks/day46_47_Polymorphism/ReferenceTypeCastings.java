package lectureTasks.day46_47_Polymorphism;

import lectureTasks.day43_Abstraction.employeeTask.*;
import lectureTasks.day44_45_Interface.animalTask.Animal;
import lectureTasks.day44_45_Interface.animalTask.Cat;
import lectureTasks.day44_45_Interface.animalTask.Dog;
import lectureTasks.day44_45_Interface.shapeTask.*;

public class ReferenceTypeCastings {

    public static void main(String[] args) {


        //   Shape shape = (Shape) new Circle(4); //upcasting

        Shape shape2 = new Circle(5);

        // WebDriver driver = (WebDriver) new ChromeDriver();

        // Dog  dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");;
        //  Dog dog3 = dog2;


        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        Dog dog = (Dog) animal; // downcasting
        dog.bark();

        System.out.println(animal.getName());//We have only one dog object
        System.out.println( dog.getName() );//We have only one dog object

        // animal.bark(); Without casting we can not use dog methods from animal.
        ((Dog) animal).bark();


        Shape shape1 = new Square(5);

        System.out.println(((Square) shape1).getSide());


        System.out.println("---------------------------------------------------");

        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "White");

        //Cat cat = (Cat) animal2; They are same object. We can use this more than one. We can all over and over again.
        //animal2.meow(); We can not call this method from animal. Since it is only unique for object type.

        ((Cat) animal2).meow();

        // ( (Dog) animal2 ).bark();                My object type is Cat. No inheritance so trows ClassCastException. IS A relationship is a must

        System.out.println("---------------------------------------------------");

        Employee employee = new Tester("Ali", 30, 'M', 42, "SDET", 145000.00);

        ((Tester) employee).bugReport();

        //  ( (Tester)employee ).unitTest();        It is a checked error. Tester can not call developer method.

        //  ( (Developer)employee ).unitTest();     My object type is tester. No inheritance so trows ClassCastException. IS A relationship is a must

        //  Driver driver = (Driver) employee;  // line 1       My object type is tester. No inheritance so trows ClassCastException.
        Person person = (Person) employee; // line 2            There is an inheritance. Tester is a person. So it is implicitly cast.
        //    Teacher teacher = (Teacher) employee; // line 3   My object type is tester. No inheritance so trows ClassCastException.

        System.out.println("----------------------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();

        ((Cube) s1).volume();   //s1 object type is circle. No inheritance between cube and circle. So trows ClassCastException.


    }


}