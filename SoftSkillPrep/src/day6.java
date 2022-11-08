
import java.util.ArrayList;

public class day6 extends Lessons{

    public day6(Student student) {
        super("Day 6 Lessons", 4);
    }

    public boolean getLesson() {
        ArrayList qArray = new ArrayList();
        qArray.add(0, "What do you know about the waterfall method?");
        qArray.add(1, "Did you work in a agile team? What are the things you liked about Agile?");
        qArray.add(2, "What is your software management method?Which methodology did you follow?");
        qArray.add(3, "Agile or Waterfall?Which one do you prefer?");


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


