package lectureTasks.day44_45_Interface.car;

public final class BMW extends Car {


    public BMW(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    public void start() {
        System.out.println("Say \"start\"");
    }

    public void autoPilot(){
        System.out.println(getBrand()+" "+getModel()+" has auto pilot feature");
    }

}
