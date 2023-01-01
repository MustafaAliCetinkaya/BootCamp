package lectureTasks.day43_Abstraction.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1=new Dog("Alex","Husky","Long","White",'F',2);
        Dog dog2=new Dog("Charlie","Bulldog","Short","Black",'M',4);


        System.out.println(dog1);
        System.out.println(dog2);

        dog1.bark();
        dog2.eat();
        dog1.drink();
        dog2.typeOfMoving();


        Cat cat1 = new Cat("Love", "Siamese","Long","Brown",'F',3);

        System.out.println(cat1);
        cat1.scratch();
        cat1.eat();
        cat1.typeOfMoving();
        cat1.drink();


        Parrot parrot1 = new Parrot("King","Macaw","Big", "White",'M', 7,"Red and Green");

        System.out.println(parrot1);

        parrot1.sing();
        parrot1.eat();
        parrot1.typeOfMoving();
        parrot1.drink();


    }
}
