import java.util.ArrayList;

public class day1 extends Lessons {
    public day1(Student student) {
        super("Day 1 Lessons", 6);
    }





    public boolean getLesson() {
        ArrayList qArray = new ArrayList();
        qArray.add(0, "What are the application software types ?");
        qArray.add(1, "What are the three layers of software?");
        qArray.add(2, "Who works in the business department?");
        qArray.add(3, "Can you give several examples of the functionalities in any software?");
        qArray.add(4, "Can you give several examples of the non-functionalities in any software?");
        qArray.add(5, "What type of tester will you be after the Cydeo-SDET course?");
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
