import java.util.ArrayList;

public class day2 extends Lessons{

    public day2(Student student) {
        super("Day 2 Lessons", 6);
    }

    public boolean getLesson() {
        ArrayList qArray = new ArrayList();
        qArray.add(0, "What does SDLC stand for?");
        qArray.add(1, "What are the steps of the SDLC?");
        qArray.add(2, "What is PO's responsibilities?");
        qArray.add(3, "What is Designer's responsibilities");
        qArray.add(4, "What are SRS and SDS?");
        qArray.add(5, "Who is the client?");
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
