package overRide;

public class Toyota extends Car{
    @Override//Bu şifre yazılmadan miras alınan aynı metodu burada yazıp değiştiremeyiz. Bunu yaz gerekiyorsa aynı metodu getir buraya kendin yapıştır.
    public void runCar() {//Miras aldığımız metodun içini değiştirmek için override ederiz. Aynı metodu burada da oluştururz
        //super.runCar();Bu kalıp ifadeyi Ctrl+space ile oluşturduk. Tüm sözcükler kendine ait.
        //Metodu manul ekendimizde yapıştırıp içini istediğimiz gibi değiştirebiliriz. Önemli olan başa  @Override yazmak.

        System.out.println("Our car's trademark is Toyota. We run Toyota!");
    }
}
