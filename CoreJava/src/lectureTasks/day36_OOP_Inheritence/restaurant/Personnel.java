package lectureTasks.day36_OOP_Inheritence.restaurant;

public class Personnel {
    public String name;
    public int age;
    public char gender;

    public Personnel(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(name + " is eating "+food );
    }

    public void drink(String drink){
        System.out.println(name + " is drinking "+drink);
    }

    public String toString() {
        return "Personnel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
