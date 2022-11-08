import org.testng.annotations.*;

public class TC_TestCase1 {

    @BeforeSuite
    void beforeSuite(){//Birbiriyle ilişklendirilen iki test çalışmadan önce bu çalışacak 1 defa. Hiyerarşinin en başında. İlk bu çalışır.
        System.out.println ("SUITE - This method must execute before \"test\" only once!!!");
    }//Bunu isteseysik TC2 de de yazabilirdik. Birleştirince yerinin önemi yok

    @BeforeTest
    void beforeTest(){//Birbiriyle ilişklendirilen iki test çalışmadan önce  2. sırada bu çalışacak 1 defa
        System.out.println ("BEFORE TEST - This method must execute before \"test\" only once!!!");
    }//Bunu isteseysik TC2 de de yazabilirdik. Birleştirince yerinin önemi yok

    @BeforeClass
    void beforeClass() {//Tüm class dan önce 1 defa çalışır
        System.out.println ("This method must execute before class only once!!!");
    }

    @AfterClass
    void afterClass() {//Tüm class dan sonra 1 defa çalışır
        System.out.println ("This method must execute after class only once!!!");
    }

    @BeforeMethod()
//Testlerden önce ve hemen sonra çalıştırılacak metotlar tanımlayabileceğimiz anotation lar da var. Sadece @Test yok, @Method şeklinde yazılan diğerlerine de dikkat et.
    void beforeMethod() {//Bu method aşağıdaki her mototdan önce bireysel olarak teker teker çalıştırılır.
        System.out.println ("This method must execute before every method one by one");
    }

    @AfterMethod
    void afterMethod() {//Aşağıdaki her testten sonra muhakkak birer birer bu metot çalıştırılır.
        System.out.println ("This method must execute \"after\" every method one by one");
    }

    @Test
    void test1() {
        System.out.println ("This is test1 ...");

    }

    @Test
    void test2() {
        System.out.println ("This is test2 ...");
    }
}
