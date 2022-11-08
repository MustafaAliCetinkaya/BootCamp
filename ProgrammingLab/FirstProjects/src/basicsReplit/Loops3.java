package basicsReplit;

public class Loops3 {
    public static void main(String[] args) {
        int number=326;
        int basamak=0;
        int sum=0;

        while (number>0){
            basamak=number%10;
            sum=sum + basamak;//Bu bölüm şöyle yazılırsa daha güzel: toplam+=basamak;
            number=number/10;//En sonda bir basamaklı sayı kalır. Bunun 10 a bölümü 0 dır. yani bölüm kısmı sıfır olur ve en baştaki number>0 şartını sağlamaz ve çalışmaz.
        }
        System.out.println("Sum of digits of the number: "+sum);
    }
}
