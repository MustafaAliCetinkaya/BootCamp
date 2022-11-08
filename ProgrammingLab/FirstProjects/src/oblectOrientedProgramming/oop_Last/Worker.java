package oblectOrientedProgramming.oop_Last;

public class Worker {
    int salary;
    String name;
    String title;
    private long identityNumber;//Bu şekilde kalırsa erişime kapanır ve kimse erişemez.

    public Worker(int salary, String name, String title, long identityNumber) {
        this.salary = salary;
        this.name = name;
        this.title = title;
        //this.identityNumber=identityNumber; Bunu kullanarak istersem private ı da erişime açabilirim.
    }
}
