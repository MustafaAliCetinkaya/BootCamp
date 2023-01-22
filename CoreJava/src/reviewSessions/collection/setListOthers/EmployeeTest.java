package reviewSessions.collection.setListOthers;

import lectureTasks.day36_OOP_Inheritence.scrumTask.Employee;

import java.util.*;

public class EmployeeTest {
    static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        Employee employee5 = new Employee("Adam",34,'M',"SDET",34546,110000,"CYDEO");
        Employee employee1 = new Employee("Olga",34,'F',"SDET",34546,110000,"CYDEO");
        Employee employee2 = new Employee("Florian",34,'F',"SDET",34546,110000,"CYDEO");
        Employee employee3 = new Employee("Gürhan",34,'F',"SDET",34546,110000,"CYDEO");
        Employee employee4 = new Employee("Ayşe",34,'F',"SDET",34546,110000,"CYDEO");
        Employee employee6 = new Employee("Asiye",34,'F',"SDET",34546,110000,"CYDEO");
        Employee employee7 = new Employee("Gürhan",34,'M',"SDET",34546,110000,"CYDEO");
        Employee employee8 = new Employee("Muhtar",34,'M',"SDET",34546,110000,"CYDEO");
        Employee employee9 = new Employee("Olga",34,'F',"SDET",34546,110000,"CYDEO");


        employees.addAll(Arrays.asList(employee1, employee2, employee7, employee3, employee6,
                employee4, employee8, employee9, employee5));


        List<String> uniqueNames = findUniqueNames();
        System.out.println(uniqueNames);
    }

    private static List<String> findUniqueNames() {
        Set<String> names = new HashSet<>();
        for (Employee employee : employees) {
            names.add(employee.name);
        }

        return new ArrayList<>(names);
    }
}