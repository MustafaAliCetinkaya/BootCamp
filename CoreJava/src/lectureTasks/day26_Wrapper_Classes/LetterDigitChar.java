package lectureTasks.day26_Wrapper_Classes;
/*Write a program that can retrieve the letters, digits and special
characters from the string*/
public class LetterDigitChar {
    public static void main(String[] args) {
        letterDigitChar( "Wooden Spoon!");

    }
    public static void letterDigitChar(String input){
        String digit="";
        String letter="";
        String character="";

        for(char each:input.toCharArray()){
            if (Character.isDigit(each))
                digit+=each;
            else if (Character.isLetter(each))
                     letter+=each;
            else {
                character+=each;
            }
        }
        System.out.println("Letters: "+"\""+letter+"\"");
        System.out.println("Digits: "+"\""+digit+"\"");
        System.out.println("SpecialChars ="+"\""+character+"\"");
    }
}
