package lectureTasks.day39_Encapsulation_Inheritence.scrumTask;


public class Employee extends Person {  // Employee IS A Person

    private String jobTitle;
    private int id;
    private double salary;
    private String companyName;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("Invalid jobTitle: "+jobTitle);
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id <=0){
            System.err.println("Invalid id: "+id);
            System.exit(1);
        }
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary <=0){
            System.err.println("Invalid salary: "+salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if(jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("Invalid jobTitle: "+jobTitle);
            System.exit(1);
        }
        this.companyName = companyName;
    }

    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        setJobTitle(jobTitle);
        setId(id);
        setSalary(salary);
        setCompanyName(companyName);
    }

    public void work(){
        System.out.println(jobTitle+" "+getName() + "is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }


}


/*
name, gender, age, jobTitle, id, salary, companyName
 work(), toString()
 */
