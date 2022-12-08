package lectureTasks.day36_OOP_Inheritence.restaurant;

public class Chef extends KitchenStaff {
    public Chef(String name, int age, char gender, String jobTitle, int id, double salary, String restaurantName) {
        super(name, age, gender, jobTitle, id, salary, restaurantName);
    }

    public void makeOrder(){
        System.out.println(name+" is a chef and making an order.");
    }

    public void washDishes(){
        System.out.println(name+" is a chef and washing the dishes.");
    }
}
