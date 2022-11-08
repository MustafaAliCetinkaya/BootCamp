import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
//Bu sırayı biz vermezsek kendisi alfabetik sıraya göre çalıştırır
    void setup() {//opening the browser and application
        System.out.println ("This is setup test. Firstly open the browser");
    }

    @Test(priority = 3)
//Yanına sıra yazdıktan sonra ekranda karışık görünebilir sorun değil. Sırayla çalışır. v
    void customerSearch() {
        System.out.println ("This is customer search test");
    }

    @Test(priority = 2)
    void addCustomer() {

        System.out.println ("This is add customer  test");
        Assert.assertEquals (1, 1);
    }

    @Test(priority = 4)
    void teardown() {
        System.out.println ("Closing browser");
    }
}
