package lectureTasks.day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {
        Dog dog1  = new Dog();

        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        Dog dog2 = new Dog();

        dog2.name = "ACE" ;
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large", "Black");
        System.out.println("--------------------------------");
        System.out.println(Dog.legNumber());
        System.out.println(dog1);//Thanks to "toString" method we can print all dog1 info
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println("------------------------------------");
        dog1.eat();

        dog2.bark();
        System.out.println("------------------------------------");
        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");

        dog5.play();
        System.out.println("-----------------------------------");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};
        System.out.println("All dogs: "+Arrays.toString(dogs));

        ArrayList<Dog> maleDogs =new ArrayList<>();
        ArrayList<Dog> femaleDogs =new ArrayList<>();

        for(Dog each:dogs){
            if (each.gender=='F'){
                femaleDogs.add(each);
            }else{
                maleDogs.add(each);
            }
        }

        System.out.println("Only male dogs: "+maleDogs);
        System.out.println("Number of the male dogs: "+maleDogs.size());
        System.out.println("Only female dogs: "+femaleDogs);
        System.out.println("Number of the female dogs: "+femaleDogs.size());
    }

}
