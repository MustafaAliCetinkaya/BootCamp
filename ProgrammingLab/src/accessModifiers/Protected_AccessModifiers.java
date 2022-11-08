package accessModifiers;

public class Protected_AccessModifiers {
    //Aynı paket içinden default gibi çağrılır, farklı paketler içinden çağrılamaz.
    //Ancak defaulttan farklı olarak başka paketlerden istisnai olarak miras alma(extends Class Adı) yoluyla çağrılabilir.

    int defaultNumber=456;
    private int privateNumber=800;
    protected int protectedNumber=980;



}
