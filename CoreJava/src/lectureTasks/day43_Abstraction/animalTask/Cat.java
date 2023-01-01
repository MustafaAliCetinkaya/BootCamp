package lectureTasks.day43_Abstraction.animalTask;

public class Cat extends Animal {

    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is a cat. So it is eating cat food");
    }

    @Override
    public void typeOfMoving() {
        System.out.println(getName()+" is walking. It can not fly");
    }

    public void scratch(){
        System.out.println(getName()+" is scratching");
    }


}
