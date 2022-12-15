package myInterviewPreperationQuestions;

public class Interview_Increment {
    public static void main(String[] args) {
        int a, b, c;
        a = 9;
        b = 10;
        c = ++a + b++;

        System.out.println(c);
        System.out.println(b);
        System.out.println(a);

        System.out.println("-------------------------------");

        int i = 0;
        i = i++ + i;
        System.out.println("i = " + i);

        System.out.println("-------------------------------");

        String s1="yes";
        String s2="yes";
        String s3=new String("yes");
        String s4=new String(s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s4==s2);
        System.out.println(s4.equals(s2));
        System.out.println("-------------------------------");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s3==s2);
        System.out.println(s3.equals(s2));

    }
}
