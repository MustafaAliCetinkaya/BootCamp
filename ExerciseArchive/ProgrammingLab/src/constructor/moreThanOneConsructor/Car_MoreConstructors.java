package constructor.moreThanOneConsructor;

public class Car_MoreConstructors {
    String trademark;//İçi boş bir değişken tanımlarken eşittir kullanmıyoruz. Sadece noktalı virgül koy geç
    String typeOfGear;
    int year;
    String color;

    public Car_MoreConstructors() {//Biz yazmasak da zaten böyle bir constructor gizli olarak burada mevcut.
        trademark = "Toyota";
        year = 2015;
    }

    public Car_MoreConstructors(int newYear) {//Aynı isimde 2 constructor olmaz. Parantez içine parametre tanımlamalıyız.
        //Parantez içindeki parametreler farklı olduğu sürece aynı isimli contructor olabiliyor.
        year=newYear;//Bu sayede main de parantez içine yazdığım sayıyı buraya atayacak
        color = "Black";
        typeOfGear = "Manuel";
    }

    public Car_MoreConstructors(String newTrademark) {//1 tane stringli başka kullanamam
        year = 2022;
        trademark=newTrademark;//Bu sayede main de parantez içine yazdığım markayı buraya atayacak
    }

    public Car_MoreConstructors(String newTypeOfGear, String newColor) {//Buraya mecburen 2 stringli ya da 2 başka değişkenli tanımlamalıyız.
        typeOfGear = newTypeOfGear;//Bu sayede main de parantez içine yazdığım vites türünü buraya atayacak
        color =newColor;//Bu sayede main de parantez içine yazdığım rengi buraya atayacak
    }

}
