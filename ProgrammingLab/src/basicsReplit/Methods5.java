package basicsReplit;

public class Methods5 {
    public static void main(String[] args) {//VOID: Yaptığı işle ilgili geri dönüş yapmaz. RETURN TOKTUR.
    //Temizlik görevlisi gibi işini yapar gider, geri dönüp bilgi vermez.
        showHint ();
        addition(987,326);//Buranın değeri vardır. int türündendir.
        // Yani istersek hemen altına değerini bastırabiliriz. Void olsaydı içi boş olurdu.
        int result=addition(987,326);//Burası void olsaydı böyle bir eşitlik yapmazdı, hata verirdi.
        System.out.println(result);//int olduğu için returmn edebilir ve içinde değer vardır. Bu yüzden değerini bastırabiliriz.
    }
    public static void showHint (){//Sadece denileni yapar, geri döndürme yapmaz.
        System.out.println("Hello World");
        System.out.println("Hi Cydeo");
    }

    public static int addition(int number1,int number2){
        int addition=number1+number2;
        return addition;
    }
}
