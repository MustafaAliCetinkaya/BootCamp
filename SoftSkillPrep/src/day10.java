import java.util.ArrayList;

public class day10 extends Lessons{

    public day10(Student student) {
        super("Day 9 Lessons", 4);
    }

    public boolean getLesson() {
        ArrayList qArray = new ArrayList();
        qArray.add(0, "Tell me about your daily stand up meeting.");
        qArray.add(1, "What does BurnDown chart report?");
        qArray.add(2, "What do you talk in daily stand ups?");
        qArray.add(3, "Who joins daily stand up meeting?");

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


