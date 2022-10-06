package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonSearchStepDefinitions {
AmazonPage amazonPage=new AmazonPage ();//AmazonPage class ından bir nesne oluşturarak arama bölümüne yazdırılacak ifadeyi daha kısa tekrar etmeden yapacağız. Nesne en üstte oluştu. İkinci adımda kullanacağız.

    @Given("user goes to the amazon page")
    public void user_goes_to_the_amazon_page() {
        Driver.getDriver ().get ("https://www.amazon.com/");

    }
    @Given("user writes iphone to the search box")
    public void user_writes_iphone_to_the_search_box() {
        amazonPage.searchBox.sendKeys ("Iphone"+ Keys.ENTER);

    }
    @Then("user writes the result number to the screen")
    public void user_writes_the_result_number_to_the_screen() {
        String showResultNumber="";
        showResultNumber=""+amazonPage.resultNumber.getText ();
        System.out.println (showResultNumber);

    }
}
