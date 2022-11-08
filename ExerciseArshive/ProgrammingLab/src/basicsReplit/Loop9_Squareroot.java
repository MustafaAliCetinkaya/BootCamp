package basicsReplit;

public class Loop9_Squareroot {
    public static void main(String[] args) {
        System.out.println(Math.cos(30));//Math. yazıp istediğimiz matematik hesabını yaptırırz.
        //pow (2,3) şeklinde math e eklenince 2 nin 3. kuvvetini hesaplatabiliriz.
        System.out.println(Math.pow(2,10));
        System.out.println(Math.sqrt(361));//Karekök metodu da var ama biz kendi algoritmamızı yazacağız.

        int number=289;
        double squareroot=1;
        for(double a=1.000; a*a<=289; a+=0.001 ){
            squareroot=a;
        }
        System.out.println(squareroot);//Sonuç tamsayı çıkmayınca format özelliği kullanılabilir.
    }
}
