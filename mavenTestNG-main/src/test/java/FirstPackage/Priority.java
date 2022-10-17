package FirstPackage;

import org.testng.annotations.Test;

public class Priority {

    @Test(priority = 3)
    public void test01(){
        System.out.println("Test 01");
    }

    @Test(priority = -3)
    public void test02(){
        System.out.println("Test 02");
    }
    @Test
    public void test03(){
        System.out.println("Test 03");
    }
}
