import java.util.ArrayList;

public class day5 extends Lessons{

    public day5(Student student) {
        super("Day 5 Lessons", 5);
    }

    public boolean getLesson() {
        ArrayList qArray = new ArrayList();
        qArray.add(0, "What are the testing levels / Testing hierarchy?");
        qArray.add(1, "What are the testing levels / Testing hierarchy?");
        qArray.add(2, "What is Integration Testing? Who performs it? In which Environment?");
        qArray.add(3, "What is System Testing? Who performs it? In which Environment?");
        qArray.add(4, "What is User Acceptance Testing (UAT)? Who performs it? In Which Environment? ");

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


