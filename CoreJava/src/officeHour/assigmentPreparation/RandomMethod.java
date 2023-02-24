package officeHour.assigmentPreparation;

import java.util.Random;

public class RandomMethod {
    public static void main(String[] args) {
        Random random=new Random();

        for (int i = 0; i < 5; i++) {
            int randomNumber=random.nextInt(100);
            System.out.println("random = " + randomNumber);
        }
    }
}
