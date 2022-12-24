package officeHour.recapBySolvingProblems;

public class Task5 {
    public static void main(String[] args) {
        String mail [] = {"Harold" , "Jack", "Ahmet", "Sakushi"};

        for (String s : mail) {
            System.out.println(s + "@gmail.com");
        }
        System.out.println("---------------------------------");
        String[] name = {"Harold8000", "Jack3000", "Ahmet6000", "Sakushi7000"};
        int total=0;
        for (String each : name) {
            total+=Integer.parseInt(each.substring(each.length()-4));
        }
        System.out.println(total);
    }
}
