package constructor;

public class Main {
    public static void main(String[] args) {//new Car(); ifadesi constructor dır. Metotlara benzer.
        Car mercedes = new Car();//Önce gizli dosyanın içindeki bastırılır sonra aşağıdakiler yazdırılır.
        System.out.println(mercedes.trademark);
        System.out.println(mercedes.color);
        System.out.println(mercedes.typeOfGear);
        System.out.println(mercedes.year);


//NESNE OLUŞTURURKEN CONTRUCTOR KULLANIRIZ. İnşaat ustası gibi nesneleri oluşturur, nesne üzerinde değişiklik yapmaya izin veriri.
//Bütün class ların contructor ı vardır. Gizli olarak bulunur.

        /*
        public ClassNanme(){   Yazımız hep bu şekildedir. Class ın adı olmazsa hata verir. Başına Public dışında başka şeylerde verilir. Bu public erişim izniyle ilgilidir.

        }
         */
    }
}
