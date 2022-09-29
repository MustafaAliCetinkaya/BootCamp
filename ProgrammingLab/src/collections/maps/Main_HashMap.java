package collections.maps;

import java.util.HashMap;

// Key-value ilişkisi olan, yani ikili bilgi şeklinde tutulan verilerde daha uygun olur. Referansı olan datalarda tercih edilir.
// Kümeler gibi sırasız şekilde data tutar. Hash ve Tree diye bu da iki türlüdür. Tree de yine klasik olarak istersek sıralayabiliriz.
//Örneğin personel ismi ve maaşını birlikte tutmak istiyorsak, maaşı sildiğimde ismi de silebilecek dinamik bir yapı istiyorsak map kullanılır.
// key=value, anahtar=değer yazımı vardır. Ama anahtarlar (value aynı olabilir) benzersiz olmak zorundadır. Aynı isimle (sadece anahtarlar) farklı ikililer olmaz. Küme mantığı gibi.
public class Main_HashMap {
    public static void main(String[] args) {

        HashMap keyValueData=new HashMap();
        keyValueData.put("Hamza", 2500);//Diğerlerindeki add() metotunun karşılığı burada put() oldu.
        keyValueData.put("Kahraman", 3000);
        keyValueData.put("Serhat", 12400);
        keyValueData.put("Serhat Can", 12400);
        keyValueData.put(464654, "Aykırı");//İstersek birinci sayı, ikincisi Strin olabilir. Bunu tip belirleyerek sabitleyebiliriz
        System.out.println(keyValueData);
        System.out.println(keyValueData.size());
        System.out.println(keyValueData.containsKey("Hasan"));//İçinde anahtar var mı diye bakar
        System.out.println(keyValueData.containsValue(12400));//İçinde değer var mı diye bakar
        System.out.println(keyValueData.entrySet());//Eklenen dataların listesini almak için kullanılır.
        System.out.println(keyValueData.keySet());//Küme şeklinde bize tüm anahtarları verir
        keyValueData.remove("Hamza");//Sırası olmadığı için indexten yararlanarak veri silinmez.
        System.out.println(keyValueData);
        System.out.println( (keyValueData.size()));

    }

}
