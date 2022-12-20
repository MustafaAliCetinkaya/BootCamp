package lectureTasks.day40_FinalKeyword;

import lectureTasks.day39_Encapsulation_Inheritence.shapes.Circle;
import lectureTasks.day39_Encapsulation_Inheritence.shapes.Square;

public class EncapsulationReview {

    private Circle circle;

    private Square square;

    public Circle getCircle(){
        return circle;
    }

    public  void setCircle(Circle circle){

        if(circle.getRadius() < 5){
            return;
        }

        this.circle = circle;
    }


    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }


}
