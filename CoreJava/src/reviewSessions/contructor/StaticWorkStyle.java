package reviewSessions.contructor;

public class StaticWorkStyle {

    static {
        //file read
        System.out.println("first static");
    }

    static {
        //use taht file and assign another static variable
        System.out.println("second static");
    }

    public static void main(String[] args) {

        methodStatic();
        System.out.println("main method");


    }

    public static void methodStatic(){
        System.out.println("method static");
    }


    static {
        System.out.println("third static");
    }
}
