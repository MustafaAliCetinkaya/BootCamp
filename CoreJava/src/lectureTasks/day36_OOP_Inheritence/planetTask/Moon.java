package lectureTasks.day36_OOP_Inheritence.planetTask;

public class Moon extends Planet implements MoonInterfaceTest{
    public static void main(String[] args) {
        testForMoonClass();//We can directly call the static method without using the class name by inheriting with extend keyword.
        MoonInterfaceTest.moonInterfaceTest();//We can not call the static method without using the class name by inheriting with implement keyword.

        /*Similar to Default Method in Interface, the static method in an interface can be defined in the interface, but cannot be overridden in Implementation Classes. To use a static method, Interface name should be instantiated with it, as it is a part of the Interface only.
Below programs illustrate static methods in interfaces:*/
    }
}
