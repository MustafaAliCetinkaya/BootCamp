package oblectOrientedProgramming.oblectOrientedProgramming2;

public class Main {
    public static void main(String[] args) {
        StudentRegistration addDropStudent=new StudentRegistration();
        System.out.println("Number of the students: "+addDropStudent.numberOfStudent);
        addDropStudent.AddStudent();
        addDropStudent.AddStudent();
        addDropStudent.AddStudent();
        System.out.println("Number of the students: "+addDropStudent.numberOfStudent);
        addDropStudent.DropStudent();
        System.out.println("Number of the students: "+addDropStudent.numberOfStudent);

    }
}
