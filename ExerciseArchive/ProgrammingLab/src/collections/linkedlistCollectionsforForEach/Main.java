package collections.linkedlistCollectionsforForEach;
//Linked listler arraylerden farklı çünkü her veri iki eşit parçaya ayrılır ve datanın yanında "refereans" vardır.

import java.util.ArrayList;

//ArrayList içindeki elemanlar döngü sayesinde teker teker de bastırılabilir.
public class Main {
    public static void main(String[] args) {
        ArrayList data=new ArrayList();
        data.add("Ali");
        data.add("Selami");
        data.add("Kurtoğlu");
        data.add("Cankuşu");

        for (int i=0;i<data.size();i++){
            System.out.print(data.get(i)+" / ");//println yazarsak yanyana değil alt alta bastırıyor.
        }

        System.out.println();

        for (int i=data.size()-1;i>=0;i--){
            System.out.print(data.get(i)+" / ");//println yazarsak yanyana değil alt alta bastırıyor.
        }

    }
}
