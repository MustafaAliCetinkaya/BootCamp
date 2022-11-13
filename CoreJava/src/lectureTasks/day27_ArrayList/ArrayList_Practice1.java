package lectureTasks.day27_ArrayList;

import java.util.ArrayList;

public class ArrayList_Practice1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(12);
        numbers.add(19);
        numbers.add(56);
        numbers.add(98);
        numbers.add(123);
        numbers.add(980);
        System.out.println("First numbers = " + numbers);
        System.out.println(numbers.size());

        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i,numbers.get(i)*2);
        }
        System.out.println("New doubled numbers = " + numbers);
        System.out.println("---------------------------------------");
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");
        System.out.println(list.size());
        list.set(2, "JavaScript"); // replace
        list.set(3, "C++");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("---------------------------------------");
        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);
        System.out.println("All names: "+employees.size());

        employees.remove(0);

        System.out.println(employees);
        System.out.println("First name is removed: "+employees.size());

        employees.remove(0);

        System.out.println(employees);
        System.out.println("Second name is removed: "+employees.size());

        employees.remove(0);

        System.out.println(employees);
        System.out.println("Third name is removed: "+employees.size());

        employees.remove(1);

        System.out.println(employees);
        System.out.println("Fourth name is removed: "+employees.size());

        employees.remove( employees.size() -1 );

        System.out.println(employees);
        System.out.println("Fifth name is removed: "+employees.size());

        boolean r1 = employees.remove("Hulya");

        System.out.println(employees);

        boolean r2 = employees.remove("Neira");

        System.out.println(employees);
        System.out.println("Last name is removed: "+employees.size());
        System.out.println(employees.size());


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
    }
}
