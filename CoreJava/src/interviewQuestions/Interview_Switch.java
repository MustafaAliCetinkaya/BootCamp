package interviewQuestions;

public class Interview_Switch {
    public static void main(String[] args) {
        int value = 0;
        value += 5;

        switch (value) {
            case 5:
                System.out.print("Hello");
            case 10:
                System.out.print("World");
                break;
            default:
                System.out.print("Java");
        }
    }
}
