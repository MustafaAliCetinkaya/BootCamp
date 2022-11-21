package lectureTasks.day33_Static;

public class Task1_CydeoStudent {
public int age, id, batchNumber, groupNumber;
public String name;
public char gender, grade;
public static String schoolName="Legendary Cydeo";
public static String programmingLanguage="Java";

    public Task1_CydeoStudent(int age, int id, int batchNumber, int groupNumber, String name, char gender, char grade) {
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }

    public void study(){
        System.out.println(name+" is studying regularly");
    }
    public void attendClass(){
        System.out.println(name+" attends the class constantly");
    }
    public static void printSchoolName(){
        System.out.println(schoolName+" is not only a school, but also it is a safe house for every student.");
    }

    public String toString() {
        return "Task1_CydeoStudent{" +"\n"+
                "age=" + age +"\n"+
                ", id=" + id +"\n"+
                ", batchNumber=" + batchNumber +"\n"+
                ", groupNumber=" + groupNumber +"\n"+
                ", name='" + name + '\'' +"\n"+
                ", gender=" + gender +"\n"+
                ", grade=" + grade +"\n"+
                "Name of the programming language='" + programmingLanguage + '\'' +"\n"+
                '}';
    }

    public static void printProgLanguage(){
        System.out.println(programmingLanguage+" is the best coding language so it is our course language.");
    }
}
/*1. CydeoStudent Task
1. Create a class named CydeoStudent:
Attributes:
instances: name, age,
gender, id, grade, batchNumber, groupNumber
statics: schoolName,
programmingLanguage
Add a constructor that can set All the
fields (instances)
Actions:
study()
attendClass()
printSchoolName(): displays
the school name
printProgLanguage():
displays the name of programming language
toString()*/
