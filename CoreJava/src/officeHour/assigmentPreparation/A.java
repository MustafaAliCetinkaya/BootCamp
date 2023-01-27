package officeHour.assigmentPreparation;
public class A {
    int count;
    public void m(){ count++;
    }
    public void m(int n) { count *= n;
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.m(5);
        obj.m();
        obj.count += 10;
        obj.m(2);
        System.out.print(obj.count);
    }
}
