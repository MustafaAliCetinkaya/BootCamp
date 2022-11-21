package lectureTasks.day33_Static;

public class TestIphone {

    public static void main(String[] args) {

        System.out.println( Iphone.OS );//We apply the static variables to directly class
        System.out.println( Iphone.hasFaceTime );//We do not need an object to use static variables.
        System.out.println( Iphone.madeIn );
        System.out.println( Iphone.isTouchScreen );

    }


}
