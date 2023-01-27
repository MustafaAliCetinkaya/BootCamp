package reviewSessions.collection.setListOthers.canvasTask;

import java.util.ArrayList;

public class Canvas {
    // Finish the Canvas class
    String topic;
    ArrayList<Quiz> quizzes;
    ArrayList<Module> modules;

    public Canvas(String topic) {
        this.topic = topic;
        ArrayList<Quiz> quizzes=new ArrayList<>();
        ArrayList<Module> modules=new ArrayList<>();
    }

    public Canvas(String topic, ArrayList<Quiz> quizzes, ArrayList<Module> modules) {
        this.topic = topic;
        this.quizzes = quizzes;
        this.modules = modules;
    }

    @Override
    public String toString() {
        return  topic + "\n"+
                "Quizzes:" + "\n"+
                quizzes +"\n"+
                "Modules:" +"\n"+
                modules ;
    }
}