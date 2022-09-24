package oblectOrientedProgramming.oop_Last_Abstraction;

public class Cat extends CommonFeatures{
    @Override//Abstract metodu buradan kullanacağız override yöntemiyle
    public void voice() {
        System.out.println("Cats make noise as saying miyav miyav");
    }
}
