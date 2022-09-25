package overRide;//Miras verenin özelliğini ezip geçip kendimiz üzerinde  değişiklik yapabilir.
//Miras alınan metot override imzası değişmeden, yani parametre eklenmeden kullanılmalıdır.
public class Main {
    public static void main(String[] args) {
        Toyota car = new Toyota();
        car.runCar();//Burayı override ederek içeriğini değiştirdik.Başka bir araç olsaydı ve override yapmasaydı o zaman miras verendeki ifade aynen yazılırdı.
        car.useCar();//Burayı doğrudan miras aldığımız soya yazmıştık. Aynen geçti.

        //Abstractaki abstract metotlar override edilmek ZORUNDA. Çünkü BODY bölümü yok. Miras alan her class mecbur override ile body oluşturmak zorunda.
        //Fakat kendimiz commonFeature classından isteğimiz için override ederiz, istemediğimiz metodun orijinal halini kullanır.

    }
}
