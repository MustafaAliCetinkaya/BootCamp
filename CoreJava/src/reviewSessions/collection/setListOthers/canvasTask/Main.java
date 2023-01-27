package reviewSessions.collection.setListOthers.canvasTask;

import lectureTasks.day42_Exceptions.Quiz;

import java.io.File;
import java.util.*;
class Main {
    public static void main(String[] args) {

      // DO Not Touch Anything here

        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine();
        switch (test) {
            case 1: // Test the Quiz class
                Quiz quiz = new Quiz(input.nextLine(), input.nextInt(), input.nextDouble());
                quiz.takeQuiz();
                System.out.println(quiz);
                break;
            case 2: // Test the File class
                File file = new File(input.nextLine(), input.nextDouble());
                file.openFile();
                System.out.println(file);
                break;
            case 3: // Test the Module class
                Module module;
                switch (input.nextLine()) {
                    case "empty":
                        module = new Module("Day 1: Intro");
                        System.out.println(module);
                        break;
                    case "with":
                        module = new Module("Day 2: Intro", easyFiles());
                        System.out.println(module);
                        break;
                    case "add":
                        module = new Module("Office Hours", easyFiles());
                        module.addFile(new File(input.nextLine(), input.nextDouble()));
                        System.out.println(module);
                        break;
                    case "remove":
                        module = new Module("Hello World", easyFiles());
                        module.removeFile(new File("Programming.pdf", 1.54));
                        System.out.println(module);
                        break;
                }
                break;
            case 4: // Test the Canvas class
                Canvas canvas;
                switch (input.nextLine()) {
                    case "empty":
                        canvas = new Canvas("Java");
                        System.out.println(canvas);
                        break;
                    case "with":
                        canvas = new Canvas("Automation", easyQuizzes(), easyModules());
                        System.out.println(canvas);
                        break;
                    case "add":
                        canvas = new Canvas("Automation", easyQuizzes(), easyModules());
                        canvas.modules.get(0).addFile(new File(input.nextLine(), input.nextDouble()));
                        System.out.println(canvas.modules);
                        break;
                }

        }

    }

    public static ArrayList<File> easyFiles() {
        ArrayList<File> files = new ArrayList<>();
        files.add(new File("Day 2 Notes", 0.92));
        files.add(new File("Programming.pdf", 1.54));
        return files;
    }

    public static ArrayList<Quiz> easyQuizzes() {
        ArrayList<Quiz> quizzes = new ArrayList<>();
        quizzes.add(new Quiz("If statement", 10, 10));
        quizzes.add(new Quiz("String", 8, 8));
        quizzes.add(new Quiz("Loops", 12, 15));
        return quizzes;
    }

    public static ArrayList<Module> easyModules() {
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(new Module("Html", new ArrayList<>(Arrays.asList(new File("html notes", 1.2)))));
        modules.add(new Module("Locators", new ArrayList<>(Arrays.asList(new File("Examples", 2.3), new File("Automation Intro.pdf", 3.1)))));
        return modules;
    }
}