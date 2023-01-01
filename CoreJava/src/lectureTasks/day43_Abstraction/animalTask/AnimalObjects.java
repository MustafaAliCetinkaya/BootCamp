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
        Animal parrot2 = new Parrot("Queen","Femaw","Small", "Black",'F', 5,"White and Green");

        System.out.println(parrot1);
        System.out.println(parrot2);

        parrot1.sing();
        parrot1.eat();
        parrot1.typeOfMoving();
        parrot1.drink();
        ((Parrot) parrot2).sing(); //It is created differently. Animal is cast as parrot.
        /*parrot2.sing(); This throws checked error!
        We create it in a different way. So it can not sing. It has only animal feature.*/
        parrot2.eat();
        parrot2.typeOfMoving();
        parrot2.drink();

    }
}
