package lectureTasks.day36_OOP_Inheritence.restaurant;

public class Chef {
    private String name;
    private int employeeID;
    private double hourlyRate;
    private boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        setName(name);
        setEmployeeID(employeeID);
        setHourlyRate(hourlyRate);
        setFullTime(fullTime);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid Name : "+name);
            System.exit(0);
        }
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        if(employeeID<=0){
            System.err.println("Invalid EmployeeID: "+employeeID);
            return;
        }
        this.employeeID = employeeID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate<0){
            System.err.println("Invalid HourlyRate: "+hourlyRate);
            return;
        }
        this.hourlyRate = hourlyRate;
    }

    public boolean getFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public String isFull(){
        if (fullTime)
            return "full-time";

        return "part-time";
    }

    public void makeOrder(){
        System.out.println(name+" is a chef and making an order.");
    }

    public void washDishes(){
        System.out.println(name+" is a chef and washing the dishes.");
    }


    public String toString() {
        return "Chef{" +
                "name= '" + name + '\'' +
                ", employeeID= " + employeeID +'\'' +
                ", hourlyRate= " + hourlyRate +'\'' +
                ", fullTime= " + isFull() +
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
