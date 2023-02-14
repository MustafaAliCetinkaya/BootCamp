package officeHour.quizPreparation;

public class Shape {
    public String name;
}

    class Circle extends Shape {
        public double radius;
    }

    class Main {
        public static void main(String[] args) {
            Circle c1 = new Circle();//radius, name
            Shape s1 = c1;
            s1.name = "Circle";
            System.out.println("------S1-------"+s1.name+"-------------");
            Circle c2 = (Circle) s1;
            System.out.println("------C2-------"+c2.radius+"-------------");
            c2.radius = 3.1;
            System.out.println("------C2-------"+c2.name+"-------------");
            System.out.println("------C2-------"+c2.radius+"-------------");
            Shape s2 = c2;
            System.out.println(s2.name);
            //System.out.println(s2.radius); Throws error. Since it has not radius() method.
        }
    }