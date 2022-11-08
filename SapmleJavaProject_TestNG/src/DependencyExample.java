import org.testng.Assert;
import org.testng.annotations.Test;
//Birbirine zincirleme bağlı olan işlemleri "dependsOnMethods={"   "}" yöntemiyle bağlantılı yaptık. Baştaki hata verince hepsi zincirleme "Test ignored." hatası verecek

public class DependencyExample {
    @Test
    void startCar() {
        System.out.println ("Car started");
        Assert.fail ();//Bilerek buraya hata kodu girdik, bağlı metotlar da "Test ignored." hatası vererek çalışmayacak bu durumda
    }

    @Test (dependsOnMethods={"startCar"})//Aracın  sürülebilmesi için önce çalıştırılması gerekir. Yani ikinci birinciye bağlı, önce çalışacak ki sürülebilsin
    void driveCar() {
        System.out.println ("Car driving");
    }

    @Test (dependsOnMethods={"driveCar"})
    void stopCar() {
        System.out.println ("Car stopped");
    }

    @Test (dependsOnMethods={"driveCar", "stopCar"}, alwaysRun = true)//Birbirine bağlı bile olsa "alwaysRun = true" yöntemiyle mutlaka çalışır. Diğer bağlı olanlar "Test ignored." demeye devam eder.
    void parkCar() {
        System.out.println ("Car parked");
    }
}
