package testing01.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testing01.utilities.Driver;
import testing01.utilities.ReusableMethods;

//Testler metot içerisinde yazılır. Her testin metotu bulunur.
public class Test01 {

    @Test//Normal metotun üzerine bu anotation konulunca, sıradan boş olmadığını, test için olduğunu Java hemn anlar
    public void openSite() {//Driver classındaki onca kod tarayıcıyı başlatmak içindi. Şimdi buradan açıp gezintiye çıkıyoruuz.
        Driver.getDriver().get("https://demo.opencart.com/");
        ReusableMethods.sleep(200);
        String header1=Driver.getDriver().getTitle();//getTitle ın türü string olduğu için bir stringe atayarak ekrana yazdırıyoruz.
        System.out.println(header1);

/*        try {//Bekleme süresini normalde burası ile uzun uzun veriyoruz. Bundan kurtulmanın yolu başka yerde metot yapıp burada çağırmak.
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        Driver.getDriver().get("https://amazon.com/");
        ReusableMethods.sleep(200);//Kısacık bu kodu daha önce başka yerde uzun uzun yazdığımız için yapabildik.
        String header2=Driver.getDriver().getTitle();
        System.out.println(header2);

        Driver.getDriver ().navigate ().refresh ();//İleri-geri-tazele ve URL değiştir seçenekleri bulunmaktadır.
        ReusableMethods.sleep(200);
        Driver.getDriver ().navigate ().to ("https://tureng.com/tr/turkce-ingilizce");
        String header3=Driver.getDriver().getTitle();
        System.out.println(header3);

        Driver.getDriver ().navigate ().back ();
        Driver.getDriver ().navigate ().refresh ();
        Driver.getDriver ().navigate ().back ();
        //Driver.closeDriver();//Bu metotun içinde quit metotu var. Açık olan "TÜM sekmelerle birlikte HEPSİNİ kapatır.
        //Driver.getDriver().close(); sadece aktip açık olan pencere kapatılır. "Diğer sekmeler açık" kalır. Bu sistemin kendinde tanımlıdır.

    }
//Navigate ile get arasında farklar var: Get ile geçmişe ve çerezlere sahip değiliz. Bu nedenle hemen yükler.  Navigatte geçmiş ve çerez olduğu için daha uzun sürede yüklenir.

    @Test
    public void searchtest(){
        Driver.getDriver().get("https://amazon.com/");
        WebElement serachBox=Driver.getDriver ().findElement (By.id ("twotabsearchtextbox"));
        serachBox.sendKeys ("game chairs");//Yazı eklemek selenium da sendKeys ile yapılır

        Driver.getDriver ().findElement (By.xpath ("//*[@id=\"nav-search-submit-button\"]")).click ();
        Driver.getDriver ().findElement (By.xpath ("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div/div[2]/div[2]/h2/a")).click ();
        Driver.getDriver ().findElement (By.xpath ("//*[@id=\"add-to-cart-button\"]")).click ();

        Driver.getDriver ().navigate ().to ("https://www.amazon.com/Mkeke-iPhone-14-Yellowing-Shockproof/dp/B0BB5HBHGN/ref=sr_1_1_sspa?crid=10UE02VLMC5A0&keywords=iphone+14+pro+max+case&qid=1665244651&qu=eyJxc2MiOiI4LjQzIiwicXNhIjoiNy43NCIsInFzcCI6IjcuMDgifQ%3D%3D&sprefix=iphone+%2Caps%2C1876&sr=8-1-spons&psc=1&smid=A2PIEPXJBOJ7WG&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUFXN0tLWENURTJWVTkmZW5jcnlwdGVkSWQ9QTAwNTc1NjAyMTVTWFhHNTM0MURRJmVuY3J5cHRlZEFkSWQ9QTAzNjcyNTM4R1JCQ0lYSThTMEImd2lkZ2V0TmFtZT1zcF9hdGYmYWN0aW9uPWNsaWNrUmVkaXJlY3QmZG9Ob3RMb2dDbGljaz10cnVl");
        Driver.getDriver ().findElement (By.xpath ("//*[@id=\"add-to-cart-button\"]")).click ();
        Driver.getDriver ().findElement (By.xpath ("//*[@id=\"nav-cart-count\"]")).click ();

        Driver.getDriver ().findElement (By.xpath ("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click ();
        Driver.getDriver ().findElement (By.xpath ("//*[@id=\"ap_email\"]")).sendKeys ("deneme007@gmail.com");

        Driver.getDriver ().findElement (By.xpath ("//*[@id=\"continue\"]")).click ();
        Driver.getDriver ().findElement (By.xpath ("//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/div[3]/div/a/span")).click ();
        Driver.getDriver ().findElement (By.xpath ("//*[@id=\"ap-other-signin-issues-link\"]")).click ();

        ReusableMethods.sleep(2000);//Kısacık bu kodu daha önce başka yerde uzun uzun yazdığımız için yapabildik.

        /*        WebElement mouse=Driver.getDriver ().findElement (By.xpath ("//*[@id=\"add-to-cart-button\"]"))
            String tagName=mouse.getText ();//Oradaki yazıyı kopyalamak ise getText ile yapılır.
            System.out.println (tagName);*/

/*
        List<WebElement> links=Driver.getDriver().findElements(By.tagName ("a"));//BüTün linklerli bir liste içine attık ve aşağıda bu listeyi bastıracağız:
        for (WebElement element:links){
            System.out.println (element.getText ());
        }
*/

        Driver.getDriver().close();//Kapatma talimatı.
    }
}
/*8 farlı locator vardır. İncele deyince kosunu gördüğümüz herşey web elemntidir ve kodlarından bunları bulabiliriz.
1- id (kimlik numarası gibidir, direk çıkar)
2- name (aynı isimde başka elemnt çıkabilir, daha özele inmek gerekebilir)
3- className
4- tagName
5- linkText (linkin bütününü kullanarak buluruz, üzerine tıklanabilir olmalıdır.)
6- partialLinkTex (tıklanabilir elementin linkinin bir bölümü kullamnılır)
7- xpath (Tüm elemenleri kolayca bulur. En çok bu kullanılır)
8- cssSelector (elementin css kodunna bakarak, aratabiliriz)

"id" varsa direk bunu kullan.
"xpath" zaten herkesi buluyor, diğerlerine lüzum yok. İçinde yazı barındıran elementleri daha kısa sürede çıkarırı. Yazı yoksa vakit alabilir bulması ama yine de bulur.
"css" yazı olmayan elemenlarda birazcık daha hızlı bulabilir, çok da önemli değil. xpath den şaşma.
Bunları driver üzerinden kullanacağız. Findelement yöntemini kullanacğız.
 **Her tıklanabilen link değildir. Tıklanabilen butonlar da vardır.
 **Link olduğunu tag isminden anlarız. "a" olmalı tag ismi "a element" ifadesi görülmeli kod içinde. Hemen başında "a" yazar.
 */


