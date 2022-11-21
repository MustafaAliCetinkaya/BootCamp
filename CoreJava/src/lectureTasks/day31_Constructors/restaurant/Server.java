package lectureTasks.day31_Constructors.restaurant;

public class Server {
    String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
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

    public void takeOrder(){
        System.out.println(name+" is a server and taking an order.");
    }

    public void cleanTable(){
        System.out.println(name+" is a server and taking cleaning the table.");
    }

    public String toString() {
        return "Server{" +
                "name= '" + name + '\'' +
                ", employeeID= " + employeeID +
                ", hourlyRate= " + hourlyRate +
                ", fullTime= " + fullTime() +
                '}'+"\n";
    }
}


/*  Restaurant Task:
6.1  Create a class called Server
Attributes:
                name (String), employeeID (int),
hourlyRate (double), fullTime (boolean)
Add A constructor that can set all the fields
        Actions: (all void methods)
            takeOrder(): server's name + "is taking an
order"
            cleanTable(): server's name + "is cleaning
the table"
            toString(): Returns (String) all the
information of a Server
                -> Extra: For fullTime status,
instead of printing a boolean value, print "full-time" or "part-time"
*/
