package basicsReplit;

public class Methods2 {
    public static void main(String[] args) {//Metotlar main içinden çağrılır. Metotların sonunda PARANTEZ olur.
        addition();//Metodu parantezinden anladı aşağı atladı ve metot içinin gereğini yaptı.
        addition();//Parantezin içi boş olanlar PARAMETRESİZ metottur.
        multiplication(56.12,50.09);
        multiplication(24,63);//Buranın tek başına değeri yoktur. Void dir. Buranın değeri aşağıdaki Sout ile yazdırılır.

    }//Oluşturulan metotlar main dışına yazılır.

    public static void addition(){
        System.out.println("We called the addition method");
        System.out.println("Java came here and do it\n");

    }

    public static void multiplication(double number1,double number2){
        double multiplication=number1*number2;
        System.err.println("Result of the operation: "+multiplication);


    }
}
