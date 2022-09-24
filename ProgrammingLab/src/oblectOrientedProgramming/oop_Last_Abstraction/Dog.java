package oblectOrientedProgramming.oop_Last_Abstraction;

public class Dog extends CommonFeatures{//Miras aldığımız için CommonFeatures da olan abstract metodu da miras almak zorundayız.

    @Override
    public void voice() {
        System.out.println("Dogs are barking");
    }
}
