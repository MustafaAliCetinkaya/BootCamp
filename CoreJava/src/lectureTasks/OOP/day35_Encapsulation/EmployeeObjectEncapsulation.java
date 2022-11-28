package lectureTasks.OOP.day35_Encapsulation;

public class EmployeeObjectEncapsulation {

        public static void main(String[] args) {

            EmployeeEncapsulation employee1 = new EmployeeEncapsulation("Tahir", 'M', 30, 120000);

            employee1.setAge(32);


            EmployeeEncapsulation employee2 = new EmployeeEncapsulation("Aygun", 'F', 31, 115000);
            employee2.setName("Elvira");
            employee2.setSalary( employee2.getSalary() + 15000 );

            System.out.println(employee1);
            System.out.println(employee2);


        }


}
