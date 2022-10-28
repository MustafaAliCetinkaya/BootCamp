import java.util.ArrayList;

public class day9 extends Lessons{

    public day9(Student student) {
        super("Day 9 Lessons", 4);
    }

    public boolean getLesson() {
        ArrayList qArray = new ArrayList();
        qArray.add(0, "Who joins sprint planning?");
        qArray.add(1, "What is a sprint backlog?");
        qArray.add(2, "What is team capacity?");
        qArray.add(3, "What is DOR?");

        String answer = "";
        do {
            for (int i = 0; i < lessonLenght; i++) {

                System.out.println((i + 1) + ". question:");
                System.out.println(qArray.get(i));
                System.out.println();
                System.out.println("Please enter \"Y\" for the next question.");
                System.out.println("Please enter \"E\" for the main page. ");

                answer = scan.next().toLowerCase();
                while (!(answer.equals("y") || answer.equals("e") )) {
                    System.out.println("Invalid entry,please try again.");
                    answer = this.scan.next().toLowerCase();
                }
                if (answer.equals("e")) break;

                System.out.println("------------------------------------------");


            }
        } while (answer.equals("y"));


        return true;


    }
}


