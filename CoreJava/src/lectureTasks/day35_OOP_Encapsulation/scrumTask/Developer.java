package lectureTasks.day35_OOP_Encapsulation.scrumTask;

public class Developer {

    private String name;
    private int employeeID;
    private char gender;
    private String jobTitle;
    private double salary;

    public Developer(String name, int employeeID, char gender, String jobTitle, double salary) {
        setName(name);
        setEmployeeID(employeeID);
        setGender(gender);
        setJobTitle(jobTitle);
        setSalary(salary);
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        gender = (""+gender).toUpperCase().charAt(0);
        if(!(gender == 'M' || gender == 'F') ){
            System.err.println("Invalid Gender :"+gender);
            return;
        }
        this.gender = gender;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.err.println("Invalid Salary: $"+salary);
            return;
        }
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +'\'' +
                ", gender=" + gender +'\'' +
                ", jobTitle='" + jobTitle + '\'' +'\'' +
                ", salary= $" + ((salary==0)? "Free":""+salary) +'\'' +
                '}';
    }

    public void coding(){
        System.out.println(name+ " is coding");
    }

    public void unitTesting(){
        System.out.println(name+ " is performing the unit testing");
    }

    public void fixingBug(){
        System.out.println(name+ " is fixing bug");
    }



}

/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fileds

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()
 */
