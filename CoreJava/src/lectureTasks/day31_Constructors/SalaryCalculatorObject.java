package lectureTasks.day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class SalaryCalculatorObject {
    public static void main(String[] args) {
        ArrayList<SalaryCalculator> salaryList = new ArrayList<>();


            SalaryCalculator salary1 = new SalaryCalculator(12, 0.08, 0.18, 40);
            SalaryCalculator salary2 = new SalaryCalculator(34, 0.6, 0.14, 32);
            SalaryCalculator salary3 = new SalaryCalculator(23, 0.2, 0.12, 28);
            salaryList.addAll(Arrays.asList(salary1,salary2,salary3));


        System.out.println(salaryList);

    }
}
