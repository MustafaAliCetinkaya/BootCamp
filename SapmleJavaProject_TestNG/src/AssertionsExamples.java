import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExamples {

    WebDriver driver;
    @BeforeClass
    void setup() {
        System.setProperty ("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver ();
        driver.get ("https://www.amazon.com/");
    }

    @Test
    void logoTest() {
        WebElement logo = driver.findElement (By.xpath ("//*[@id=\"nav-logo-sprites\"]"));
        Assert.assertTrue (logo.isDisplayed (), "Logo not displayed on the page");
    }
}
