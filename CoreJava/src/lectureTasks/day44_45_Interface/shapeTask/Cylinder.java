package lectureTasks.day44_45_Interface.shapeTask;

public class Cylinder extends Shape implements Volume{



    public Cylinder(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }


    @Override
    public double volume() {
        return 0;
    }
}