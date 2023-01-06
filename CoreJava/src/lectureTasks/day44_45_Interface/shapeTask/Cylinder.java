package lectureTasks.day44_45_Interface.shapeTask;

import static lectureTasks.day44_45_Interface.shapeTask.Circle.pi;

public class Cylinder extends Shape implements Volume{

    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0){
            throw new RuntimeException("Invalid Radius: "+radius);
        }
        this.radius = radius;
    }

    public double height() {
        return radius;
    }

    public void height(double height) {
        if(radius < 0){
            throw new RuntimeException("Invalid Radius: "+height);
        }
        this.height = height;
    }


    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * pi * radius * (radius + height);
    }

    @Override
    public double perimeter() {
        return 0;
    }


    @Override
    public double volume() {
        return radius * radius * pi * height;
    }
}