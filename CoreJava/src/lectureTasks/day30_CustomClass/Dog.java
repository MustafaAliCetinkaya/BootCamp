package lectureTasks.day30_CustomClass;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public static int numberOfLegs=4;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender= dogGender;
        size = dogSize;
        color = dogColor;
    }


    public void eat(){
        System.out.println(name+" is eating");
    }

    public void bark(){
        System.out.println(name+" is barking");
    }

    public void play(){
        System.out.println(name+" is playing");
    }

    public static boolean legNumber(){
        System.out.println("Every dog has 4 legs");
        return true;
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Dog(){//This method is actually automatically created. Normally it is invisible.
            System.out.println("New item is created as an object. "+"This sentence will be printed first when we create a new object.");
    }//This has a priority. Main Method start to build the codes from here.
}

/*
Attributes:
    name, age, gender, breed, size, color

Actions:
    eat(), play(), bark() ....

 */
