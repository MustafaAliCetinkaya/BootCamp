import java.util.Scanner;

public class Lessons {
    Scanner scan = new Scanner(System.in);
    String lessonName;
    int lessonLenght;

    Student student;
    Lessons lessons;


    public boolean getLesson() {
        return true;
    }

//constructor- getter-setter


    public Lessons(String lessonName, int lessonLenght) {
        super();
        this.lessonName = lessonName;
        this.lessonLenght = lessonLenght;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getLessonLenght() {
        return lessonLenght;
    }

    public void setLessonLenght(int lessonLenght) {
        this.lessonLenght = lessonLenght;
    }
}

