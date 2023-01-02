package lectureTasks.day43_Abstraction.animalTask;

import java.util.InputMismatchException;

public abstract class Animal {
    private String name, breed, size, color;
    private char gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            throw new InputMismatchException("Name can not be empty or blank: "+name);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(breed.isEmpty() || breed.isBlank()){
            throw new InputMismatchException("Breed can not be empty or blank: "+breed);
        }
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(size.isEmpty() || size.isBlank()){
            throw new InputMismatchException("Size can not be empty or blank: "+size);
        }
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty() || color.isBlank()){
            throw new InputMismatchException("Color can not be empty or blank: "+color);
        }
        this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='F'||gender=='M')){
            throw new InputMismatchException("Gender can not be anything, but F or M: "+gender);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            throw new InputMismatchException("Age can not be less than zero: "+age);
        }
        this.age = age;
    }

    public Animal(String name, String breed, String size, String color, char gender, int age) {
        setName(name);
        setBreed(breed);
        setSize(size);
        setColor(color);
        setGender(gender);
        setAge(age);
    }

    public abstract void eat();//Has to be overridden

    public void drink(){
        System.out.println(getName()+ " is drinking water");
    }

    public abstract void  typeOfMoving();//Has to be overridden

    public void sleep(){
        System.out.println(getName()+ " is sleeping");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +//Every class wil have its own name
                "name='" + getName() + '\'' +//No need to use getters but not given error.
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
