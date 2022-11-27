package replits;

import java.util.ArrayList;
import java.util.Arrays;

public class removeInRange2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16));
        System.out.println("Original list: "+list);
        System.out.println(list.size());
        ArrayList<Integer>list1=new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
         /*   if (i>=0 && i<5){
                list1.add(list.get(i));
            }*/

            if(i>=5&&i<13){
                if(list.get(i)!=0){
                    list1.add(list.get(i));
                }
            }else {
                list1.add(list.get(i));
            }

            /*if(i>=13&&i<list.size()){
                list1.add(list.get(i));
            }*/

        }


        System.out.println(list1);
        System.out.println(list1.size());
    }
}
