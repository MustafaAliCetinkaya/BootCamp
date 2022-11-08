package interfaceVsAbstract;

public class Main {
    public static void main(String[] args) {
        Mercedes benz = new Mercedes();//Nesne üretilen tek yer Mercedes calss ıdır. Çünkü diğerleri abstract ve interface.
        benz.run();
        benz.information();
    }
}
/*Abstract ve Interface özellikleri:
1- İkisinden de nesne oluşturulamaz.
2- İkinde de abstract metotlar yer alır.
3- İkindedeki metotlar da override edilemk zorunda.
4- Interface içindeki metotlar önünde abstract yazmasa bile abstracttır. Biz istersek elimizde açıkça da yazabiliriz ama default durumda yazmaz. Bu nedenle muhakka kullanılmak zorunda.
5- Abstract class içine abstract olmayan metotlar da yazılabiliyor. Bu nedenle override edilmek zorunda olmayanlar da var.
6- Çok benzerler. Nerede hangisi kullanılacak. EN TEMEL FARKLAR:
a- extend ile miras alınan üst soy olarak tanımlanır.
b- implement ile miras aşınan interface onun üst soyu değil sadece yetenekleri manasına gelir. Features bu anlamda kullanıldı.
c- Sadece bir üst soy (ABSTRACT) olur ama birden fazla yetenek (INTERFACE) bulunabilir.
 */