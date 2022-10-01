package testing01.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testing01.utilities.Driver;
import testing01.utilities.ReusableMethods;

import java.util.List;

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
        WebElement serachbox=Driver.getDriver ().findElement (By.id ("twotabsearchtextbox"));
        serachbox.sendKeys ("game chairs");//Yazı eklemek selenium da sendKeys ile yapılır

        Driver.getDriver ().navigate ().to ("https://www.amazon.com/BENGOO-High-Precision-Adjustable-Programmable-Ergonomic/dp/B09TRB877L/ref=sr_1_1?keywords=WebElement+mouse%3DDriver.getDriver+%28%29.findElement+%28By.partialLinkText+%28%22BENGOO+Gaming+Mouse+Wired%2C+USB+Optical+Computer+Mice+with+RGB+Backlit%2C+4+Adjustable+DPI+Up+to+3600%2C+Ergonomic+Gamer+Laptop+PC+Mouse+with+6+Programmable+Buttons+for+Windows+7%2F8%2F10%2FXP+Vista+Linux+-Black%22%29%29%3B&qid=1664639575&qu=eyJxc2MiOiItMC4wMSIsInFzYSI6IjAuMDAiLCJxc3AiOiIwLjAwIn0%3D&sr=8-1");
        WebElement mouse=Driver.getDriver ().findElement (By.tagName ("h1"));
        String tagname=mouse.getText ();//Oradaki yazıyı kopyalamak ise getText ile yapılır.
        System.out.println (tagname);

        List<WebElement> links=Driver.getDriver().findElements(By.tagName ("a"));//BüTün linklerli bir liste içine attık ve aşağıda bu listeyi bastıracağız:
        for (WebElement element:links){
            System.out.println (element.getText ());
        }

        Driver.getDriver().close();//Kapatma talimatı.


    }

}


