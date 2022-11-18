package interviewQuestions;

public class Finra {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {

            if (i % 15 == 0)
                System.out.print("Finra ");
            else if (i % 5 == 0)
                System.out.print("Fin ");
            else if (i % 3 == 0)
                System.out.print("ra ");
            else
                System.out.print(i+" - ");
        }

    }
}

