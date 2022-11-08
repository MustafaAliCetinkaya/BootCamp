package lectureTasks.day23_Methods;

public class TaskNumbers {
    public static void main(String[] args) {
        numbers(0);
    }

    public static void numbers(int number) {
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("Your number is positive and even.");
            } else {
                System.out.println("Your number is positive and odd.");
            }
        } else if (number == 0) {
            System.out.println("Your number is zero. It is neutral and even.");
        } else {
            if (number % 2 == 0) {
                System.out.println("Your number is negative and even.");
            } else {
                System.out.println("Your number is negative and odd.");
            }
        }
    }
}
