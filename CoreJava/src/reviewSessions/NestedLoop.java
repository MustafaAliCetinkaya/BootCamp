package reviewSessions;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <9 ; j++) {
                for (int k = 0; k <j ; k++) {
                    System.out.print(j+" ");
                }

            }System.out.println();

        }

    }
}