package lectureTasks.day26_Wrapper_Classes;
/*Write program that returns true if the total number of upper case
characters are equal to total number of Lowercase characters of a
string*/
public class Task3 {
    public static void main(String[] args) {
        String str = "JAVA java";
        int countUpper=0;
        int countLower=0;

        for (char each:str.toCharArray()){
            if(Character.isUpperCase(each)){
                countUpper++;
            } else if (Character.isLowerCase(each)) {
                countLower++;
            }
        }
        System.out.println((countLower==countUpper)?"true":"false");
    }
}
