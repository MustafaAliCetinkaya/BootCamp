package interface_Final_Abstract;
//Bir class interface sayesinde birden çok class dan miras alabiliyor. Normalde extends de böyle bir özellik yok. Katkısı bu.

public class Main {
    public static void main(String[] args) {
        ToyotaCar corolla=new ToyotaCar();
        corolla.modelInfo();//Sout yapmak yerine bu şekilde doğrudan bastırabiliyoruz.
        corolla.newProduct();
    }
}
