package oblectOrientedProgramming.oblectOrientedProgramming3;

public class Teacher {
    String teacherName = "Mustafa Çetinkaya";
    int age = 45;
    char gender = 'M';
    String schoolName = "Pınar College";
    String phoneNumber = "(505)-555-4505";
    boolean fullTime = true;
//Yukarıdaki bilgileri normalde tek tek bastırmıştık. Şimdi topluca tek seferde yazdırma yöntemine bakıyoruz.
    void WriteAllInfo() {//Public demesek de oluyor. Tüm bilgileri bir seferde yazdırma yöntemini kullanacağız.
        System.out.println("Teacher's name = " + teacherName);
        System.out.println("Teacher's age = " + age);
        System.out.println("Teacher's gender = " + gender);
        System.out.println("Teacher's school name = " + schoolName);
        System.out.println("Teacher's phone number = " + phoneNumber);
        System.out.println("Teacher's staff attribute = " + fullTime);
    }
}


