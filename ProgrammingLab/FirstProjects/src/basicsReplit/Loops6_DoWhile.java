package basicsReplit;

public class Loops6_DoWhile {
    public static void main(String[] args) {
        int number=1;

        do {
            System.out.println("Merhabalar\n");//koşul sağlamasa bile en az bir defa kodu çalıştırır. Number 10 dan küçük ama önce yazdı sonra baktı kaç olduğuna.
        } while(number>10);

        do {
            System.out.println("Kaç kere yazdı?");
            number++;
        } while(number<5);
    }

}
