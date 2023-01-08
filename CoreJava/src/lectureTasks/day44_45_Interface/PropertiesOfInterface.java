package lectureTasks.day44_45_Interface;

public interface PropertiesOfInterface {

    int a = 100;  // static & final by default
    static int b = 200; // final by default

/*    public PropertiesOfInterface(int a){  //We do not have constructor and can not create object. Ama classımız abstract olsaydı bu bölümde hata vermezdi.
        this.a =a;
    }*/

    /*static{   //Interface is not a class. We do not have static block. Ama classımız abstract olsaydı bu bölümde hata vermezdi.
        b = 100;    Since it is final by default, we can not use static block.
    }*/

  /*  public void method1(){    In ınterface we do not have object, so we can not use instance method. Ama classımız abstract olsaydı bu bölümde hata vermezdi.
        System.out.println("Instance method");
    }*/

     static void method2(){
        System.out.println("Static method");
    }

     void method3();

    default void method4(){
        System.out.println("Default method");
    }

}
