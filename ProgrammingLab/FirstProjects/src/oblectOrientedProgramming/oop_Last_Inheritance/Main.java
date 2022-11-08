package oblectOrientedProgramming.oop_Last_Inheritance;
//İlk çalıştırılan yer miras alınan yerdir. Constructordan da evvel çalıştırılır.
public class Main {
    public static void main(String[] args) {
        Director object1 = new Director();
        Teacher object2=new Teacher();
        Worker object3=new Worker();

        object1.test();//Miras alarak commonfeatures da ne varsa hepsine ulaşabiliyoruz.
        object1.change(9800,596664654);
        System.out.println(object1.identityNumber);
        System.out.println(object1.change(7896,124654654));
        System.out.println(object2.salary);
        System.out.println(object3.position);

    }
}
