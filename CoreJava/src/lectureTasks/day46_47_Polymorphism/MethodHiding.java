package lectureTasks.day46_47_Polymorphism;

public class MethodHiding {
    public static void method1() {
        System.out.println("Static Method-1 of the MethodHiding class is executed.");
    }

    public void method2() {
        System.out.println("Method-2 of the MethodHiding class is executed.");
    }

}

class Sample extends MethodHiding {

    public static void method1() {
        System.out.println("Static Method-1 of the Sample class is executed.");
    }

    public void method2() {
        System.out.println("Method-2 of the Sample class is executed.");
    }

    public static void main(String args[]) {
        MethodHiding d1 = new MethodHiding();
//d2 is reference variable of class MethodHiding that points to object of class Sample
        MethodHiding d2 = new Sample();
//method calling with reference (method hiding)
        d1.method1();
        d1.method2();
//method calling with object (method overriding)
        d2.method1();
        d2.method2();
    }
}





