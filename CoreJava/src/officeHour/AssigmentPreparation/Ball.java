package officeHour.AssigmentPreparation;
public class Ball {
    boolean canBounce;
    String color;
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.color="yellow";
        String color;//Trick
        color= "red";//Not the color of ball
        System.out.print(ball.color);
    }
}
