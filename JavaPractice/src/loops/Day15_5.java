package loops;
import java.util.Scanner;

public class Day15_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println ("Please enter something. Does not matter");
        String something=input.nextLine ();
        int length=something.length ();
        String letters="";
        String numbers="";
        String specialchars="";
        for (int i = 0; i <length ; i++) {

            if ((something.charAt (i)>='a'&&something.charAt (i)<='z')||(something.charAt (i)>='A'&&something.charAt (i)<='Z')){
                letters+=something.charAt (i);
            }else if((something.charAt (i)>='0'&&something.charAt (i)<='9')){
                numbers+=something.charAt (i);
            }else {
                specialchars+=something.charAt (i);

            }
        }
        System.out.println ("letters: "+letters);
        System.out.println ("specialchars: "+specialchars);
        System.out.println ("numbers: "+numbers);
    }
}
