package week03_09_24_2022;

public class SingleAndDoubleAnd {

    public static void main(String[] args) {

        boolean result=false;
        int a=10;
        //false  it will look at this statement and increment the value
        if (result & a++<12) { // first do your job increment for next line

        }

        System.out.println("a = " + a); //11

        int b=10;
        //  false  it will look at this statement and increment the value
        if (result && b++<12) {

        }

        System.out.println("b = " + b);

    }
}
