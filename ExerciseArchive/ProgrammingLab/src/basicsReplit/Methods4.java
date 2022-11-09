package basicsReplit;

public class Methods4 {
    public static void main(String[] args) {
        System.err.println("Aynı isimde iki farklı metot oluştmaya OVERLOADING denir!!!\n");
        int number1=658;
        int number2=354;
        int number3=7894;

        addition(number1,number2,number3);//Aynı isimde farklı parametrelerle istediğimiz kadar class oluşturabiliriz.
        addition(number1,number3);//Aynı isimde iki farklı metot oluştmaya OVERLOADING denir. Javaya özeldir.
    }

    public static void addition(int number1,int number2,int number3){//Son parantez içindeki ifadelere metot imzası denir.
        int result= number1+ number2+ number3;
        System.out.println("The result is (three numbers): "+result);
    }

    public static void addition(int number1,int number3){//Son parantez içindeki ifadelere metot imzası denir. İmza farklı olunca aynı isimde farklı 2 metot üretilebiliyor.
        int result= number1+ number3;
        System.err.println("The result is (two numbers): "+result);
    }
}
