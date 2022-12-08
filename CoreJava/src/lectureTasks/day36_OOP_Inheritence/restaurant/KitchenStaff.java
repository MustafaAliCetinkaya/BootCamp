package lectureTasks.day36_OOP_Inheritence.restaurant;

public class KitchenStaff extends Personnel {  // KitchenStaff IS A Personnel

    public String jobTitle;
    public int id;
    public double salary;
    public String restaurantName;

    public KitchenStaff(String name, int age, char gender, String jobTitle, int id, double salary, String restaurantName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.restaurantName = restaurantName;
    }

    public void work(){
        System.out.println(jobTitle+" "+name + "is working");
    }

    public String toString() {
        return "Kitchen Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", restaurantName='" + restaurantName + '\'' +
                '}';
    }
}
