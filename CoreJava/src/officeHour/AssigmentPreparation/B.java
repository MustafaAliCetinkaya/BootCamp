package officeHour.AssigmentPreparation;
public class B {
    static int count;
    public B() {
        count++;
    }
    public B(int i) {
        count += i;
    }
    public void B(String s) {//It is a method
        count+=s.length();
    }
}
class Test2 {//Throws ERROR
    public static void main(String[] args) {
        new B();
        B a =new B();
        //B a2 = new B("word");  We do not have such a contractor. It was a method
        B a3 =new B(5);
        System.out.print(B.count);
    }
}
