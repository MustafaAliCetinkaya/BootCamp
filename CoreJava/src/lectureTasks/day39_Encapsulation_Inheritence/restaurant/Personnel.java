package lectureTasks.day39_Encapsulation_Inheritence.restaurant;

public class Personnel {
    private  String name;
    private  int age;
    private  char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name: "+name);
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 16){
            System.err.println("Invalid age: "+age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='F'||gender=='M')){
            System.err.println("Invalid gender: "+gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public Personnel(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
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
