package Reviews;

public class RemoveSpecificIndex {

    public static void main(String[] args) {
        /*
        Task 5: Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
input:
 String word="Adamm";
 int index=3;
 output:
 Adam
         */

        String word = "Adaxmm";
        int index = 3;

        String temp = "";

        {
            if (index >= word.length () || index < 0) {
                System.out.println ("this is not valid index");
            } else {

                for (int i = 0; i < word.length (); i++) {

                    if (i == index)
                        continue;

                    temp += word.charAt (i);

                }
                System.out.println (temp);
            }
        }
    }
}
