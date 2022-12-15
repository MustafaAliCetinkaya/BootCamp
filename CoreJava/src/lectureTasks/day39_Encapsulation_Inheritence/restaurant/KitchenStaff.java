package lectureTasks.day39_Encapsulation_Inheritence.restaurant;

public class KitchenStaff extends Personnel {  // KitchenStaff IS A Personnel

    private String jobTitle;
    private int id;
    private double salary;
    private String restaurantName;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("Invalid jobTitle: "+jobTitle);
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id <= 0){
            System.err.println("Invalid id: "+id);
            System.exit(1);
        }
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary <= 0){
            System.err.println("Invalid salary: "+salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        if(restaurantName.isEmpty() || restaurantName.isBlank()){
            System.err.println("Invalid restaurantName: "+restaurantName);
            System.exit(1);
        }
        this.restaurantName = restaurantName;
    }

    public KitchenStaff(String name, int age, char gender, String jobTitle, int id, double salary, String restaurantName) {
        super(name, age, gender);
        setJobTitle(jobTitle);
        setId(id);
        setSalary(salary);
        setRestaurantName(restaurantName);
    }

    public void work(){
        System.out.println(jobTitle+" "+getName() + "is working");
    }

    public String toString() {
        return "Kitchen Staff{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + getId() +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", restaurantName='" + restaurantName + '\'' +
                '}';
    }
}
