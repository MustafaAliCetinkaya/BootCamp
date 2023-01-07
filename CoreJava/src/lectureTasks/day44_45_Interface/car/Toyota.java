package lectureTasks.day44_45_Interface.car;

public final class Toyota extends Car implements AutoPark {

    public Toyota(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(getBrand()+" "+getModel()+" Push the start button");
    }

    @Override
    public void drive() {

    }
    @Override
    public void autoPark(){
        System.out.println(getBrand()+" "+getModel()+" has auto park feature");
    }

    @Override
    public String toString() {
        return super.toString()+
        ", Has Auto Park=" + hasAutoPark;
    }
}
