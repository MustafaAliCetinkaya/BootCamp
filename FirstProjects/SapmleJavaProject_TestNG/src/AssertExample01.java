import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertExample01 {

    public static void main(String[] args) throws Exception{
        System.setProperty ("webdriver.chrome.driver","\"C:\\Users\\User\\Downloads\\Selenium\\ChromeDriver\\chromedriver.exe\"");
        WebDriver driver=new ChromeDriver ();
        driver.get("https://www.facebook.com/");
        System.out.println (driver.getTitle ());
        Thread.sleep(5000);
        driver.close();
    }

/*    @Test
    void logoTest() {
        WebElement logo = driver.findElement (By.xpath ("//*[@id=\"nav-logo-sprites\"]"));
        Assert.assertTrue (logo.isDisplayed (), "Logo not displayed on the page");
    }*/
}

//