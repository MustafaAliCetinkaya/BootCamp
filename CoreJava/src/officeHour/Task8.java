package officeHour;

public class Task8 {
    public static void main(String[] args) {
        int[][] table = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        int sum = 0;
        for (int[] ints : table) {
            for (int each : ints) {
                sum += each;
            }
        }
        System.out.println(sum);
    }
}
