package officeHour.recepBySolvingProblems;


import static lectureTasks.day34_GarbageCollection_AccessModifiers.TestMathCircle.name;

public class Task13 {

    public static void main(String[] args) {
//        manualTesting("Ahmet");
//        manualTesting("Mehmet", "Google");
        System.out.println(returnDataBaseTesting());

    }

    public static void manualTesting(String name) {
        System.out.println(name + ", please test this manual test");
    }

    public static void manualTesting(String name, String projectName) {
        System.out.println(name + ", please test this " + projectName + " manual test");
    }

    public static void manualTesting(String name, String projectName, int time ) {
        System.out.println(name + ", please test this " + projectName + " manual test in " + time + " hour" );
    }
    public static void webAppTesting() {
        System.out.println("This is for web app testing");
    }

    public static void apiTesting() {
        System.out.println("This is for api  testing");
        String s = returnDataBaseTesting();
    }
    public static void dataBaseTesting() {
        System.out.println("This is for data base testing");

    }

    public static String returnDataBaseTesting(){
        System.out.println("this is database testing");
        return "This is for data base testing";


    }

    // we have 2 types of custom methods according to what they do
    // void type --> which is not returning anything, only do a certain action
    // data type method --> which is returning a data




}
