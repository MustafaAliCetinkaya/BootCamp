package definingStatic.staticCodeBlock;

public class Car {
    static int year=2022;//Hafızaya hemen class a ait bir bilgi olarak kaydedildi. İstenildiğinde class üzerinden ulaşılır. Nesne oluşturulmadan bu biilgi kullanılabilir.
    String trademark="Audi";

    static {
        year=2023;//Hafızaya işlenen bilgiyi istersek static olsa bile bu kod bloğu ile değiştirebiliriz. Block olayı bundan ibaret
    }

}
