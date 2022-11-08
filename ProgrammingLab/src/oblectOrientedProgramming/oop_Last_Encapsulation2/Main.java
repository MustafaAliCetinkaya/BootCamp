package oblectOrientedProgramming.oop_Last_Encapsulation2;

public class Main {
    public static void main(String[] args) {
        Worker object=new Worker();
        object.setSalary(9800);//Set ile değer değiştirdik

        System.out.println(object.getSalary());//Get ile yeni değeri bastık. Burada get in içi boş olacak, parantez içine değer yazmıyoruz.
        System.out.println(object.getName());//Sadece getirir, set tanımlanmadığından isim değiştirilemez.
    }

}
