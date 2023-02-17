package myInterviewPreperationQuestions.practiceIt;

public class CovertAnyStringToCamelCase {
    //Cucumber makes same thing automatically in the feature file (StepDefinition method names)
    public static void main(String[] args) {
        String text="This is a camel case converting test";

        System.out.println("camelCaseVersion: "+camelCaseConverter(text));
    }

    public static String camelCaseConverter(String str){
        String camelCaseVersion="";

        String[] eachWord=str.toLowerCase().split(" ");

        for (int i = 0; i < eachWord.length; i++) {

            if(i==0){
                camelCaseVersion+=eachWord[i];
            }else if(eachWord[i].length()==1){
                camelCaseVersion+=eachWord[i].toUpperCase();
            }else{
                camelCaseVersion+=eachWord[i].substring(0,1).toUpperCase();
                camelCaseVersion+=eachWord[i].substring(1,eachWord[i].length());
            }
        }
        
        return camelCaseVersion;
    }
}
