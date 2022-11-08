package constructor.moreThanOneConsructor;

public class Main {
    public static void main(String[] args) {
        Car_MoreConstructors car1=new Car_MoreConstructors();
        Car_MoreConstructors car2=new Car_MoreConstructors(2019);//Diğer sayfada newYear olarak atadığım için işe yarayacak.
        Car_MoreConstructors car3=new Car_MoreConstructors("Mercedes");
        Car_MoreConstructors car4=new Car_MoreConstructors("Automatic","Red");

        System.out.println(car1.color);
        System.out.println(car1.trademark);
        System.out.println(car1.typeOfGear);
        System.out.println("*************************");
        System.out.println(car2.year);
        System.out.println(car2.color);
        System.out.println("*************************");
        System.out.println(car3.trademark);
        System.out.println(car3.color);
        System.out.println("*************************");
        System.out.println(car4.color);
        System.out.println(car4.typeOfGear);

    }
}
