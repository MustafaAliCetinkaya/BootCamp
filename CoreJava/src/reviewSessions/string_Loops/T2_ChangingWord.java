package reviewSessions.string_Loops;


public class T2_ChangingWord {

    /*
    -- Task 2:  Write a program that replaces every occurrence of "cat" in the message with "dog", using indexOf and substring.

  input:

  String message = "I love cats! I have a cat named Coco. My cat's very smart!";

  output:

 "I love dogs! I have a dog named Coco. My dog's very smart!";
     */

    public static void main(String[] args) {
        // 7   10
        String message = "I love cats! I have a cat named Coco. My cat's very smart!";
        String searched = "cat";
        String changed = "dog";
        String result = "";
/*
We can easily do this
        String result1=message.replace(searched,changed);
        System.out.println("result1 = " + result1);

 */

        /*

        We can skip or delete  string or char by using substring
        String str="aM";
        String word="AdamMBary";
        int indexOfM = word.indexOf(str);
        //Adam
        word= word.substring(0,indexOfM) +word.substring(indexOfM+str.length());



         */

        int indexOfFirstCat = message.indexOf(searched);
        int endOfWord =indexOfFirstCat+searched.length();

        message=message.substring(0,indexOfFirstCat)+changed+message.substring(endOfWord);


        //we need to check th message contains cat or not

        while (message.contains(searched)){

            indexOfFirstCat = message.indexOf(searched);
            endOfWord =indexOfFirstCat+searched.length();
            message=message.substring(0,indexOfFirstCat)+changed+message.substring(endOfWord);


        }

        System.out.println("message = " + message);

        // if we have it I will change cat to dog


    }
}
