package replits;
public class MethodsCasting {
    public static void main(String[] args) {
        double number = add (3.4);
        number += add("dual");
        number += add (Integer.parseInt("100"));
        number += add (11341L);//Long is implicitly casted to double.
        number += add (Float.parseFloat("50.8"));
        System.out.print(number);
    }
    public static int add(int n) { return 5;
    }
    public static double add(double d) { return 2.5;
    }
    public static long add(String s) { return 10;
    }
}


/*import java.util.Scanner;

public class Test {
    public static int action() {
        return 0;
    }

    public static int action(int i) {
        return i * 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        total += action(input.nextBoolean());
        total += action(input.nextInt());
        total += action();
        total += action(input.next());
        total += action(input.next());
        System.out.print(total);
    }

    public static int action(String s) {
        return s.length();
    }

    public static int action(boolean b) {
        if (!b)
            return 5;
        else {
            return 10;
        }
    }
}


public class Test {
    public static void main(String[] args) {
        int result = method4('z', "zebra"); System.out.print("result");
    }
    public static int method4(char c, String s) {
        if(s.contains("" + c)) {
            return 1;
        } else {
            return 0;
        }
    }
}*/

/*
public class MethodsCasting {
    public static void main(String[] args) {
        double a=1234546L;
        System.out.println(a);
    }
}

*/

