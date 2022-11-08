package basicsReplit;

public class Loops12 {
    public static void main(String[] args) {
        String[] array = {"ali", "ahmet", "mehmet", "mustafa", "ali", "mustafa", "mehmet"};
        String word = "ali";

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(word)) {
                System.out.println("Yes, we have " +"\"" +word+"\""+" in the string");
            }
            break;//Buraya berak koymazsak içerde kaç tane aliden varsa o kadar evet vardır yazdırır.
        }
    }


}

