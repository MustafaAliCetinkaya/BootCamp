package officeHour.recapBySolvingProblems;

interface A {
    void readBook(); // line 1
    abstract void watchTV();
}
abstract class B implements A {
    public void readBook() { System.out.println("Reading Book");
    }
}
public class C extends B {
    @Override
    public void watchTV() {

    }
// line 2
}
