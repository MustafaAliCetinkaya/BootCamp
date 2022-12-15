package lectureTasks.day39_Encapsulation_Inheritence.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    private String restaurantName;
    private String owner;
    private String location;
    private int numberOfStars;

    public ArrayList<Server> serverList = new ArrayList<>();
    public ArrayList<Chef> chefList = new ArrayList<>();

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        if (restaurantName.isEmpty() || restaurantName.isBlank()) {
            System.err.println("Invalid restaurantName: " + restaurantName);
            System.exit(1);
        }
        this.restaurantName = restaurantName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if (owner.isEmpty() || owner.isBlank()) {
            System.err.println("Invalid owner: " + owner);
            System.exit(1);
        }
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (location.isEmpty() || location.isBlank()) {
            System.err.println("Invalid location: " + location);
            System.exit(1);
        }
        this.location = location;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        if (numberOfStars <= 0) {
            System.err.println("Invalid numberOfStars: " + numberOfStars);
            System.exit(1);
        }
        this.numberOfStars = numberOfStars;
    }


    public Restaurant(String restaurantName, String owner, String location, int numberOfStars) {
        setRestaurantName(restaurantName);
        setOwner(owner);
        setLocation(location);
        setNumberOfStars(numberOfStars);
    }


    public void addServer(Server server) {
        if (server.getRestaurantName().equals(restaurantName)){
            serverList.add(server);
        }
    }

    public void addServer(Server[] servers) {
        for (Server each : servers) {
            if (each.getRestaurantName().equals(restaurantName)){
                this.serverList.addAll(Arrays.asList(each));
            }
        }
    }

    public void removeServer(int id) {
        serverList.removeIf(p -> p.getId() == id);
    }

    public void addChef(Chef chef) {
        if (chef.getRestaurantName().equals(restaurantName)){
            chefList.add(chef);
        }
    }

    public void addChef(Chef[] chefs) {
        for (Chef each : chefs) {
            if (each.getRestaurantName().equals(restaurantName)){
                this.chefList.addAll(Arrays.asList(each));
            }
        }
    }

    public void removeChef(int id) {
        chefList.removeIf(p -> p.getId() == id);
    }

    public String toString() {
        return "Restaurant{" +
                "restaurantName=' " + restaurantName + '\'' + "\n" +
                "Owner=' " + owner + '\'' + "\n" +
                ", Location=' " + location + '\'' + "\n" +
                ", numberOfStars= " + numberOfStars + "\n" +
                ", total number of servers= " + serverList.size() + "\n" +
                ", total number of chefs= " + chefList.size() + "\n" +
                '}' + "\n";
    }
}
