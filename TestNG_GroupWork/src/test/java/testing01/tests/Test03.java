package testing01.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import testing01.pages.AmazonPage;
import testing01.utilities.Driver;

public class Test03 {
    AmazonPage myAmazon = new AmazonPage ();

    @Test
    public void addDrop(){
        Driver.getDriver ().get ("https://www.amazon.com/ref=nav_logo");

        myAmazon.searchbox ("kız çocuk ayakkabı"+ Keys.ENTER);
        Driver.getDriver().findElement (By.xpath ("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div[1]/span/a/div/img")).click ();
       /* myAmazon.findout ("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div[2]/div[1]");*/
        myAmazon.add.click ();

        myAmazon.searchbox ("erkek hırka"+ Keys.ENTER);
        Driver.getDriver().findElement (By.xpath ("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div[1]/span/a/div/img")).click ();
        myAmazon.add.click ();
    }

}
