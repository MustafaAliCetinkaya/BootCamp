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
        WebElement box=Driver.getDriver ().findElement (By.xpath ("//input[@id='twotabsearchtextbox']"));
        //WebElement int, String gibi değişken atamak gibidir. Box isimli variable oluşturdum. Artık box içinde kısaca istediğimi yapabilirim.
        box.sendKeys ("game chair with massager");//Yazı eklemek selenium da sendKeys ile yapılır
        WebElement find=Driver.getDriver ().findElement (By.id ("nav-search-submit-button"));
        find.click ();

        Driver.getDriver ().navigate().to ("https://www.amazon.com/PC-Gaming-Chair-Ergonomic-Recliner/dp/B084KQG75K/ref=sr_1_2?crid=KKV8H5I61R05&keywords=game+chair+with+massager&qid=1664866320&qu=eyJxc2MiOiI2LjIyIiwicXNhIjoiNS41MCIsInFzcCI6IjQuMDkifQ%3D%3D&sprefix=game+chair+with+massager%2Caps%2C1252&sr=8-2");
        WebElement thing=Driver.getDriver ().findElement (By.id ("submit.add-to-cart-announce"));
        thing.click ();

        Driver.getDriver ().navigate ().to ("https://www.amazon.com/2XL-Spoke-2-0-Ear-Earbuds/dp/B07YZSB2Z8/ref=sr_1_7?crid=U70IDTW4PNWQ&keywords=kulakl%C4%B1k&qid=1664680534&sprefix=kulakl%C4%B1k%2B%2Caps%2C225&sr=8-7&th=1");
        WebElement addToCart =Driver.getDriver ().findElement (By.xpath ("//input[@id='add-to-cart-button']"));
        //id bilgisini cssSelektör ile de kullanırız ama başına kare işareti koymak lazım. Aynı şeyi className de de yaparız o zmanda başına nokta koyuyoruz.
        addToCart.click ();

        WebElement check=Driver.getDriver ().findElement (By.xpath ("//input[@name='proceedToRetailCheckout']"));
        check.click ();

        WebElement login=Driver.getDriver ().findElement (By.id ("ap_email"));
        login.sendKeys ("macetinkaya@hotmail.com");
        WebElement cont=Driver.getDriver ().findElement (By.id ("continue"));
        cont.click ();

        //findElements kullansaydık aynı isimde sayfada ne varsa listeye eklerdi. WebElement kullanılamaz. List<WebElement> yöntemi kullanılır. Herkesi bulacağı için list yöntemi kullanılmalıdır.
        List<WebElement> allLinks=Driver.getDriver ().findElements (By.tagName ("a"));//a tagını taşıyan herşeyi bulacağı için list yöntemini ve "findElements" özelliğini kullandık.
        for (WebElement element:allLinks){//foreach yöntemiyle listede olan herşeyi alt alta yazdıracağız. Direk listeyi yazdırsan yanyana aynı kümede yazar.
            System.out.println (element.getText ());
        }

    }
}/*X-Path: "array gibi kullanılır" + "webelement içindeki yazıya göre bulur" + "bilgi türü farketmeksizin bunu içine yazılabilir".
CssSelector: "id, class gibi bilgileri bunun içine yazarak da aratabiliriz. Başlarına #, nokta filan konularak bunu yapabiliyoruz.
Css kodlarında bu ön işaretler zaten kodlara eklenmiş oluyor. Bunları kopyala yapıştır olarak kolayca ekleyebiliyoruz. Kolaylığı bu zaten
İki tane class adı olanları className locater ı ile bulmazyız ama Css ile buluruz. Class içinde arasında boşluk olan kelimeler birer ayrı class dır.
XPATH nasıl kullanılır:

By.xpath("...."); diğerleri gibi bunun içini dolduracağız. Dışarda zaten çit tırnak olduğu için içerdeki tırnaklar teke düşer yoksa hata verir.
1- //tagName[@attribute='içindeki değer']
2- //tagName[.='içindeki değer']
3- //tagName[@attribute='içindeki değer' or @attribute2='içindeki diğer değer2']---> Burada or yerine and de kullanılabilir.
4- //*[.='içindeki yazı']
5- //*[contains(text() , 'İçerdeki kelime')]


*/

