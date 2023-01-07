package lectureTasks.day44_45_Interface.car;


public final class Honda extends Car {


    public Honda(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void start(){
        System.out.println(getBrand()+" "+getModel()+" Twist the key to ignition");
    }

    @Override
    public void drive() {

    }


}
