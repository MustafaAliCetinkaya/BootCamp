package reviewSessions.string_Loops;

public class LordOfStar {
    public static void main(String[] args) {
        String star = "*";
        for (int i = 1; i <= 5; i++) {
            System.out.println(star.repeat(7));
        }
        System.out.println("--------------------------------");
        for (int i = 0; i <= 27; i++) {
            if(i%7==0)
                System.out.println();
            System.out.print("*");
        }

        }
    }

