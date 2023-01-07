package lectureTasks.day44_45_Interface.car;

public class Nio extends Car implements AutoPark, AutoPilot{

    public Nio (String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getBrand()+" "+getModel()+" has auto park feature");
    }

    @Override
    public void selfDrive() {
        System.out.println(getBrand()+" "+getModel()+" has self drive feature");
    }

    @Override
    public void start() {
        System.out.println(getBrand()+" "+getModel()+" Say \"start\"");
    }

    @Override
    public void drive() {

    }

    @Override
    public String toString() {
        return super.toString()+
                ", Has Auto Park=" + hasAutoPark +
                ", Has Auto Pilot=" + hasAutoPilot;
    }
}
