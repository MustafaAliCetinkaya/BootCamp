package lectureTasks.day33_Static;

import java.util.Arrays;

public class Task1_Test {
    public static void main(String[] args) {
        Task1_CydeoStudent student1 = new Task1_CydeoStudent(36, 345, 10, 7, "Emin", 'M', 'A');
        Task1_CydeoStudent student2 = new Task1_CydeoStudent(23, 545, 11, 23, "Ayla", 'F', 'C');
        Task1_CydeoStudent student3 = new Task1_CydeoStudent(18, 875, 6, 12, "Deniz", 'M', 'B');
        Task1_CydeoStudent[] students = {student1, student2, student3};

        System.out.println(Task1_CydeoStudent.schoolName);
        System.out.println(Task1_CydeoStudent.programmingLanguage);
        System.out.println("-----------------------------------------------");
        Task1_CydeoStudent.printSchoolName();
        Task1_CydeoStudent.printProgLanguage();
        System.out.println("-----------------------------------------------");
        for (Task1_CydeoStudent each : students) {
            if(each.grade=='B'||each.grade=='A')
                each.study();
            if (each.groupNumber==7)
                each.attendClass();
        }
        System.out.println("-----------------------------------------------");
        System.out.println(Arrays.toString(students));

    }
}
