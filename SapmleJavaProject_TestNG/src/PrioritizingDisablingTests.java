import org.testng.annotations.Test;
//Default olarak alfabetik sıraya göre çalıştırır. Biz öncelik sırası atayabiliriz. Bu metot "priority" meotudur.

public class PrioritizingDisablingTests {

    @Test (priority = 1)//Sıralama belirleyince istersen bunu en sona yaz, gene ilk çalışan olur.
    void TestOne(){
        System.out.println ("This is test-1");
    }

    @Test (priority = 2)//Bu sıralama 1 den başlamak zorunda değil. Karışık da olabilir. Küçük numara önce çalışır.
    void TestTwo(){
        System.out.println ("This is test-2");
    }

    @Test (priority = 3)
    void TestThree(){
        System.out.println ("This is test-3");
    }

    @Test (priority = 4, enabled = false)//enable=true olsa çalışır, false yapınca istersem aradaki birini durdurabilirim. Bu disable olur, diğerleri çalışır.
    void TestFour(){
        System.out.println ("This is test-4");
    }

}
