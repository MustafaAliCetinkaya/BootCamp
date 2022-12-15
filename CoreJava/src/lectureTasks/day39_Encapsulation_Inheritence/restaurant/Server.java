package lectureTasks.day39_Encapsulation_Inheritence.restaurant;

public class Server extends KitchenStaff {
    public Server(String name, int age, char gender, String jobTitle, int id, double salary, String restaurantName) {
        super(name, age, gender, jobTitle, id, salary, restaurantName);
    }

    public void takeOrder() {
        System.out.println(getName() + " is a server "+getJobTitle()+ " and taking an order.");
    }

    public void cleanTable() {
        System.out.println(getName() + " is a server "+getJobTitle()+ " and taking cleaning the table.");
    }
}
