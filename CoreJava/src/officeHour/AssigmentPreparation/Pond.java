package officeHour.AssigmentPreparation;

public class Pond {
/*    public static void main(String[] args) {
        Water w=new Water("red");
        Pond p=new Pond("yellow");
        System.out.println(w.color);

    }*/
    static Water water;
    /* line 5 */  public Pond (String color){

        water = new Water (color);
    }
}
class Water {
    String color;
    public Water(String color) {
        this.color = color;
    }
}
