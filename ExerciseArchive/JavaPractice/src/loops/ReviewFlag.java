package loops;

public class ReviewFlag {
    public static void main(String[] args) {
        int number=0;
        boolean flag=true;

        while (flag){

            System.out.println (number++);

            if (number>100)
                flag=false;
        }
    }
}
