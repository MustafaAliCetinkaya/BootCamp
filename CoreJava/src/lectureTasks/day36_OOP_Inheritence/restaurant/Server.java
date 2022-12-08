package lectureTasks.day36_OOP_Inheritence.restaurant;

public class Server {
    private String name;
    private int employeeID;
    private double hourlyRate;
    private boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        setName(name);
        setEmployeeID(employeeID);
        setHourlyRate(hourlyRate);
        setFullTime(fullTime);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid Name : " + name);
            System.exit(0);
        }
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        if (employeeID <= 0) {
            System.err.println("Invalid EmployeeID: " + employeeID);
            return;
        }
        this.employeeID = employeeID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            System.err.println("Invalid HourlyRate: " + hourlyRate);
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

    public String isFull() {
        if (fullTime)
            return "full-time";

        return "part-time";
    }

    public void takeOrder() {
        System.out.println(name + " is a server and taking an order.");
    }

    public void cleanTable() {
        System.out.println(name + " is a server and taking cleaning the table.");
    }

    public String toString() {
        return "Server{" +
                "name= '" + name + '\'' +
                ", employeeID= " + employeeID +
                ", hourlyRate= " + hourlyRate +
                ", fullTime= " + isFull() +
                '}' + "\n";
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
