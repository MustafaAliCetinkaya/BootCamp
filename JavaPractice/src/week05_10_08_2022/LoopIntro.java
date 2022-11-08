package week05_10_08_2022;

public class LoopIntro {


    public static void main(String[] args) {
        // if we repeat one action more than one we can use loop in here we will learn for loop

        String str = "0123456"; // the last index is str.length()-1

        str.charAt(0); // get the  first char
        str.charAt(1); // get the second char
                         //index<=str.length()-1
        for (int index=0;index<str.length();index++){
            System.out.println(str.charAt(index));
        }
        // write the numbers from 0 to 100
        for (int i=0;i<=100;i++){
            System.out.println(i);
        }

        //write the even numbers from 0 to 100 is included
        for (int i=0;i<=100;i+=2){
            System.out.println(i);
        }
      //fori is the shortcut
        //write the odd numbers from 1 to 99 is included
        for (int i = 1; i <=99 ; i+=2) {
            System.out.println(i);
        }
        // itar is shortcut

        // write the numbers from 100 to 0
        System.out.println("===========================");
        for (int i = 100; i >=0 ; i--) {
            System.out.println(i);
        }







    }
}
