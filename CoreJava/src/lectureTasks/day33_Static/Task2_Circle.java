package lectureTasks.day33_Static;

public class Task2_Circle {
    public double radius;
    public double diameter=radius*2;
    public static double pi=Math.PI;

    public Task2_Circle(double radius) {
        this.radius = radius;
        this.diameter = radius*2;
    }

    public double calcArea(){
        return pi*Math.pow(radius,2);
    }

    public double calcPerimeter(){
        return 2*diameter;
    }

    public String toString() {
        return "Task2_Circle{" +
                "radius= " + radius + "\n"+
                ", diameter= " + diameter +"\n"+
                ", pi= " + pi +"\n"+
                ", Area of the circle= " + calcArea() +"\n"+
                ", Perimeter of the circle= " + calcPerimeter() +"\n"+
                '}';
    }
}
/*2. Circle Task:
1. Create a class named Circle:
Attributes:
instance: radius, diameter
static: pi
Add a constructor that can set All the
fields (instances)
HINT: we only need to know
the radius to set the radius & diameter
Actions:
calcArea(): returns the area
of Circle
calcPerimeter(): returns the
perimeter of Circle
printPi(): displays PI value
toString(): displays the
radius, diameter, pi, area and perimeter of the circle when the object of
circle is passed in the print statement*/
