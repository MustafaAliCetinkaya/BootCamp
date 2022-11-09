package oblectOrientedProgramming.oblectOrientedProgramming5;

public class CarFactory {
        String trademark;//İçi boş bir değişken tanımlarken eşittir kullanmıyoruz. Sadece noktalı virgül koy geç
        String typeOfGear;
        int year;
        String color;

        void carInfo(){
            System.out.println("trademark = " + trademark);
            System.out.println("typeOfGear = " + typeOfGear);
            System.out.println("year = " + year);
            System.out.println("color = " + color);
        }

}
