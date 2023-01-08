package lectureTasks.day44_45_Interface;

public class TestPropertiesOfInterface implements PropertiesOfInterface {

    @Override
    public void method3() {
        System.out.println("Detailed in here");
    }

    public static void main(String[] args) {

        new TestPropertiesOfInterface().method4();
        new TestPropertiesOfInterface().method3();
        PropertiesOfInterface.method2();
        /*
Since Java8 you can have static methods in an interface (with body).
You need to call them using the name of the interface, just like static methods of a class.*/

    }
}
