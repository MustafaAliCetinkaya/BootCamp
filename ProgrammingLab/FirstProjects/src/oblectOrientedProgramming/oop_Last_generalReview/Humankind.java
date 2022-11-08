package oblectOrientedProgramming.oop_Last_generalReview;

public class Humankind {
    String name;
    String titlePosition;
    int age;
    int weight;
    int salary;

    void food(){
        weight++;
    }

    void salaryIncrease(int rate){//istediğimiz oranda metot yardımıyla artırabileceğiz.
        salary= salary+salary*rate/100;
    }

    void getOlder(){
        age++;
    }


}
