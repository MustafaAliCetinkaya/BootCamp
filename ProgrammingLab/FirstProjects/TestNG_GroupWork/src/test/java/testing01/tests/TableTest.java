package testing01.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testing01.pages.W3Schools;
import testing01.utilities.Driver;

public class TableTest {

    W3Schools schools=new W3Schools ();

    @Test public void allHeaders(){
        String url="https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver ().get (url);
        //List şeklinde data geleceği için, bunun içindeki tüm elementlere for yada foreach ile bakacağız.

        for (WebElement element : schools.headers){ //başlıklardaki herşeyi webelement e dönüştür ve elemente ata. Sonra ayrı ayrı liste şeklinde yaz diyoruz.
            System.out.println (element.getText ());
        }
    }
}
