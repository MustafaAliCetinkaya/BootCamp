package lectureTasks.day31_Constructors.restaurant;

public class Chef {
    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public String fullTime(){
        if (fullTime)
            return "full-time";

        return "part-time";
    }

    public void makeOrder(){
        System.out.println(name+" is a chef and making an order");
    }

    public void washDishes(){
        System.out.println(name+" is a chef and washing the dishes");
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name= '" + name + '\'' +
                ", employeeID= " + employeeID +
                ", hourlyRate= " + hourlyRate +
                ", fullTime= " + fullTime() +
                '}'+"\n";
    }
}
/*6.2 Create a class called Chef
            Attributes:
                name (String),
employeeID (int), hourlyRate (double), fullTime (boolean)
   Add A constructor that can set all the
fields
            Actions: (all void methods)
                makeOrder(): chef's
name + "is making an order"
                washDishes(): chef's
name + "is washing the dishes"
                toString(): Returns
(String) all the information of a Chef
                    -> Extra: For
fullTime status, instead of printing a boolean value, print "full-time" or
"part-time"*/
