package officeHour.quizPreparation;

class Language {
    public void method() {
        System.out.print("0");
    }
}

public class Java extends Language {
    @Override
    public void method() {
        System.out.print("1");
    }
}

class Selenium extends Java {
    public void method() {
        System.out.print("2");
    }
}

class Main2 {
    public static void main(String[] args) {
        new Java().method();
        new Language().method();
        new Selenium().method();
    }

}