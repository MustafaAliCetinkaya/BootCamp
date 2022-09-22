package oblectOrientedProgramming.oop_Last_Encapsulation;

public class Teacher {
    //Değişkenlerimizi PRIVATE tanımlayarak bilgileri korunaklı hale gtiririz. Sadece istediklerimize metotlarla ulaşabiliriz.
    //Metot tanımlayarak erişime açılır ama değişkenin değeri kesinlikle değiştirilemez.
    private int salary=6500;
    private int age=34;
    private String name;
    private String branch;
    private long identityNumber=45698725321L;

    public int getSalary() {//Bu metotla maaşa erişir, main den maaşı yazdırır ama değerini değştiremez.
        return salary;
    }

    public int getAge() {//Mainden buraya bağlanır, burası aracılığıyla age e ulaşır.
        return age;
    }

    public String getBranch() {//Bu metot aracılığıyla mainden branch bilgisi çekilir. AMMA METODU OLMAYAN KİMLİK NO ÇEKİLEMEZ
        return branch;
    }
}

