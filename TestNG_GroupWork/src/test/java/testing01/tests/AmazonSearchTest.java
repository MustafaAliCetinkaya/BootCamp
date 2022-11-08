package testing01.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import testing01.pages.AmazonPage;
import testing01.utilities.Driver;

public class AmazonSearchTest {
    AmazonPage pageObject = new AmazonPage ();

    @Test
    public void searchTest() {
        Driver.getDriver ().get ("https://amazon.com/");
        pageObject.search.sendKeys ("Apple iPhone 12, 64GB, Purple - Unlocked (Renewed)"+ Keys.ENTER);
   /* Artık aşağıdaki işlem yerine yeni yöntemle AmazonPage de oluşturduğum metodu burada çağırarak daha kısa şekilde
    nesne oluşturarak, nesne içindeki Webelementi istediğimiz yerde ve istediğimiz kadar kullanırız. Locator yazıp durmaktan kurtulduk.
    Page Object Model-POM tam da budur işte.
    WebElement box=Driver.getDriver ().findElement (By.xpath ("//input[@id='twotabsearchtextbox']"));
    box.sendKeys ("game chair with massager");//Yazı eklemek selenium da sendKeys ile yapılır
*/
        Driver.getDriver ().findElement (By.xpath ("(//h2)[1]/a/span"));
        Driver.getDriver ().findElement (By.id ("submit.add-to-cart-announce")).click ();

 /*       pageObject.searchbox.sendKeys ("game chairs"+ Keys.ENTER);*/
   pageObject.searchbox ("game chairs"+Keys.ENTER); /*normalde daha kısa diye bunu çağıracaktık ama hata verdi*/
    }
}
