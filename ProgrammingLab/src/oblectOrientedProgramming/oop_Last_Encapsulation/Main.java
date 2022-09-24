package oblectOrientedProgramming.oop_Last_Encapsulation;
//Kodlama detaylarının saklanmasıdır, üzümünü ye bağını sorma hesabı: Ne yağtığını bilsin, hizmeti alsın, nasıl yaptığını kullanıcı bilmesin
public class Main {

    public static void main(String[] args) {
        Teacher object=new Teacher();
        //object.age=56; PRIVATE yaptığımızdan bu şekilde değişiklikler yapılamaz. Sadece metotlar aracılığıyla tanımlanan yerlere erişilebilir.
        System.out.println("object Branch = " + object.getBranch());
        System.out.println("object Age = " + object.getAge());
        System.out.println("object Salary = " + object.getSalary());
                

    }
}
