import org.testng.annotations.*;

public class TC_TestCase2 {

    @AfterSuite
    void afterSuite(){//Birbiriyle ilişklendirilen iki test çalışmadan önce bu çalışacak 1 defa. Hiyerarşinin en başında. İlk bu çalışır.
        System.out.println ("SUITE - This method must execute after \"test\" only once!!!");
    }//Bunu isteseysik TC2 de de yazabilirdik. Birleştirince yerinin önemi yok

    @AfterTest
    void afterTest(){//Birbiriyle ilişklendirilen iki test çalışmadan önce 2. sırada bu çalışacak 1 defa
        System.out.println ("AFTER TEST - This method must execute after \"test\" only once!!!");
    }//Bunu isteseysik TC1 de de yazabilirdik. Birleştirince yerinin önemi yok

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
    void test3() {
        System.out.println ("This is test3 ...");

    }

    @Test
    void test4() {
        System.out.println ("This is test4 ...");
    }
}
