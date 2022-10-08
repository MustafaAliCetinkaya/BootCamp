package pages;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {
    public AmazonPage() {
        PageFactory.initElements (Driver.getDriver (), this);
    }

    @FindBy(id = "twotabsearchtexbox")
    public WebElement searchBox;

    @FindBy (xpath="//h1//div/span")
    public WebElement resultNumber;
}