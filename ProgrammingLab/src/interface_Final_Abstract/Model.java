package interface_Final_Abstract;

public interface Model {
    void modelInfo();
}
// Burada void<==>final takası yapsaydık, yani metodu final diye tanımlasaydık ToyotaCar da "override" edilemezdi.
// Calss da "public final interface" diye tanımlasaydık ToyotaCar tarafından miras alınamazdı.
// Bir değişkeni "final int" veya "final String" diye tanımlarsak da değişiklik yapılamaz.
// Yani final sayesinde hem güvenlik sağlanır, erişime kapalı olduğu için de bilgilerin sabit kalması sağlanır.