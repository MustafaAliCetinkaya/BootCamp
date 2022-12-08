package officeHour;

public class Task11 {
    public static void main(String[] args) {
        System.out.println(totalMoney(2500, 0.01, 2));
    }

    public static double totalMoney(double amount, double rate, int year) {
        double totalMoney=0;
        for (int i = 1; i <=year ; i++) {
            totalMoney= amount + (amount * rate);
            amount=totalMoney;
        }
        return totalMoney;
    }
}
