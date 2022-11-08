package collections.maps;

import java.util.HashMap;
import java.util.Map;

//Anahtar bölümlerinin  sadece tek tipten oluşmasını istiyorsak <String, Integer> eklemesi yapılır klasik olarak.
//Tree maplerde sıralamaya yapmaya çalıştığından key yerine sayı koyarsak hata veriri çünkü sayı ile metni sıralayamaz.
public class HashTreeForEach {
    public static void main(String[] args) {
        HashMap<String, Integer> input=new HashMap<>();//key-->String, değeri-->integer olsun diye tanımladık. İlkel veri tipleri büyük harfle yani Wrepper class olarak yazılır.
        input.put("Hamza", 12345);
        input.put("Ali", 1200);
        input.put("Selami", 123000);
        input.put("İbrahim", 178987);
        //input.put("Hamza", "12345"); yukarıdaki tanıma aykırım olduğu için ikisi de strin olmaz. İstersek bunu da tanımlayabilirdik.

        for (Map.Entry<String, Integer> staff:input.entrySet()) {//Sıralı olmadığı için indexli for döngüsünü kullanamayız. Burada Object yazsak da hata verir. Çünkü hem int hem de String var. Daha farklı bir yöntem izleriz.Entry özelliği import edilmelidir.
            System.out.println(staff);
            System.out.println(staff.getKey());//Sadece anahtarları yazdırabiliriz.
            System.out.println(staff.getValue());
        }





    }
}
