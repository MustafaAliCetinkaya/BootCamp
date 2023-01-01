package lectureTasks.day43_Abstraction.animalTask;

import java.util.InputMismatchException;

public class Parrot extends Animal {

    private String parrotWingColor;

    public String getParrotWingColor() {
        return parrotWingColor;
    }

    public void setParrotWingColor(String parrotWingColor) {
        if(parrotWingColor.isEmpty() || parrotWingColor.isBlank()){
            throw new InputMismatchException("Parrot Wing Color can not be empty or blank: "+parrotWingColor);
        }
        this.parrotWingColor = parrotWingColor;
    }

    public Parrot(String name, String breed, String size, String color, char gender, int age, String parrotWingColor) {
        super(name, breed, size, color, gender, age);
        setParrotWingColor(parrotWingColor);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is a parrot. So it is eating bird food");
    }

    @Override
    public void typeOfMoving() {
        System.out.println(getName()+" is flying. Because it is a bird");
    }
    public void sing(){
        System.out.println(getName()+" is singing");
    }

    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", parrot wing color='" + getParrotWingColor() + '\'' +
                '}';
    }
}
