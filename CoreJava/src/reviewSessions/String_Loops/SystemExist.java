package reviewSessions.String_Loops;

public class SystemExist {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if (i==3) {
                break;
                //System.exit(0);
            }

            System.out.println(i);
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (j==3) {
                    break;
                }

                System.out.println(i + " _ " + j);
            }
        }

        System.out.println("after break");




    }
}
