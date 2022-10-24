package lectureTasks.Day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] alphabets = new char[26];  //Z~A
        char[] alphabets2 = new char[26];  //Z~A

        /*        i     ch
        alphabets[0] = 'Z'; //90
        alphabets[1] = 'Y'; //89
        alphabets[2] = 'X'; //88
            ...
        */

        char ch = 'Z';
        for(int i = 0; i < alphabets.length; i++, ch-- ){
            alphabets[i] = ch;
            //ch--;Böyle de olabilir
        }

        char ch2 = 'a';
        for(int i = 0; i < alphabets2.length; i++, ch2++ ){
            alphabets2[i] = ch2;
            /*ch2++;
            For un içinde kafa karıştırıyorsa aşağıya da yazılabilir*/
        }

/*
        for(char i = 0, j = 'Z';  i < alphabets.length; i++, j-- ){
            alphabets[i] = j;
        }
*/

        //   System.out.println( alphabets );
        System.out.println( Arrays.toString(alphabets) ); // print the whole array
        System.out.println( Arrays.toString(alphabets2) ); // print the whole array
        //       System.out.println( alphabets[0] ); // printing the element of array




    }


}
