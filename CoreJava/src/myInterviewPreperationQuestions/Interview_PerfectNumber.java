package myInterviewPreperationQuestions;

public class Interview_PerfectNumber {
    public static void main(String[] args) {
        int x = 498;
        System.out.println("isPerfect(x) = " + isPerfect(x));
    }

    public static String isPerfect(int num) {
        String resul1 = "number is perfect";
        String resul2 = "number is not perfect";
        int result = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                result += i;
            }
        }
        if (result == num) {
            return resul1;
        }
        return resul2;
    }
}
