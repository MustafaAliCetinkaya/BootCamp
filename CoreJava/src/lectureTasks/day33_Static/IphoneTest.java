package lectureTasks.day33_Static;

public class IphoneTest {

    public static void main(String[] args) {

        System.out.println( Iphone.OS );//We apply the static variables to directly class
        System.out.println( Iphone.hasFaceTime );//We do not need an object to use static variables.
        System.out.println( Iphone.madeIn );
        System.out.println( Iphone.isTouchScreen );

    }
}
/*instance: belong to the object
		each object has its own copy of the instances (can have multiple copies)


static: belongs to the class.
		There is only one copy os statics thta's shared by all objects of the class*/