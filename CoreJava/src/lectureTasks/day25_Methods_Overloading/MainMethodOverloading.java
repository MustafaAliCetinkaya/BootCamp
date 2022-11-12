package lectureTasks.day25_Methods_Overloading;
public class MainMethodOverloading {

    public static void main(String[] args) {//Only this one runs, it is builder method.
        System.out.println("String");
        main(new int[]{3,6,7,5});//Overloaded method
        //If we do not use other overloaded methods, no error, no action!

    }

    public static void main(int[] args) {
        System.out.println("int");
    }

    public static void main(double[] args) {
        System.out.println("double");
    }

    public static void main(char[] args) {
        System.out.println("char");
    }


}
