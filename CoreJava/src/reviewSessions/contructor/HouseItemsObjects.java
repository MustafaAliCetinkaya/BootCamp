package reviewSessions.contructor;

import java.util.ArrayList;
import java.util.Arrays;

public class HouseItemsObjects {
    public static void main(String[] args) {
        HouseItems item1=new HouseItems("spoon");
        HouseItems item2=new HouseItems("armchair","blue");
        HouseItems item3=new HouseItems("tv","black",2);
        HouseItems item4=new HouseItems("table","white");
        HouseItems item5=new HouseItems("door","white",8);

        ArrayList<HouseItems>houseItems=new ArrayList<>();
        houseItems.addAll(Arrays.asList(item1,item2,item3,item4,item5));

        for (HouseItems each : houseItems) {
            if (each.amount!=0)
                System.out.println(each);
        }

        System.out.println("--------------------------");
        System.out.println(houseItems);
    }

}
