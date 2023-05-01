package muhtarInterviewCodingTasks.oldVersion.oldNumber_tasks;

public class Number_ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1657));
    }

    public static int reverse(int number) {
        if (number < 10 && number >= 0) {
            return number;
        }

        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }

        return result;
    }


}
