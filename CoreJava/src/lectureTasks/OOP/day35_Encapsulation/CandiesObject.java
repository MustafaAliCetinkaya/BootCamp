package lectureTasks.OOP.day35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandiesObject {
    public static void main(String[] args) {
        Candies candy1=new Candies("Skittles",2,12,true);
        Candies candy2=new Candies("Starburst",3,5,false);
        Candies candy3=new Candies("Hot Tamales",0,-12,true);
        Candies candy4=new Candies("Sour Patch Kids",5,1.5,false);
        Candies candy5=new Candies("Snickers",-4,20,true);

        ArrayList<Candies>candies=new ArrayList<>();
        candies.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));
        System.out.println("--------------------------------");
        for (Candies each : candies) {
            System.out.println(each.getBrand()+" : $"+each.getPrice());
        }
        System.out.println("--------------------------------");
        for (Candies each : candies) {
            if (each.getQuantity()<=0)
            System.out.println(each);
        }
        System.out.println("--------------------------------");
        for (Candies each : candies) {
            if (each.getPrice()<=0)
            System.out.println(each);
        }
    }
}