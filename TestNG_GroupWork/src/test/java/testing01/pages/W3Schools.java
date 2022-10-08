package testing01.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testing01.utilities.Driver;

import java.util.List;

public class W3Schools {

    public W3Schools(){
        PageFactory.initElements (Driver.getDriver (),this);
    }

    @FindBy(xpath = "(//table)[1]//th")
    public List<WebElement> headers;
}
