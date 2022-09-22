package consructorChain;

public class Car {

    int velocity=240;
    String trademark="Audi";

    public Car() {
        this(320);//Önce buradan tek int içeren 2. consructor a gider. This i görünce işaret ettiği yere atlar hemen
        System.out.println("Ben normalde birinci sıradaydım.\nBuradaki This en üstte olmalı.\nAşağı yazarsak hata verir çalışmaz.\nÖnce This işleme alınır sonra bu yazı ");

    }

    public Car(int newVelocity) {
        this("Mercedes");//This aşağıyı işaret ettiği için oraya gider. Sonra döner buranın aşağısını yazdırır
        velocity = newVelocity;
        System.out.println("Ben normalde de ikinci sıradaydım");
    }

    public Car(String newTrademark){
        System.out.println("Burası normalde 3. sıradaydı. ");
    }


}
