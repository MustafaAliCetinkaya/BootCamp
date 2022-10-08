package utilities;
//Driver ve ConfigReader TestNG ve Cucumber de aynı. İkisi de Maven da yapıldı. İkisi de Selenium kullanıyor. Cucumber da daha ayrıntılı seneryolar yazdığımız için anlaşılır ve herkes tercih ediyor.
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    /*Burada oluşturacağımız class ile "configuration.properties dosyasına gidilip browser/address bilgisi çekilecek.
    Her defasında kodlara browser ve addrsss girmek yerine bu şekilde yapılandırmacı bir yaklaşımla parçalı mimari oluşturuyoruz.
     */

    static Properties properties;//Nesne oluşturma işlemini başlattık, değerini aşağıda atıyoruz.

    static {//Static olarak tanımlanmasının sebebi javanın okurken ilk okuduğu yerlerin statik bloklar olması. Bunu hemen oluşturtup, ihtiyaç halinde hazır olsun, tekrar metotla istemeye gerek kalmasın diye baştan staticle çalıştırtıyoruz.
        String path = "configurations.properties";//Bu kod istediğimiz dosyayı bulmasını sağlıyor.
        FileInputStream file = null;

        try {
            file = new FileInputStream (path);//Bulmasını istediğimiz, path verdiğimiz dosyayı açmaya yarar bu yöntem.
            properties = new Properties ();//Yukarıda başlatılan nesne oluşturma süreci burada içine değer atanarak tamamlandı
            properties.load (file);//Üretilen nesnenin içine açtığımız dosyayı yükle
        } catch (IOException e) {
            e.printStackTrace ();
        }


    }

    public static String getProperty(String key) {//Artık herhangi bir yerden "ConfigurationReader.getProperty("browser/engineer/address" dediğimizde bu metotla içindeki bilgiyi chrome/mustafa vb şeklinde getirecek.
        return properties.getProperty (key);
    }
}

/*Static bölümü aşağıdaki şekilde de yazabilirdik ama olası hatalardan kaçınmak için try-catch yöntemiyle yazmak en sağlıklısı. O yüzden aşağıdaki gibi değil yukarda uygulanan şekliyle oldu.

static {//Static olarak tanımlanmasının sebebi javanın okurken ilk okuduğu yerlerin statik bloklar olması. Bunu hemen oluşturtup, ihtiyaç halinde hazır olsun, tekrar metotla istemeye gerek kalmasın diye baştan staticle çalıştırtıyoruz.
        String path = "configurations.properties";//Bu kod istediğimiz dosyayı bulmasını sağlıyor.
        FileInputStream file = new FileInputStream(path);//Bulmasını istediğimiz, path verdiğimiz dosyayı açmaya yarar bu yöntem.
        properties = new Properties();//Yukarıda başlatılan nesne oluşturma süreci burada içine değer atanarak tamamlandı
        properties.load(file);//Üretilen nesnenin içine açtığımız dosyayı yükle
        }*/

