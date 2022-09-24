package oblectOrientedProgramming.oop_Last_Inheritance;

public class CommonFeatures {//Diğer class lar buradan miras aldı, artık burada yazan bilgiler miras verilen herkes tarafından kullanılabilir.
    int salary = 4800;
    int identityNumber;
    String position;

    public void test() {
        System.out.println("We are testing the inheritance features");
    }

    public int change(int salary, int identityNumber) {
        return salary;
    }

}
