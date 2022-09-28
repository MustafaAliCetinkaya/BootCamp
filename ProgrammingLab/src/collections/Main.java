package collections;

public class Main {
    public static void main(String[] args) {
        int [] models=new int[12];//Arrya tanımlarken içine kaç eleman gireceği, yani boyutu tanımlanmalıydı. 12 kişilik yer ayırır, daha az eleman kullansan bile hafızada gereksiz yer tutar.
        // new int[]; Bu şekilde içini boş bırakırsak, boyut yazmazsak hata verir.
        // COLLECTIONS ==> Boyut belirmeden, bir arrayde istediğimiz kadar data tutabilmeye yarar.
        // Boyutun ucu açık bırakılarak oluşturulabiliyorsa adı COLLECTIONS, boyutlu oluyorsa ARRAY olur.

        Car object1= new Car();
        Car object2= new Car();
        Car object3= new Car();
        Car object4= new Car();

        Car[] cars={object1,object2,object3,object4};

        /*COLLECTIONS: Hafızada ne kadar eleman yazarsam alır ve o kadar yer tutar. Hafızayı yormaz.
       Interface ler yardımıyla collection oluştururuz. 3 tür interface vardır.
       SET==>Matematikteki kümeler gibidir. sırasız şekilde veriler durur.
           LIST==>Kümede elemanlar indexli şekilde yer alır
               MAP==>Anahtar değer şeklinde data tutulur. Mesele öğrenci isimleri ve notlarını 2 ayrı arrayde tutup sonra bu bilgileri eşleştirebiliyorken,
               Map'de ikili data tutulabiliyor (String--int) şekilde eşleştirilmiş bilgileri daha kolay saklayabiliyoruz.

         */





    }
}
