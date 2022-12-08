package lectureTasks.day36_OOP_Inheritence.restaurant;

public class Server extends KitchenStaff {
    public Server(String name, int age, char gender, String jobTitle, int id, double salary, String restaurantName) {
        super(name, age, gender, jobTitle, id, salary, restaurantName);
    }

    public void takeOrder() {
        System.out.println(name + " is a server and taking an order.");
    }

    public void cleanTable() {
        System.out.println(name + " is a server and taking cleaning the table.");
    }

}
