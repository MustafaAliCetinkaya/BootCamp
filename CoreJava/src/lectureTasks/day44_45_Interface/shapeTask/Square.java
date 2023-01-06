package lectureTasks.day44_45_Interface.shapeTask;

public class Square extends Shape{

    private double side;

    public Square( double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
          throw new RuntimeException("Invalid Side: "+side);
        }
        this.side = side;
    }


    public double area() {
        return side * side;
    }

    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString()+//We called the toString method of the parent class.
                "side=" + side +
                '}';
    }


}