package oblectOrientedProgramming.oop_Last_Encapsulation2;
//GET-SET metoduyla private access modifier a sahip değişkenlere önce erişir, sonra set yöntemiyle değerini değiştirebiliriz.
//Neden baştan public yapmıyoruz da prikobat gibi önce saklayıp sonra bir de erişmeye çalışıyoruz: Güvenlik Nedeniyle.
//Bu şekilde hem bilgi güvenli hem de dışarıdan veri değişimi bizim koyacağımız şartlara bağlı.
public class Worker {
    private long salary=8000;
    private int age=51;
    private String name="Bill Gates";
    private long identityNumber=10023689547L;

    public long getSalary() {//Bu metotla maaşa erişir, main den maaşı yazdırır ama değerini değştiremez. "get" ifadesi yerine başka kelime kullansak da olur ama adetten olduğu için başına "get+variable" şeklinde isimlendirilir.
        return salary;
    }

    public void setSalary(long salary) {//set yerine başka isim de olurdu. adetten olduğu için set deriz. Veri değiştirmeye yarar.
        this.salary=salary ;
    }

    public String getName(){
        return name;
    }
}
