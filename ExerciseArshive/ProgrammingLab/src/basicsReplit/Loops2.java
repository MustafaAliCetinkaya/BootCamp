package basicsReplit;

public class Loops2 {
    public static void main(String[] args) {
        int number = 0;
        int count=0;
        System.out.println("Our numbers divisible by 3:");
        while (number < 50) {
            /* System.out.println(number);//50 ye kadar olan sayılar yazdırıldı.*/
            number++;//Burayı number+=2 deseydik ikişer ritmik sayar ve 50 de dururdu. Bunun gibi diğer artırma versiyonları da kullanılabilir.

            if (number % 3 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("Our numbers divisible by 7:");
        while (count < 50) {

            count++;
            if (count % 7 == 0) {
                System.out.println(count);
            }
        }

    }
}
