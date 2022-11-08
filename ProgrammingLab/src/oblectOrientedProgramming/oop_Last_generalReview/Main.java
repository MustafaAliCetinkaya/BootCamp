package oblectOrientedProgramming.oop_Last_generalReview;

public class Main {
    public static void main(String[] args) {
        Teacher mustafa = new Teacher();
        Worker ali=new Worker("Ali Can","Boss");//Polymorphisim gibi oldu contructor içinden yaptığımız için.

        mustafa.weight=81;
        mustafa.age=38;
        mustafa.salary=9800;

        mustafa.food();
        mustafa.getOlder();
        mustafa.salaryIncrease(23);

        System.out.println("mustafa.weight = " + mustafa.weight);
        System.out.println("mustafa.age = " + mustafa.age);
        System.out.println("mustafa.salary = " + mustafa.salary);
        System.out.println("******************************");
        System.out.println("ali.name = " + ali.name);
        System.out.println("ali.titlePosition = " + ali.titlePosition);
        System.out.println("ali.age = " + ali.age);
        System.out.println("ali.salary = " + ali.salary);
        System.out.println("ali.weight = " + ali.weight);
    }
}
