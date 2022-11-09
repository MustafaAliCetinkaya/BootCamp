package interface_Final_Abstract;

public class ToyotaCar implements Year, Model {//Interface de miras alma extend ile değil implemen ile yapılır. Hemen override etmek zorunda olduğu için aşağıda metodu çağırdı, metot silinirse hata verir.

    @Override
//implement edince addition zorunlu olarak override edilir ama diğer static olan example metodu zorunlu olmadığından burada yer almayabilir.
    public void newProduct() {
        System.out.println("Example");
    }

    @Override
//Yukarıya sadece virgül koyarak diğer abstract Model i ekledik, bunun içindeki metotu da buraya override etmek zorundayız yoksa hata verir.
    public void modelInfo() {
        System.out.println("Corolla");
    }
}
