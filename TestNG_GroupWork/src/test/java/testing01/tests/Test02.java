package testing01.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testing01.utilities.Driver;

import java.util.List;

public class Test02 {
    @Test
    public void testingSites() {
        Driver.getDriver ().get ("https://amazon.com/");
        WebElement box=Driver.getDriver ().findElement (By.id ("twotabsearchtextbox"));
        //WebElement int, String gibi değişken atamak gibidir. Box isimli variable oluşturdum. Artık box içinde kısaca istediğimi yapabilirim.
        box.sendKeys ("Macbook 16 GB  RAM");//Yazı eklemek selenium da sendKeys ile yapılır

        Driver.getDriver ().navigate ().to ("https://www.amazon.com/2XL-Spoke-2-0-Ear-Earbuds/dp/B07YZSB2Z8/ref=sr_1_7?crid=U70IDTW4PNWQ&keywords=kulakl%C4%B1k&qid=1664680534&sprefix=kulakl%C4%B1k%2B%2Caps%2C225&sr=8-7&th=1");
        WebElement addToCart =Driver.getDriver ().findElement (By.id ("add-to-cart-button"));//id bilgisini cssSelektör ile de kullanırız ama başına kare işareti koymak lazım. Aynı şeyi className de de yaparız o zmanda başına nokta koyuyoruz.
        addToCart.click ();

        WebElement cart=Driver.getDriver ().findElement (By.id ("nav-cart"));
        cart.click ();

        //findElements kullansaydık aynı isimde sayfada ne varsa listeye eklerdi. WebElement kullanılamaz. List<WebElement> yöntemi kullanılır. Herkesi bulacağı için list yöntemi kullanılmalıdır.
        List<WebElement> allLinks=Driver.getDriver ().findElements (By.tagName ("a"));//a tagını taşıyan herşeyi bulacağı için list yöntemini ve "findElements" özelliğini kullandık.
        for (WebElement element:allLinks){//foreach yöntemiyle listede olan herşeyi alt alta yazdıracağız. Direk listeyi yazdırsan yanyana aynı kümede yazar.
            System.out.println (element.getText ());
        }

    }
}
