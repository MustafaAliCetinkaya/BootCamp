import java.util.ArrayList;

public class day4 extends Lessons{

    public day4(Student student) {
        super("Day 4 Lessons", 3);
    }

    public boolean getLesson() {
        ArrayList qArray = new ArrayList();
        qArray.add(0, "What is whitebox testing?");
        qArray.add(1, "What is blackbox testing?");
        qArray.add(2, "What is graybox testing?");

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


