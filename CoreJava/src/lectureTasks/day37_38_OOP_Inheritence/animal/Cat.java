package lectureTasks.day37_38_OOP_Inheritence.animal;

public class Cat extends Animal{

    public Cat(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats cat food");
    }

}
