package lectureTasks.day39_Encapsulation_Inheritence.restaurant;

public class Chef extends KitchenStaff {
    public Chef(String name, int age, char gender, String jobTitle, int id, double salary, String restaurantName) {
        super(name, age, gender, jobTitle, id, salary, restaurantName);
    }

    public void makeOrder(){
        System.out.println(getName()+" is a "+ getJobTitle()+ " and making an order.");
    }

    public void washDishes(){
        System.out.println(getName()+" is a chef "+ getJobTitle()+ " and washing the dishes.");
    }
}
