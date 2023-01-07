package lectureTasks.day44_45_Interface.car;

public class Audi extends Car implements AutoPark{

    public Audi(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getBrand()+" "+getModel()+" has auto park feature");
    }

    @Override
    public void start() {
        System.out.println(getBrand()+" "+getModel()+" Twist the key to ignition");
    }

    @Override
    public void drive() {

    }

    @Override
    public String toString() {
        return super.toString()+
                ", Has Auto Park=" + hasAutoPark;
    }
}
