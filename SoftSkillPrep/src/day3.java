import java.util.ArrayList;

public class day3 extends Lessons{

    public day3(Student student) {
        super("Day 3 Lessons", 7);
    }

    public boolean getLesson() {
        ArrayList qArray = new ArrayList();
        qArray.add(0, "What is software testing?");
        qArray.add(1, "Who performs testing?");
        qArray.add(2, "How is software testing done?");
        qArray.add(3, "Why is software testing required");
        qArray.add(4, "What is manual testing?Advantages-Disadvantages?");
        qArray.add(5, "What is automation testing?Advantages-Disadvantages?");
        qArray.add(6, "What to test in software testing?");
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

