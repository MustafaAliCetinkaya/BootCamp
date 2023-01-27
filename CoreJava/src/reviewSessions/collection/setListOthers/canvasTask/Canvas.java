package reviewSessions.collection.setListOthers.canvasTask;

public class Canvas {
    // Finish the Canvas class
    String topic;
    int totalNumberOfQuestions;
    double totalPoints;

    public Canvas(String topic, int totalNumberOfQuestions, double totalPoints) {
        this.topic = topic;
        this.totalNumberOfQuestions = totalNumberOfQuestions;
        this.totalPoints = totalPoints;
    }

    public void  takeQuiz(){
        System.out.println("Taking the "+topic+" quiz");
    }

    @Override
    public String toString() {
        return "Quiz | " +
                topic + " quiz with " +
                totalNumberOfQuestions +" questions for a total of "+
                totalPoints +" total points";
    }
}