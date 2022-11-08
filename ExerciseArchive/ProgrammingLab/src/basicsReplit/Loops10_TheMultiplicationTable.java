package basicsReplit;

public class Loops10_TheMultiplicationTable {
    public static void main(String[] args) {
        System.out.println("The multiplication table\n");
        for (int i=1;i<11;i++){
            for (int j=1;j<11;j++){
                System.out.println(i+"x"+j+" = "+i*j);
            }
            System.out.println();//Burası içerdeki for döngüsü her bittiğinde bir boşluk bırakır. Sonra yukarıdaki for döngüsüne geçer tekrar alta iner ve böyle devam eder.
        }
    }
}
