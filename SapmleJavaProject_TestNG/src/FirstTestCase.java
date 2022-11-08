import org.testng.annotations.Test;

public class FirstTestCase {
    @Test (priority = 1)//Bu sırayı biz vermezsek kendisi alfabetik sıraya göre çalıştırır
    void setup(){//opening the browser and application

        System.out.println ("This is setup test. Firstly open the browser");
    }

    @Test (priority = 2)
    void login(){
        System.out.println ("This is login test");
    }

    @Test (priority = 3)
    void teardown(){
        System.out.println ("Closing browser");
    }
}
