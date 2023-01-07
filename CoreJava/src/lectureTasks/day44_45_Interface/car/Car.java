package lectureTasks.day44_45_Interface.car;

public abstract class Car {

    private final String brand, model;
    private String color;
    private final int year;
    private double price;

    public Car(String brand, String model, String color, int year, double price) {
        if(brand.isEmpty()&&brand.isBlank()){
            throw new RuntimeException("Invalid brand: "+brand);//Before check then assign
        }
        this.brand = brand;
        if(model.isEmpty()&&model.isBlank()){
            throw new RuntimeException("Invalid model: "+model);//Before check then assign
        }
        this.model = model;
        setColor(color);

        if(year < 1886){
            throw new RuntimeException("Invalid Year: "+year);//Before check then assign
        }
        this.year = year;
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        if(color.isEmpty()&&color.isBlank()){
            throw new RuntimeException("Invalid color: "+color);//Before check then assign
        }
        this.color = color;
    }

    public void setPrice(double price) {

        if(price <= 0){
            throw new RuntimeException("Invalid price: "+price);
        }

        this.price = price;
    }

    public  void stop(){
        System.out.println("Press the brake");
    }

    public abstract void start();

    public abstract void drive();


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +//Every class wil have its own name
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
