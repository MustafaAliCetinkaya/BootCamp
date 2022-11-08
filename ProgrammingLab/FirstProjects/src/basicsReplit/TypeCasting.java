package basicsReplit;

public class TypeCasting {
    public static void main(String[] args) {
        //İlkel veri tiplerinden sayılarla ilgili olanlar arasında tip değişimi yapabiliriz.
        // Küçükler büyüklere otomatik dönüşür ama büyükleri küçüklere dönüştürmek için biz manuel tanımlarız.
        //İkisi de sayı ise sayılararası tip değişimi bu yöntemle ama Satringi int e dönüştürmek Wrapper Class ile yapılır.
        byte number1=12;
        int number2=99;

        number1= (byte) number2;//int daha büyük, bunu byte içine koymak için önüne parantez içinde byte yazarız. Manule yaparız.
        System.err.println(number1);

        double number3=65.9;
        long number4=12;

        number3= (double) number4;//long türünü double ye çevirdik. Bu otomatik de çevrilir. Önüne double yazmaya gerek yok aslında
        System.err.println("\n"+number3);

        double number5=75.9;
        int number6=(int)number5;//Otomatik dönüşmez. Explicitly yani elle girerek yapmamız gerekir.
        byte number7=5;
        number7=(byte)number5;
        System.err.println("\n"+number6);
        System.err.println("\n"+number7);

        System.out.println((int) 96.87/12);//ondalık olanı casting yaparak int e çevirdik ve sonuç tamsayı çıktı


    }
}
