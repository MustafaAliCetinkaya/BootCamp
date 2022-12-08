package lectureTasks.day36_OOP_Inheritence.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public String owner;
    public String location;
    public int numberOfStars;

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public ArrayList<Server> serverList=new ArrayList<>();
    public ArrayList<Chef> chefList=new ArrayList<>();

    public void addServer(Server server){
        serverList.add( server );
    }

    public void addServer(Server[] servers){
        this.serverList.addAll(Arrays.asList(servers) );
    }

    public void removeServer(int id){
        serverList.removeIf( p -> p.id == id);
    }

    public void addChef(Chef chef){
        chefList.add(chef);
    }

    public void addChef(Chef[] chefs){
        this.chefList.addAll( Arrays.asList(chefs) );
    }

    public void removeChef(int id){
        chefList.removeIf( p -> p.id == id);
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
