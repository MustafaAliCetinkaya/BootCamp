package lectureTasks.day43_Abstraction.animalTask;

public class Dog extends Animal {

    public Dog(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is a dog. So it is eating dog food");
    }

    @Override
    public void typeOfMoving() {
        System.out.println(getName()+" is walking. It can not fly");
    }
    public void bark(){

        System.out.println(getName()+" is barking");
    }

}
