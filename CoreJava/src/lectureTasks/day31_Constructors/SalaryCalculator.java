package lectureTasks.day31_Constructors;

public class SalaryCalculator {
    double hourlyRate, stateTaxRate,federalTaxRate, weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        double salary=hourlyRate * weeklyHours * 52;
        return salary;
    }

    public double stateTax(double salary){
        double stateTax=salary * stateTaxRate;
        return stateTax;
    }

    public double federalTax(double salary){
        double federalTax=salary * federalTaxRate;
        return federalTax;
    }

    public double salaryAfterTax(double salary,double federalTax, double stateTax){
        double salaryAfterTax=salary - (federalTax + stateTax);
        return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator {" +
                " salary= $" + salary() +
                " stateTax= $" + stateTax(salary()) +
                " federalTax= $" + federalTax(salary()) +
                " salaryAfterTax= $" + salaryAfterTax(salary(),federalTax(salary()),stateTax(salary())) +
                '}'+"\n";
    }
}
/*1. SalaryCalculator Task:
1.1 Create a class named Salary calculator:
        Attributes:
            hourlyRate, stateTaxRate,
federalTaxRate, weeklyHours
            Add a constructor to set all the fields
        Actions:
            salary(): calculates the salary (
hourlyRate * weeklyHour * 52)
            stateTax(): calculates the
totalStateTax
            federalTax(): calculates the
total federal tax
            salaryAfterTax(): calculates the
salary after tax
            toString(): displays the salary,
stateTax, federalTax, salaryAfterTax of the Object*/
