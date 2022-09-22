package basicsReplit;

public class Loops13_ForEach {
    //For döngüsündeki indeks ve sayaç oluşturma işleminden bizi kurtarıyor.
    public static void main(String[] args) {
        String[] array = {"ali", "ahmet", "mehmet", "mustafa", "ali", "mustafa", "mehmet"};

/*
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        Bu yöntemle tüm array elemanları indeks kullanarak yazdırılabilir ama FOrEach daha kısa bir yazıma sahip
*/
        for(String data:array){//Bu kadarcık bir yazım yetiyor ve indeks kullanmıyoruz
            System.out.println(data);
        }

    }
}
