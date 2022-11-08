package oblectOrientedProgramming.oblectOrientedProgramming1;

public class Student1 {
    String studentName="Mustafa Çetinkaya";
    int age=36;
    char gender='M';
    String schoolName="METU";
    String phoneNumber="(505)-555-0505";
    boolean fullTime=true;

    public void likes(){
        System.out.println("I like playing football");//İstersek içlerine metotlar da koyabiliriz.
        System.out.println("I like playing chess");
    }

    public void dislikes(){
        System.out.println("I don't like playing basketball");
        System.out.println("I don't like playing tennis");
    }
}
