package officeHour.assigmentPreparation;
public class Test {
    String name;
    int numOfTests;

    /* line 6 */ public void setInfo(String name, int numOfTests) {
        this.name = name;
        this.numOfTests = numOfTests;
    }


    public static void main(String[] args) {
        Test t= new Test();
        t.setInfo("smoke test", 15);
    }
}
