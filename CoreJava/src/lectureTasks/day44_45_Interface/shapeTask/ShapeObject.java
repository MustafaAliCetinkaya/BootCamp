package lectureTasks.day44_45_Interface.shapeTask;

public class ShapeObject {
    public static void main(String[] args) {
        Cube cube1 = new Cube(12);
        System.out.println(cube1);
        System.out.println("---------------------------");
        System.out.println(
                cube1.perimeter() + "\n" +
                        cube1.area() + "\n" +
                        cube1.volume() + "\n" +
                        cube1.getName()
        );
        System.out.println("---------------------------");
        cube1.setSide(26);
        System.out.println(
                cube1.perimeter() + "\n" +
                        cube1.area() + "\n" +
                        cube1.volume() + "\n"+
                        cube1.getName()
        );
        System.out.println("---------------------------");
        Cube cube2 = new Cube(12);
        //cube2.setSide(-12);
        cube2.setSide(30);
        System.out.println(cube2.area() - cube1.area());
        System.out.println(cube2);
        System.out.println("---------------------------");

    }
}
