package lectureTasks.day44_45_Interface.shapeTask;

public class Cube extends Shape implements Volume{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            throw new RuntimeException("Invalid Side: "+side);
        }
        this.side = side;
    }

    public Cube(double side) {
        super("Cube");
        setSide(side);
    }

    @Override
    public double area() {
        return 6 * (getSide() * getSide());
    }

    @Override
    public double perimeter() {
        return 12 * getSide();
    }


    @Override
    public double volume() {
        return getSide() * getSide() * getSide();
    }
}