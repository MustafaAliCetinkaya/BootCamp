package extraTasks;
/*1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
        grade level and types are:
        1-5: Elementary school
        6-8: Middle school
        9-12: High school
        13-16: College
        17-18: Grad School

        For Any Other grade: Invalid grade level given*/
public class GradeLevel {
    public static void main(String[] args) {
        byte gradeLevel=8;
        if (1<=gradeLevel&&gradeLevel<=18){
            if(17<=gradeLevel){
                System.out.println("Grad School");
            } else if (13<=gradeLevel) {
                System.out.println("College");
            } else if (9<=gradeLevel) {
                System.out.println("High school");
            } else if (6<=gradeLevel) {
                System.out.println("Middle school");
            }else {
                System.out.println("Elementary school");
            }

        }else {
            System.out.println("Invalid");
        }
    }
}
