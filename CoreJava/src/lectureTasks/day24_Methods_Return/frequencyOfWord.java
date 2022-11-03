package lectureTasks.day24_Methods_Return;

public class frequencyOfWord {
    public static void main(String[] args) {
        String givenSentence="Java ah java, java? Yes java, loving java is awesome";
        String givenWord="Java";
        int frequency=frequency(givenSentence,givenWord);
        System.out.println(frequency);

    }
    public static int frequency(String sentence, String word){
        int count=0;
        for(int i=0; i<sentence.length()-4;i++){
            String each=sentence.substring(i,i+4);
            if(each.equalsIgnoreCase(word)){
                count++;
            }
        }return count;
    }
}
