package lectureTasks.day44_Interface.animalTask;
/*
class Test{

    public static void main(String[] args) {

        System.out.println(new Test().getClass().getSimpleName());//Only the typed name, shot. We used it in the toString method
        System.out.println(new Test().getClass().getName());//Absolute name, long
    }
}
*/

public abstract class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;

    public final static boolean canBreathe;

    static{
        canBreathe = true;//Since it is final, after declaring we can not change it.
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);

        this.breed = breed;

        if ( !(gender == 'M' || gender =='F')){
            throw new RuntimeException("Invalid gender: "+gender);
        }
        this.gender = gender;

        setAge(age);
        setSize(size);

        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Invalid Name");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public final void drink(){
        System.out.println(name+" is drinking water");
    }

    public  abstract void eat();


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +//Every class wil have its own name
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal
 */