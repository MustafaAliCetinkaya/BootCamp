package MentorPractices;

public class Practice1 {
    public static void main(String[] args) {
        int year=1491;
        String first="IN ";
        String second=" COLUMBUS SAILED THE OCEAN BLUE";
        System.out.println(first+year+second);
        year++;
        System.out.println(year);//Result: 1492
        System.out.println(first+year+second);
        ++year;
        System.out.println(year);//Result: 1493
        System.out.println(first+year+second);
    }
}
