package lectureTasks.day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {
    public static void main(String[] args) {
        ArrayList<Carpet>cerpets=new ArrayList<>();

        Carpet carpet1=new Carpet(1,2,12,false);
        Carpet carpet2=new Carpet(2,3,20,true);
        Carpet carpet3=new Carpet(3,4,30,false);
        Carpet carpet4=new Carpet(2,3,25,false);


        cerpets.addAll(Arrays.asList(carpet1,carpet2,carpet3,carpet4));
        System.out.println(cerpets);
        System.out.println("-----------------------------------------------");
        for (Carpet each : cerpets) {
            System.out.println("Is it a Persian carpet? "+each.isPersian+" : "+each.calcCost());
        }

    }
}
