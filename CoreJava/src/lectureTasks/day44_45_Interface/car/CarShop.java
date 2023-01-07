package lectureTasks.day44_45_Interface.car;

public class CarShop {

    public static void main(String[] args) {

        //    Car car1 = new Car("Cydeo", "25", "Blue", 2022, 100000);
        // We "can not create object" from Abstract class, because abstract class is "not concrete"


        Honda honda = new Honda("Accord", "Black", 2019, 30000);

        Toyota audi = new Toyota("Corolla", "Comfort", "Blue", 2022,120000);

        BMW tesla = new BMW("Model3", "White", 2021, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

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



    }


}
