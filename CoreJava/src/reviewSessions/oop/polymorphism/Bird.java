package reviewSessions.oop.polymorphism;

public class Bird extends Animal{

    @Override
    public void move() {
        System.out.println("Birds are flying");
    }

    public void hunt(){
        System.out.println("Birds are eating insects");
    }
}