package accessModifiers;

public class Private_AccessModifiers {
    int age=68;
    String name="Ali Can";
    private long identityNumber=98654785321L;//Private tanımladığımız için kimlik noya hiç kimse dışarıdan erişemeyecek.
    //Nesne oluşturduğumuzda object1.age/name yazırılabilir ama kimlik numarasına erişemez, teklif dahi etmez.
    //Sadece bu class içinden ereişime izin veriri. Yani public bir metotla buradan dışarıya yazdırabiliriz. Başka türlü olmaz.

    private void info(){
        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("identityNumber = " + identityNumber);
    }

    /*public void info2(){ Bu şekilde public tanımlansaydı içerideki kimlik no private bile olsa Mainden çağırdığımızda ekrana gelirdi.
        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("identityNumber = " + identityNumber);
    }*/
}


