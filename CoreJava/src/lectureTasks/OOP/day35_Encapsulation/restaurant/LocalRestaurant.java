package lectureTasks.OOP.day35_Encapsulation.restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {
        Server server1 = new Server("Barney", 34, -40, true);
        Server server2 = new Server("Anna", 98, 20, false);
        Server server3 = new Server("Muhtar", 12, 30, false);
        Server server4 = new Server("Fred", -45, 45, true);

        Server[] servers = {server1, server2, server3};

        Chef chef1 = new Chef("İbrahim", 24, 43, true);
        Chef chef2 = new Chef("Ayşe", 0, 24, false);
        Chef chef3 = new Chef("Jhon", 10, -35, true);
        Chef chef4 = new Chef("Scott", 11, 15, false);

        Chef[] chefs = {chef1, chef2, chef3};
        System.out.println("----------------------------------------------------");
        Restaurant restaurant = new Restaurant("Big Boss", "North Sicily", 5);
        System.out.println(restaurant);
        System.out.println("----------------------------------------------------");

        restaurant.hireServer(server4);
        restaurant.hireChef(chef4);
        System.out.println(restaurant);
        System.out.println("----------------------------------------------------");

        restaurant.hireChef(chefs);
        restaurant.hireServer(servers);
        System.out.println(restaurant);
        System.out.println("----------------------------------------------------");

        for (Server each : restaurant.serverList) {
            if (each.getFullTime())
                each.takeOrder();
            else
                each.cleanTable();
        }

        for (Chef each : restaurant.chefList) {
            if (each.getFullTime())
                each.makeOrder();
            else
                each.washDishes();
        }

        System.out.println("----------------------------------------------------");

        restaurant.terminateChef(24);
        restaurant.terminateServer(12);
        System.out.println(restaurant);

    }
}
/*6.4. Create a class LocalRestaurant that has a main  method with the following:
- Make a Restaurant object
- Create an array of servers with their  information set.
Add those initial servers to the ArrayList of Servers in  the Restaurant object
- Create an array of chefs with their  information set.
Add those initial chefs to the ArrayList of Chefs in the  Restaurant object
- Print your whole restaurants information*/
