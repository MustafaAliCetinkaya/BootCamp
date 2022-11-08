package oblectOrientedProgramming.oop_Last;

public class Main {
    public static void main(String[] args) {
        Worker man1=new Worker(4500, "Ali","SDET",5896325417L);
        Worker man2=new Worker(5500, "Veli","QA",1003325459L);

        System.out.println("man1 = " + man1.name);
        System.out.println("man1 = " + man1.title);
        System.out.println("man1 = " + man1.salary);
        //System.out.println("man1 = " + man1.identityNumber); Dışarıya kapalıdır. İstesek de erişebiliriz.

    }
}
