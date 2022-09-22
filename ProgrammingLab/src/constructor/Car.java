package constructor;
//Biz Main de Car object=new Car(); yazdığımızda sağ taraftaki constructor "new Car()" ifadesi sayesinde nesne oluşur.
//Bu nesne aşağıda gizli bir   ---->     public Car() {} oluşturur. Biz göremesek de aşağıdaki public class Car içinde bu vardır.
//Main den buradakiler çağrıldığında ilk önce görülmeyen  ---->     public Car() {} içindekiler çalıştırılır. Sonra dışına bakılır.

public class Car {
    String trademark="Mercedes";
    String typeOfGear="Manuel";
    int year=2021;
    String color="White";

    public Car() {//Bu aslında gizlidir ama biz yazsak da yanlış olmaz. İlk önce bunun içindekiler yazdırılır.
        System.out.println("Featured properties of Mercedes are written below");
        year=1995;//Önce burası çalıştığı için yukarıdaki yıl değişip bu yazılacak
        color="Black";
    }
}
