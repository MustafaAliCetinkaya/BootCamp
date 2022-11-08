package exceptions;

// Hata mesajını kendimiz fırtlatmak istediğimizde try içine bir if bloğu koyup işlem bile yaptırmayabiliriz. İşleme uğraşmadan yoluna devam eder.
public class Throw_Throws {
    public static void main(String[] args) {
        int number1 = 500;
        int number2 = 0;

        try {
            if (number2 == 0) {
                throw new Exception();//Burada fırlatılacak hata nesnesi oluşturuldu.
            } else {
                System.out.println(number1 / number2);
            }
        } catch (Exception e) {
            System.out.println("Error occoured: " + e);
        }
        System.out.println(number1 + number2);
// Throws ile metotların yanına throws yazıp exeption ekleriz ve işlerin yolunda gitmeyebileceğine dair not düşeriz. Developer başkasının yaptığı bu uyarıya bakarak sonradan try-catch uygular. Gözden kaçmasın diye metot imzanıan eklenir. 

    }
}
