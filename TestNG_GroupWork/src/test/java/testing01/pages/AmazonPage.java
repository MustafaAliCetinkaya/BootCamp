package testing01.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testing01.utilities.Driver;

public class AmazonPage {//Elementleri test içinde tek tek bulma acami işidir. Sayfalara özel (ana sayfa-cart-ödeme ekranı vb.) metot oluşturup kullanacağımız yerde çağırırız.

    public AmazonPage(){
        PageFactory.initElements (Driver.getDriver (),this);//PageFactory.initElement nedir diye mülakatta çıkabilir--> Pages paketi altında, herhangi bir class da webelement bulmak için kullanılır. "Page object model"-POM yöntemi denilen şey zaten budur.
    }
    @FindBy( id = "twotabsearchtextbox")//FindBy bir anotation dır. FindElement yönteminin kısa kolu.
    public WebElement searchbox;//Bu ikili yapı standarttır. İstediğimiz kadar oluşturabiliriz. Farklı farklı locator da kullanabiliriz.

    public void search (){
        searchbox.sendKeys ();
    }
}
