package replits;
//History-1
//History-2
public class Test{
    public Test () {
        System.out.print ("A ");
    }
    public Test(int a) {
        this ();
        System.out.print ("B ");
    }
    public Test(String str){
        this (100);
        System.out.print(str);
    }
    public static void main (String[] args) {
        Test obj = new Test(7);
    }
}
