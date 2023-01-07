package lectureTasks.day44_45_Interface.car;

public class CarShop {

    public static void main(String[] args) {

        //    Car car1 = new Car("Cydeo", "25", "Blue", 2022, 100000);
        // We "can not create object" from Abstract class and interface, because abstract class is "not concrete"


        Honda honda = new Honda("Honda","Civic","Blue",2019,30000);

        Toyota audi = new Toyota("Toyota", "Corolla", "Dark Blue", 2022,120000);

        BMW tesla = new BMW("BMW", "Q5",   "White", 2020,100000);

        CydeoCar cydeo=new CydeoCar("Cydeo","EU-10","Black",2023,130000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println(cydeo);

        System.out.println("------------------------------------");

        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Green");

        honda.setPrice(25000);
        audi.setPrice(40000);
        tesla.setPrice(55000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("------------------------------------");

        honda.stop();
        audi.start();
        audi.autoPark();
        tesla.selfDrive();
        cydeo.fly();
        System.out.println("Has cydeo auto park feature : "+CydeoCar.hasAutoPark);

    }


}
