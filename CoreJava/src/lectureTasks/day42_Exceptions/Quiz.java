package lectureTasks.day42_Exceptions;

public class Quiz {

    static int a = 50;
    static int b = 950;

    public static void main(String[] args) {
        System.out.println(b);
        b=111;
        System.out.println(b);
        System.out.println("------------------");
        System.out.println("0. attempt: "+a);
        a=380;
        System.out.println("1. attempt: "+a);
        try {
            System.out.println("2. attempt: "+a);
            a = 200;
            System.out.println("3. attempt: "+a);

        } catch (Exception e) {//Will not work. Since we do not have problem
            System.out.println("4. attempt: "+a);
            a = 300;
            System.out.println("5. attempt: "+a);

        } finally {
            System.out.println("6. attempt: "+a);
            a = 400;
            System.out.println("7. attempt: "+a);
        }
        System.out.println("8. attempt: "+a);
    }


    static {
        a = 500;
    }

  /*  public static void main(String[] args) throws InterruptedException {
        pause1(); //line 1
        pause2(); //line 2
    }
    public static void pause1() {
        try {
            Thread.sleep(3000); //checked exception }catch (InterruptedException e)
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void pause2() throws InterruptedException{
        Thread.sleep(3000); //checked exception
    }*/
}
