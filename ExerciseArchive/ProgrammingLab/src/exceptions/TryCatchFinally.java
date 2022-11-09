package exceptions;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter a number");
        double number1=input.nextDouble();

        System.out.println("Please enter another number");
        double number2=input.nextDouble();

        double result=0;

        try {
            result=number1/number2;
        }catch (ArithmeticException e){
            System.out.println("An Error occurred while running the codes: "+e);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println( "Error: "+exception);
        }catch (Exception e){// Buradaki parantez içi "Exception" genel bir ifadedir. Bunu yazsak yeterli, herşeyi yakalar, tip ihtimal belirtmeye gerek kalmaz.
            System.out.println("Error: "+e);
        }        /*catch (){              //Yukarıda hatayı düzgün tanımlamazsak, ilgisiz öngörülerde bulunursak yakalayamaz.
                                        İstersek bir sürü senaryoya dair ihtimaller yazılabilir. Her türlü hata öngörülerek önü alınabilir
        }*/
        finally {
            System.out.println("Whatever occours, write this part");//Bu bölüm hata olsun olmasın her halükarda çalıştırılmasını istediğimiz yerdir.
        }//Bu genelde kullanılmaz. Çünkü hemen aşağıdaki gibi yazsak zaten çalışıyor her istediğimiz. Bu süs olsun diye konuluyor.
        System.out.println("Result is: "+result);

    }
}
