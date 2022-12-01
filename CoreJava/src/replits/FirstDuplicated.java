package replits;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,3,4,4,5,6,7,7));

        ArrayList<Integer>temp=new ArrayList<>();

        for (Integer each : list) {

            if (temp.contains(each)){
                System.out.println(each);
                break;
            }
            temp.add(each); //1,2,3,
        }
    }
}

/*7. Write a program that can return the first duplicated element from an arrayList of Integer
        Ex:
            list = [1,2,2,3,4,4,5,6,7,7];
            output:
                2

 */
