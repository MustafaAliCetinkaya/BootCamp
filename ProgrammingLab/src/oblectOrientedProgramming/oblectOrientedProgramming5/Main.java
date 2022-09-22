package oblectOrientedProgramming.oblectOrientedProgramming5;

public class Main {
    public static void main(String[] args) {
        CarFactory toyota=new CarFactory();
        toyota.year=2012;
        toyota.typeOfGear="Manuel";
        toyota.color="White";
        toyota.trademark="Toyota";
        toyota.carInfo();//Diğer tarafta hazırladığım metotla tek seferde tüm bilgileri yazdıracak
        System.out.println("*************************");
        CarFactory audi=new CarFactory();
        audi.year=2019;
        audi.typeOfGear="Automatic";
        audi.color="Red";
        audi.trademark="Audi";
        audi.carInfo();//Diğer tarafta hazırladığım metotla tek seferde tüm bilgileri yazdıracak
        System.out.println("*************************");
        CarFactory mercedes=new CarFactory();
        mercedes.year=2022;
        mercedes.typeOfGear="Automatic";
        mercedes.color="Black";
        mercedes.trademark="Mercedes The Great";
        mercedes.carInfo();//Diğer tarafta hazırladığım metotla tek seferde tüm bilgileri yazdıracak


    }
}
