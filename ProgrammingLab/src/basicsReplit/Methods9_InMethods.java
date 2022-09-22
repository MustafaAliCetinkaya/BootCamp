package basicsReplit;

public class Methods9_InMethods {
    public static void main(String[] args) {//Metotlar birbirinin içinden de çağrılabilir. Ama fitili ateşleyecek ilk metot yine main içine yazılacak.

        addition();//Mainden toplama metodunu çağırıp sonra iç içe metotları harekete geçiriyoruz.
        //Kısır döngüye sokan iç içe çağırmalar hafıza hatasına sebep olur. Sonsuz döngüden çıkamaz.

    }

    public static void addition(){
        multiplication(56.12,50.09);//Alttaki metodu buradan da çağırabiliriz. Yukarıdan aşağı sırayla yazdıracak.


        System.out.println("We called the addition method");
        System.out.println("Java came here and do it\n");

        division(81,27);

    }

    public static void multiplication(double number1,double number2){
        division(243,27);
        double multiplication=number1*number2;
        System.out.println("Result of the operation: "+multiplication);

    }

    public static void division(double number1,double number2){
        //multiplication(63,698);//Buradan addition() veya multiplication çağırsaydık sonsuz döngüye girip hafıza hatası verirdi.

        double division=number1/number2;
        System.out.println("Result of the operation: "+division);

    }
}
