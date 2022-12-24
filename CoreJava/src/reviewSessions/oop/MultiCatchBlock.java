package reviewSessions.oop;

public class MultiCatchBlock {

    public static void main(String[] args) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {

        }

        try {

            System.out.println(9 / 0);
            Integer.parseInt("123.");
        } catch (ArithmeticException e) {
            System.out.println("You got the Arithmetic excepiton");
        } catch (NumberFormatException e) {
            System.out.println("you have a problem with your number");
        } catch (Exception e) {
            System.out.println("I don't know your exception");
        }
    }
}
