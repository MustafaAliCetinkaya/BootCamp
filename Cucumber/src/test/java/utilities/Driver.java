package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
private Driver() {}
    static WebDriver driver;//Bu nesnenin içine veri atanması gerekiyor.

    public static WebDriver getDriver() {//Bu metotla artık herhangi bir yerden şöyle çağırabiliriz: "Driver.getDriver();"

        if (driver == null) {//Burada try-catch gibi olası sıkıntıların önüne manul olarak geçiyoruz. Driver null değilse hiç çalışmaz direk return bölümüne geçer.

            String browser= ConfigurationReader.getProperty("browser");

            switch (browser){//ConfigurationReader da başka ihtimaller bulunmasına karşın her browser türünü içerek ihtimalleri yazıyoruz.
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver ();//Chrome mu göremezse bile kendin kur kullan dedik
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver ();
                    break;

                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver=new InternetExplorerDriver ();
                    break;

                case "safari"://Bunu çağırmak birazcık farklı, aşağıda gösterildi.
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver=new SafariDriver();
                    break;
            }


        }
        return driver;
    }

    public static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
    /*
    //Yukarıdaki hazır class olmasa her defasında bu bilgileri tekrar tekrar yazmak gerekiyordu.
    Bunları tek class da bir defa yazarak istediğimiz vakit çağıracağız.
    Dışardan bir metota erişmek için "public static" olması gerekir. Bunu yapmazsak nesne oluşturmak gerekir.
     Nene oluşturmadan "Class Adı." nokta koyarak çağırmanın yolu public static tanımlanan metotla olur.*/

}
