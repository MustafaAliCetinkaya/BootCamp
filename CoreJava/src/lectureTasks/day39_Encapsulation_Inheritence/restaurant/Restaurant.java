package lectureTasks.day39_Encapsulation_Inheritence.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    private String owner;
    private String location;
    private int numberOfStars;

    public ArrayList<Server> serverList=new ArrayList<>();
    public ArrayList<Chef> chefList=new ArrayList<>();

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if(owner.isEmpty() || owner.isBlank()){
            System.err.println("Invalid owner: "+owner);
            System.exit(1);
        }
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if(location.isEmpty() || location.isBlank()){
            System.err.println("Invalid location: "+location);
            System.exit(1);
        }
        this.location = location;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        if(numberOfStars <= 0){
            System.err.println("Invalid numberOfStars: "+numberOfStars);
            System.exit(1);
        }
        this.numberOfStars = numberOfStars;
    }

    public Restaurant(String owner, String location, int numberOfStars) {
        setOwner(owner);
        setLocation(location);
        setNumberOfStars(numberOfStars);
    }

    public void addServer(Server server){
        serverList.add( server );
    }

    public void addServer(Server[] servers){
        this.serverList.addAll(Arrays.asList(servers) );
    }

    public void removeServer(int id){
        serverList.removeIf( p -> p.getId() == id);
    }

    public void addChef(Chef chef){
        chefList.add(chef);
    }

    public void addChef(Chef[] chefs){
        this.chefList.addAll( Arrays.asList(chefs) );
    }

    public void removeChef(int id){
        chefList.removeIf( p -> p.getId() == id);
    }

    public String toString() {
        return "Restaurant{" +
                "Owner=' " + owner + '\'' +"\n"+
                ", Location=' " + location + '\'' +"\n"+
                ", numberOfStars= " + numberOfStars +"\n"+
                ", total number of servers= " + serverList.size() +"\n"+
                ", total number of chefs= " + chefList.size() +"\n"+
                '}'+"\n";
    }
}
