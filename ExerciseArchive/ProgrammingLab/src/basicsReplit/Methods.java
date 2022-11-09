package basicsReplit;

public class Methods {
    public static void main(String[] args) {
        //Bir arabanın önce parçaları ayrı yerlerde yapılır ve sonra birleştirilir. Bunun gibi büyük yazılımlar da parçalara ayrılır metotlar sayesinde.
        //Aynı işlem tekrar tekrar yapılacaksa, bir formül yazılır ve tüm sayılara uygulanır. Kodu sadeleştiri metotlar.
        //Aşağıda UZUN bir tekrar eden kod örneği metotlar ile de gösterilecek.

        System.out.println(arraySum(new int[]  {12, 65, 98, 65, 79, 64}));//arraySum Yazınca aşağıdaki metodu çağırır ve formül neyse uygular.
        System.out.println(arraySum(new int[]  {87, 64, 21, 10, 30, 50}));
        System.out.println(arraySum(new int[]  {878, 645, 21, 510, 305, 500}));
    }

    public static int arraySum(int[] number) {//Bu metotdur. Yukarıdaki her işlem için ayrı ayrı çağrılır ve kullanılır.
        int sum = 0;
        for (int addition : number) {//Tekrar eden kodlar metot içine tek sefer yazılarak sadelik sağlar.
            sum += addition;
        }
        return sum;
    }//İstediğimiz kadar metot yazabiliriz. Kullanmak zorunda da değiliz. Yazılıp kullanılmayan metotlar hataya da sebep olmaz.

   /*     int[] number1 = {12, 65, 98, 65, 79, 64};
        int[] number2 = {87, 64, 21, 10, 30, 50};
        int[] number3 = {878, 645, 21, 510, 305, 500};*/

/*        int sum1=0;
        for(int addition:number1){//Bu förmülü sürekli yazarak kod kalabalıklı yapıyoruz aslında
            sum1+=addition;
        }

        int sum2=0;
        for(int addition:number2){
            sum2+=addition;
        }

        int sum3=0;
        for(int addition:number3){
            sum3+=addition;
        }

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);*/

}
